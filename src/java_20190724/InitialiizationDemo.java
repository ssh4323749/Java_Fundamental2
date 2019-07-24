package java_20190724;
/*I18n -> 국제화 Internationalization
 *L10n -> 지역화 Iocalization*/
public class InitialiizationDemo {
	
	int a;
	static int b;
	static final int c=10;
	/*static 초기화*/
	static {
		b =100;
		
	}
	public InitialiizationDemo(int a) {
		this.a = a;
		/*모든생성자 super*/
	}
		/*생성자에서 초기화 할 수있는 변수는 instance 변수만 가능*/
	public static void main(String [] args) {
		System.out.println("main area");

		InitialiizationDemo i = new InitialiizationDemo(1000);
			System.out.println(i.a);
			System.out.println(b);
			System.out.println(c);

	
	}
	
}


