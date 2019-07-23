package java_20190722.aa;
import java_20190722.aa.Notice;
public class Notice2Demo extends Notice {
	public static void main(String[] args) {
		
		Notice n1 = new Notice();
		//public은 서로다른 패키지도 가능
		n1.number = 1;
		//protectde은 서로다른 패키지 이면서 상속받은 경우에는 접근 가능
		n1.title = "공지사항입니다.";
		 //default는 같은 패키지 내에서 접근가능
		n1.hit = 0;
		//n1.regdate = " 2019는 불과 private.. private는 같은 클래스 내에서만 접근가능
		
		Notice2Demo n2 = new Notice2Demo();
		//부모클래스인 Notice에서 접근할 수 있는 접근한정자는 piblic, protected.
		n2.number = 1;
		n2.title = "공지사항입니다.";
		
	}
}
