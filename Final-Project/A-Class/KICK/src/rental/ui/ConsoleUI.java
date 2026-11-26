package rental.ui;

import rental.exception.RentalException;
import rental.model.Rental;
import rental.model.Vehicle;
import rental.service.RentalService;

import java.util.List;
import java.util.Scanner;

// 콘솔 입력과 출력만 담당한다. 업무 규칙은 RentalService와 model이 처리한다.
public class ConsoleUI {
    private final RentalService service;
    private final Scanner scanner = new Scanner(System.in);

    public ConsoleUI(RentalService service) {
        this.service = service;
    }

    public void run() {
        System.out.println("=== 공유 킥보드·자전거 대여 시스템 ===");
        while (true) {
            printMenu();
            String menu = readLine("선택> ");
            if (menu.equals("0")) {
                System.out.println("프로그램을 종료합니다.");
                return;
            }
            try {
                handle(menu);
            } catch (RentalException e) {           // 업무 오류: 메시지만 보여주고 계속 진행
                System.out.println("[오류] " + e.getMessage());
            }
        }
    }

    private void printMenu() {
        System.out.println();
        System.out.println("1.기기 목록  2.대여  3.반납  4.이용 내역  0.종료");
    }

    private void handle(String menu) {
        switch (menu) {
            case "1": showVehicles(); break;
            case "2": rent(); break;
            case "3": giveBack(); break;
            case "4": showHistory(); break;
            default: System.out.println("메뉴 번호를 다시 입력하세요.");
        }
    }

    private void showVehicles() {
        List<Vehicle> vehicles = service.getVehicles();
        System.out.println("--- 기기 목록 (" + vehicles.size() + "대) ---");
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle);    // 기기마다 오버라이딩한 toString()이 호출된다
        }
    }

    private void rent() {
        String memberId = readLine("회원번호> ");
        String vehicleId = readLine("기기번호> ");
        service.rent(memberId, vehicleId);
        Vehicle vehicle = service.findVehicle(vehicleId);
        System.out.println("대여 완료: " + vehicle.typeName() + " " + vehicle.getId());
    }

    private void giveBack() {
        String memberId = readLine("회원번호> ");
        int minutes = Integer.parseInt(readLine("이용 시간(분)> "));
        Rental rental = service.giveBack(memberId, minutes);
        System.out.println("반납 완료: " + rental);
    }

    private void showHistory() {
        List<Rental> history = service.getHistory();
        System.out.println("--- 이용 내역 (" + history.size() + "건) ---");
        for (Rental rental : history) {
            System.out.println(rental);
        }
        System.out.println("매출 합계: " + service.getTotalSales() + "원");
    }

    // ---------- 입력 도우미 ----------
    private String readLine(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine().trim();
    }
}
