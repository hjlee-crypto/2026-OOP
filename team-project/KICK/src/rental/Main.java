package rental;

import rental.model.Bicycle;
import rental.model.Kickboard;
import rental.model.Member;
import rental.service.RentalService;
import rental.ui.ConsoleUI;

public class Main {
    public static void main(String[] args) {
        RentalService service = new RentalService();
        service.addMember(new Member("M1", "정재부"));
        service.addMember(new Member("M2", "오찬영"));
        service.addVehicle(new Bicycle("B-01"));
        service.addVehicle(new Kickboard("K-01", 60));
        service.addVehicle(new Kickboard("K-02", 15));
        new ConsoleUI(service).run();
    }
}
