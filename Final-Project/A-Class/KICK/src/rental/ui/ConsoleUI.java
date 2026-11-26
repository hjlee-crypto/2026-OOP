package rental.ui;

import rental.model.Vehicle;
import rental.service.RentalService;

import java.util.Scanner;

// 입력과 출력만 담당
public class ConsoleUI {
    private final RentalService service;
    private final Scanner scanner = new Scanner(System.in);

    public ConsoleUI(RentalService service) {
        this.service = service;
    }

    public void run() {
        while (true) {
            System.out.println();
            System.out.println("1. 기기 목록  2. 대여  3. 반납  0. 종료");
            System.out.print("선택> ");
            String menu = scanner.nextLine().trim();
            switch (menu) {
                case "1" -> {
                    for (Vehicle v : service.getVehicles()) System.out.println(v);
                }
                case "2" -> {
                    System.out.print("회원번호> ");
                    String memberId = scanner.nextLine().trim();
                    System.out.print("기기번호> ");
                    String vehicleId = scanner.nextLine().trim();
                    System.out.println(service.rent(memberId, vehicleId));
                }
                case "3" -> {
                    System.out.print("회원번호> ");
                    String memberId = scanner.nextLine().trim();
                    System.out.print("이용 시간(분)> ");
                    int minutes = Integer.parseInt(scanner.nextLine().trim());  // 숫자가 아니면 오류: 13주차 예외 처리 예정
                    System.out.println(service.giveBack(memberId, minutes));
                }
                case "0" -> {
                    System.out.println("종료합니다.");
                    return;
                }
                default -> System.out.println("메뉴를 다시 선택하세요.");
            }
        }
    }
}
