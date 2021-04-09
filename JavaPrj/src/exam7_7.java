
public class exam7_7 {

	public static void main(String[] args) {
		int sum = 0;
		int a;

		for (;;) {
			for (a = 1; a <= 100; a++){
			sum += a;
			if (sum > 2000) {
				System.out.println("합계 :"+sum);
				sum = 0;
				//break;
				return;
			}
			}
			 System.out.println("아직도 반복중..");
		}
		
	}

}

