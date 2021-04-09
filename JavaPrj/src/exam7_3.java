import java.util.Scanner;

public class exam7_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;

		while (true) {
			System.out.println("더할 첫번째 수입력 :");
			a = sc.nextInt();
			System.out.println("더할 두번째 수입력 :");
			b = sc.nextInt();

			System.out.printf("%d + %d =%d \n ", a, b, a + b);
			// 합계가 10보다 크면 나가기
			if (a + b > 10) {
				break;
			}
		}
	}

}

