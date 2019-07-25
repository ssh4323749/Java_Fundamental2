package java_20190725;

public class Child extends Parent {
	static {
		statuicParent = 200;
		System.out.println("Child static 초기화");

	}
	static int staticChild;
	String phone;		
	{
		System.out.println("Preant static block");
	}
	public Child() {
		//super생략
		System.out.println("Child 생성자");

}

	}
	
