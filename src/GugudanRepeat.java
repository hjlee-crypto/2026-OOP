import java.util.Scanner;

public class GugudanRepeat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startDan;
        int endDan;
        int columnCount;
        int groupEnd;
        String answer = "y";

        while (answer.equalsIgnoreCase("y")) {
            System.out.print("start 단? ");
            startDan = scanner.nextInt();

            System.out.print("end 단? ");
            endDan = scanner.nextInt();

            System.out.print("가로 출력 개수? ");
            columnCount = scanner.nextInt();

            System.out.println();

            // 단을 columnCount개씩 묶어서 출력
            for (int groupStart = startDan;
                 groupStart <= endDan;
                 groupStart += columnCount) {

                groupEnd = Math.min(
                        groupStart + columnCount - 1,
                        endDan
                );

                // 각 묶음의 단 제목 출력
                for (int dan = groupStart; dan <= groupEnd; dan++) {
                    System.out.printf("%-14s", dan + "단");
                }
                System.out.println();

                // 구구단 출력
                for (int number = 1; number <= 9; number++) {
                    for (int dan = groupStart; dan <= groupEnd; dan++) {
                        System.out.printf(
                                "%d × %d = %-4d",
                                dan, number, dan * number
                        );
                    }
                    System.out.println();
                }

                System.out.println();
            }

            System.out.print("계속하시겠습니까? (y/n) ");
            answer = scanner.next();
            System.out.println();
        }

        System.out.println("프로그램을 종료합니다.");
        scanner.close();
    }
}