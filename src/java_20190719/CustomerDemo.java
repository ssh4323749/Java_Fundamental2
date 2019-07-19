package java_20190719;

public class CustomerDemo {
	public static void main(String[] args) {
		/* Customer 객체 생성
		 * Customer - Objet type
		 * c1 => refernce
		 * new Customer () => Object
		 */
		
		Customer c1 = new Customer();
		c1.name = "변태최태영";
		c1.age = 30;
		c1.email = "xodud@gmail.com";
		c1.phone = "010-4534-9530";
		c1.balance = 1_00_000;
		c1.isRelease = false;
		System.out.printf("%s:%n%d%n%s%n%s%n$%.2f%n%s%n",c1.name,c1.age,c1.email,c1.phone,c1.balance,c1.isRelease);
		
		Customer c2 = new Customer();
		c2.name = "돼지한진우";
		c2.age = 30;
		c2.email = "wlsdn@gmail.net";
		c2.phone = "010-3156-6587";
		c2.balance = 50_000;
		c2.isRelease = true;
		
		Customer c3 = c2;
		c3.age =31;
		System.out.printf("%n%s:%n%d%n%s%n%s%n₩%.2f%n%s%n",c2.name,c2.age,c2.email,c2.phone,c2.balance,c2.isRelease);

	}

}
