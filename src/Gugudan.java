
public class Gugudan {
    public static void main(String[] args) {

        int startDan = 2;
        int endDan = 9;
        int columnCount = 2;

        // ① 단 묶음 반복
        for (int groupStart = startDan;  groupStart <= endDan;  groupStart += columnCount) {
            // ② 곱하는 수 반복
            for (int number = 1; number <= 9; number++) {
                // ③ 현재 묶음의 각 단 반복
                for (int dan = groupStart; dan <= (groupStart+1); dan++) {
                    System.out.printf( "%d × %d = %-3d ",
                                                 dan, number, dan * number
                    );
                } // ③ 현재 묶음의 각 단 반복  end
                System.out.println();
            }// ② 곱하는 수 반복 end
            System.out.println();
        }//① 단 묶음 반복 for end

    }//main() end
}//class  end