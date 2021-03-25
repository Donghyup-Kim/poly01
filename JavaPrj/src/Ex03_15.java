
public class Ex03_15 {

	public static void main(String[] args) {
		String str1 = "IT CookBook 입니다.";
		String str2 = "10";
		String str3= "20";
		
		str1 = "Java 입니다.";
		
		System.out.println("str1 : "+str1);
		System.out.println("더하기 결과 :"+str2 +str3);
		
		int num1 = Integer.parseInt (str2); //인트형 변수를 설정하여 숫자로 더하기
		int num2 = Integer.parseInt (str3);
		
		System.out.println("더하기 결과 :"+(num1+num2));


	}

}
