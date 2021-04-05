
public class Exam10 {

	public static void main(String[] args) {
		int a = 60;

		if (a > 50) {
			if (a < 100) {
				System.out.println(a + "가 50보다 크고 100보다 작군요");
			} else {
				System.out.println(a + "는 100보다 크군요");
			}
		} else {
			System.out.println(a + "은 50보다 작군요");
		}
	}
}