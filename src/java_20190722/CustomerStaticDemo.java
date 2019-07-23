package java_20190722;
import java_20190719.Customer;
import java_20190722.aa.Notice;
public class CustomerStaticDemo {

	public static void mina(String args[]) {
		//static 변수는 클래스 이름으로 접근한다.
		Customer.interestRate = 3.7;

		
		
		Customer c1 = new Customer();
		c1.name = "최태영";
		c1.age = 40;
		c1.email = "dogud@naver.com";
		c1.phone = "010-4534-9530";
		c1.balance = 1_00_000;
		c1.isRelease = true;
		
		//Customer BANKNAME="기업은행";

		//final 변수는 재할당이 불가능
		//static 변수는 클래스 이름으로 접근하는것이 관례지만 reference로도 접근이 가능하다
		
		
		
		//c1.interestRate = 3.5
		
		System.out.println(Customer.interestRate);

		
		Customer c2 = new Customer();
		c2.name = "아무개";
		c2.age = 39;
		c2.email = "asfd@naver.com";
		c2.phone = "010-8456-9530";
		c2.balance = 2_00_000;
		c2.isRelease = false;
		
		System.out.println(Customer.interestRate);

		Customer c3 = new Customer();
		c3.name = "피카츄";
		c3.age = 2;
		c3.email = "카츄@naver.com";
		c3.phone = "010-8888-9530";
		c3.balance = 3_00_000;
		c3.isRelease = true;
		
		System.out.println(Customer.interestRate);

	}
}
