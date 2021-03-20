import java.util.Scanner;

public class codeup16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String y = sc.next();
        String[] mobnum = y.split("\\.");
        int y1 = Integer.valueOf(mobnum[0]);
        
        int y2 = Integer.valueOf(mobnum[1]);
        int y3 = Integer.valueOf(mobnum[2]);
        
        System.out.printf("%04d.%02d.%02d",y1,y2,y3);
        
	}

}
