package java_20190722.aa;

public class NoticeDemo {
	public static void main(String[] args) {
		Notice n1 = new Notice();
		//public은 서로다른 패키지도 가능
		n1.number = 1;
		//protectde은 서로다른 패키지 이면서 상속받은 경우에는 접근 가능
		n1.title = "공지사항입니다.";
		 //default는 같은 패키지 내에서 접근가능
		n1.hit = 0;
		//n1.regdate = " 2019는 불과 private.. private는 같은 클래스 내에서만 접근가능
	}
	
}
