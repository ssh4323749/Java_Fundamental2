package java_20190715;

public class LiteralDemo {
	public static void main(String[] args) {
	
		//byte λ²μλ₯? ??΄κ°?λ©? μ»΄ν?Ό ??¬λ°μ
		//byte a1 = (byte)128;
		//System.out.println(a1);
		
		int a1 = 128;
		int a2 = 076; //8μ§μ
		int a3 = 0x123; //16μ§μ
		
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		 
		//long λ¦¬ν°?΄?? ?«??€? l,Lλ‘? ?κΈ°ν¨
		long a4 = 2200000000l;
		
		//float λ¦¬ν°?΄?? ??«?  ?€?f,Fλ‘? ?κΈ°ν¨
		float f1 = 1234.43f;
		//double λ¦¬ν°?΄?? ??«?  ?€?d,Dλ‘? ?κΈ?, ??΅κ°??₯
		double d1 =123455.56d;
		
		//boolean λ¦¬ν°?΄?? true, false
		boolean isExisted = false;
		
		a1 = 10;
		d1 = 10.0d;
		// primitive data type? == ?°?°?? κ°λ§ λΉκ΅?¨
		System.out.println(a1==d1);
		
		int b1 = 10;
		int b2 = b1;
		b2 = 20;
		System.out.println(b1);
		System.out.println(b2);
		
		
	}
}
