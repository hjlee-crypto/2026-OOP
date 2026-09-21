import java.util.Scanner;
import java.util.InputMismatchException;

public class InputException {
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("몇개의 정수를 더하고자 하나요?");
            int count = scanner.nextInt();

			int sum=0, intValue=0;
			for(int i=1; i <= count; i++) {
				System.out.print(i +" 번째 정수 입력:");
				try {
					intValue = scanner.nextInt(); // 정수 입력
				}catch(InputMismatchException e) {
                    String ex = scanner.nextLine(); // 현재 입력 스트림에 남아 있는 		 		토큰은 읽어서 지워 버린다.
					System.out.println(ex+"은 정수가 아닙니다. 다시 입력하세요!");
					i--; // 인덱스가 증가하지 않도록 미리 감소
					continue; // 다음 루프
				}
				sum += intValue; // 합하기
			}
			System.out.println("합은 " + sum);
			scanner.close();
	}
}
