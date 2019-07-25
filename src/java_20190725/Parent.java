package java_20190725;

public class Parent {
	static {
		statuicParent = 20;
	}
	static int statuicParent;
	String name;
	{
		System.out.println("Preant 초기화");
	}
	public Parent() {
		//super생략

		System.out.println("Paren 생성자");
	}

}
