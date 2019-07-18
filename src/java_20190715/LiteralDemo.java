package java_20190715;

public class LiteralDemo {
	public static void main(String[] args) {
	
		//byte 범위�? ?��?���?�? 컴파?�� ?��?��발생
		//byte a1 = (byte)128;
		//System.out.println(a1);
		
		int a1 = 128;
		int a2 = 076; //8진수
		int a3 = 0x123; //16진수
		
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		 
		//long 리터?��?? ?��?��?��?�� l,L�? ?��기함
		long a4 = 2200000000l;
		
		//float 리터?��?? ?��?��?�� ?��?��f,F�? ?��기함
		float f1 = 1234.43f;
		//double 리터?��?? ?��?��?�� ?��?��d,D�? ?���?, ?��?���??��
		double d1 =123455.56d;
		
		//boolean 리터?��?? true, false
		boolean isExisted = false;
		
		a1 = 10;
		d1 = 10.0d;
		// primitive data type?�� == ?��?��?��?�� 값만 비교?��
		System.out.println(a1==d1);
		
		int b1 = 10;
		int b2 = b1;
		b2 = 20;
		System.out.println(b1);
		System.out.println(b2);
		
		
	}
}
