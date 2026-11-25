package rental.service;

import rental.model.Kickboard;
import rental.model.Member;
import rental.model.Vehicle;

import java.util.ArrayList;
import java.util.List;

// 대여·반납 흐름 담당
// 1차 버전: ArrayList에서 for문으로 검색, 실패하면 메시지 문자열을 돌려줌
// (12주차에 Map 검색 + 사용자 정의 예외로 개선 예정)
public class RentalService {
    private final List<Member> members = new ArrayList<>();
    private final List<Vehicle> vehicles = new ArrayList<>();

    public void addMember(Member m) { members.add(m); }
    public void addVehicle(Vehicle v) { vehicles.add(v); }
    public List<Vehicle> getVehicles() { return vehicles; }

    private Member findMember(String id) {
        for (Member m : members) if (m.getId().equals(id)) return m;
        return null;
    }

    private Vehicle findVehicle(String id) {
        for (Vehicle v : vehicles) if (v.getId().equals(id)) return v;
        return null;
    }

    public String rent(String memberId, String vehicleId) {
        Member m = findMember(memberId);
        if (m == null) return "없는 회원입니다.";
        if (m.getCurrent() != null) return "이미 대여 중인 기기가 있습니다.";
        Vehicle v = findVehicle(vehicleId);
        if (v == null) return "없는 기기입니다.";
        if (v.isRented()) return "이미 대여 중인 기기입니다.";
        if (v instanceof Kickboard && ((Kickboard) v).getBattery() < 20) return "배터리가 부족합니다.";
        v.rent();
        m.setCurrent(v);
        return m.getName() + "님 " + v.typeName() + " " + v.getId() + " 대여 완료";
    }

    public String giveBack(String memberId, int minutes) {
        Member m = findMember(memberId);
        if (m == null) return "없는 회원입니다.";
        Vehicle v = m.getCurrent();
        if (v == null) return "대여 중인 기기가 없습니다.";
        v.giveBack();
        m.setCurrent(null);
        int fee = v.calculateFee(minutes);   // 다형성: 실제 객체의 요금 계산이 실행됨
        return v.typeName() + " " + v.getId() + " 반납, " + minutes + "분 이용, 요금 " + fee + "원";
    }
}
