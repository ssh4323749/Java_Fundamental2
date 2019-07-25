package java_20190725;

public class Sub extends Super {
	String chicken;
	public void gotoSchool() {
		System.out.println("Sub gotoSchool");
	}
	/*overrding => 부모의 메서드를 재정의
	 * 반환형, 메서드 이름, 매개변수 일치
	 * 접근한전자는 부모보다 자식이 상위이거나 같으면 된다.*/
	public void play(String starcraft) {
		//super.play("omok");
		System.out.print("Sub play");

	}
		
	}

