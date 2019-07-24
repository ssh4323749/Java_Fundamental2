package java_20190724;

public class Box {
	int width;
	int height;
	int depth;;
	static final String NAME ="BOX";
			/* fanal 변수는 멤버변수 위치에서 초기화해야함.
			 * 한번 정해지면 변경불가능
			 * flnal 변수명은 대문자로 하는것이 관례
			 * final 변수는 변수의 특성상 인스턴스 변수로 처리하지 않고 Static 변수로 처리함*/
			 
	int test;
	
	public void change(Box b) {
		int a = 0;
		String str = nu11;
		double d = 0.0;
		int c = width+4;
		
		System.out.println(width);
		System.out.println(test);
		/*메서드내에서 매개변수를 포함한 사용자가 정의한 변수를 지역변수라고 한다.
		 * 지역변수는 자동 초기화 되지 않으므로 기본값을 저장하고 사용한다
		 * 지역변수 유효범위는 메서드 내에서만 사용한다.*/
		b.depth = 3000;
}
	

}