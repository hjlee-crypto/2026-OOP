package rental;

import rental.model.Bicycle;
import rental.model.ElectricBicycle;
import rental.model.Kickboard;
import rental.model.Member;
import rental.service.RentalService;
import rental.ui.ConsoleUI;

// 프로그램 시작점: 시연용 기본 데이터를 넣고 콘솔 화면을 실행한다
public class Main {
    public static void main(String[] args) {
        RentalService service = new RentalService();

        service.registerMember(new Member("M1", "정재부"));
        service.registerMember(new Member("M2", "오찬영"));

        service.registerVehicle(new Bicycle("B-01"));
        service.registerVehicle(new ElectricBicycle("E-01", 80));
        service.registerVehicle(new Kickboard("K-01", 60));
        service.registerVehicle(new Kickboard("K-02", 15));   // 배터리 부족 시연용

        new ConsoleUI(service).run();
    }
}
