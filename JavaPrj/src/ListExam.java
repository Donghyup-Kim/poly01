import java.util.LinkedList;
import java.util.List;

public class ListExam {

	public static void main(String[] args) {
//List 인터페이스는 메모리에 올릴수 없기때문에 ArrayList 클래스를 통해 메모리올림
		List<String> rList=new LinkedList<String>();
		
		//List 컬렉션 프레임워크에 데이터를 추가함
		rList.add("이협건");
		rList.add("홍길동");
		rList.add("임꺽정");
		rList.add("고길동");
		
		//배열 크기 출력
		System.out.println("List의 크기"+ rList.size());
		
		for(int i=0; i<rList.size(); i++) {
			System.out.println("["+i+"]번째 배열 기억공간: "+rList.get(i));
		}	
	}

}
