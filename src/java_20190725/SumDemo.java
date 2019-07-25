package java_20190725;

public class SumDemo {
	public static void main(String[] args) {
		Sub s1 = new Sub();
		s1.makeMoney(); // 부모으메서드
		s1.gotoSchool();
		s1.play("starcraft");//부모메서드를 overtiding(재정의)
		
		s1.Money = 1000000;
		s1.chicken = "교촌치킨 2마리";
		
		/*부모의 멤버변수는 메서드 접근 가능하고 
		 *자식의 멤버변수 접근 불가, 메서드 접근 불가
		 *자식의 메서드 중에 overrding 메서드만 접근가능*/
		Super s2 = new Sub(); 
		s2.makeMoney();
		//s2.gotoSchool();
		s2.play("starcraft"); 
		s2.Money = 1000000;
		//s2.chicken = "교촌치킨 2마리";
		
	}
}
