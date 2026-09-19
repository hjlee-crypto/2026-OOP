import java.util.Scanner;

public class GugudanInOut {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("start 단? ");
        int startDan = scanner.nextInt();

        System.out.print("end 단? ");
        int endDan = scanner.nextInt();

        System.out.print("가로 출력 개수? ");
        int columnCount = scanner.nextInt();

        // ① 단 묶음 반복
        for (int groupStart = startDan;
             groupStart <= endDan;
             groupStart += columnCount) {

            int groupEnd = Math.min(
                    groupStart + columnCount - 1,
                    endDan
            );

            // 단 제목 출력
            for (int dan = groupStart; dan <= groupEnd; dan++) {
                System.out.printf("%-12s", dan + "단");
            }
            System.out.println();

            // ② 곱하는 수 반복
            for (int number = 1; number <= 9; number++) {

                // ③ 현재 묶음의 각 단 반복
                for (int dan = groupStart; dan <= groupEnd; dan++) {
                    System.out.printf(
                            "%d × %d = %-3d ",
                            dan, number, dan * number
                    );
                }
                System.out.println();
            }

            System.out.println();
        }

        scanner.close();
    }
}