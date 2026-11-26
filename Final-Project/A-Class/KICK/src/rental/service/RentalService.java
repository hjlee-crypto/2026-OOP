package rental.service;

import rental.exception.NotFoundException;
import rental.exception.RentalException;
import rental.model.Member;
import rental.model.Vehicle;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

// 회원·기기를 보관하고 대여·반납 흐름을 처리한다.
// 입력과 출력은 하지 않는다 (ConsoleUI가 담당).
public class RentalService {
    private final Map<String, Member> members = new LinkedHashMap<>();
    private final Map<String, Vehicle> vehicles = new LinkedHashMap<>();

    // ---------- 등록 ----------
    public void registerMember(Member member) {
        if (members.containsKey(member.getId())) {
            throw new RentalException("이미 등록된 회원번호입니다: " + member.getId());
        }
        members.put(member.getId(), member);
    }

    public void registerVehicle(Vehicle vehicle) {
        if (vehicles.containsKey(vehicle.getId())) {
            throw new RentalException("이미 등록된 기기번호입니다: " + vehicle.getId());
        }
        vehicles.put(vehicle.getId(), vehicle);
    }

    // ---------- 조회 ----------
    public Member findMember(String memberId) {
        Member member = members.get(memberId);
        if (member == null) {
            throw new NotFoundException("회원", memberId);
        }
        return member;
    }

    public Vehicle findVehicle(String vehicleId) {
        Vehicle vehicle = vehicles.get(vehicleId);
        if (vehicle == null) {
            throw new NotFoundException("기기", vehicleId);
        }
        return vehicle;
    }

    public List<Member> getMembers() {
        return new ArrayList<>(members.values());
    }

    // 기기 번호 순으로 정렬한 목록
    public List<Vehicle> getVehicles() {
        List<Vehicle> list = new ArrayList<>(vehicles.values());
        list.sort(Comparator.comparing(Vehicle::getId));
        return list;
    }

    // ---------- 대여·반납 ----------
    public void rent(String memberId, String vehicleId) {
        Member member = findMember(memberId);
        if (member.isRenting()) {
            throw new RentalException(member.getName() + "님은 이미 " + member.getCurrent().getId() + " 기기를 대여 중입니다.");
        }
        Vehicle vehicle = findVehicle(vehicleId);
        vehicle.rent();                 // 다형성: 전기 기기는 배터리 검사까지 실행된다
        member.startRental(vehicle);
    }

    // 반납하고 요금을 돌려준다
    public int giveBack(String memberId, int minutes) {
        if (minutes <= 0) {
            throw new RentalException("이용 시간은 1분 이상이어야 합니다.");
        }
        Member member = findMember(memberId);
        if (!member.isRenting()) {
            throw new RentalException(member.getName() + "님은 대여 중인 기기가 없습니다.");
        }
        Vehicle vehicle = member.getCurrent();
        vehicle.giveBack(minutes);                  // 전기 기기는 배터리가 줄어든다
        member.endRental();
        return vehicle.calculateFee(minutes);       // 다형성: 실제 기기의 요금표로 계산
    }
}
