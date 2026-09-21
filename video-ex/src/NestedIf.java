import java.util.Scanner;
public class NestedIf {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("점수를 입력하세요(0~100): ");
		int score = scanner.nextInt(); 

		System.out.print("학년을 입력하세요(1~4): ");
		int year = scanner.nextInt();

        String resultStr;

        if(year == 4 ){ //4학년 경우
            if(score >= 70) {
                resultStr = "합격!";
            } else {
                resultStr = "불합격!";
            }
        }else{ // 4학년이 아닌 경우
            if(score >= 65) {
                resultStr = "합격!";
            } else {
                resultStr = "불합격!";
            }
		}

        System.out.println(year+"학년, "+score+"점 이므로 "+resultStr+"입니다.");
        System.out.println("end");

        if(year == 4 && score >= 70){ //4학년 경우
            resultStr = "합격!";
        }else if((year >= 1 && year <= 3) && score >= 65) { // 4학년이 아닌 경우
            resultStr = "합격!";
        } else {
            resultStr = "불합격!";
        }


        System.out.println(year+"학년, "+score+"점 이므로 "+resultStr+"입니다.");
		scanner.close();
	}
}
