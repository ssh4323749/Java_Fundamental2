package java_20190715;

public class LiteralDemo {
	public static void main(String[] args) {
	
		//byte ë²”ìœ„ë¥? ?„˜?–´ê°?ë©? ì»´íŒŒ?¼ ?—?Ÿ¬ë°œìƒ
		//byte a1 = (byte)128;
		//System.out.println(a1);
		
		int a1 = 128;
		int a2 = 076; //8ì§„ìˆ˜
		int a3 = 0x123; //16ì§„ìˆ˜
		
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		 
		//long ë¦¬í„°?Ÿ´?? ?ˆ«??’¤?— l,Lë¡? ?‘œê¸°í•¨
		long a4 = 2200000000l;
		
		//float ë¦¬í„°?Ÿ´?? ?†Œ?ˆ«?  ?’¤?—f,Fë¡? ?‘œê¸°í•¨
		float f1 = 1234.43f;
		//double ë¦¬í„°?Ÿ´?? ?†Œ?ˆ«?  ?’¤?—d,Dë¡? ?‘œê¸?, ?ƒ?µê°??Š¥
		double d1 =123455.56d;
		
		//boolean ë¦¬í„°?Ÿ´?? true, false
		boolean isExisted = false;
		
		a1 = 10;
		d1 = 10.0d;
		// primitive data type?˜ == ?—°?‚°??Š” ê°’ë§Œ ë¹„êµ?•¨
		System.out.println(a1==d1);
		
		int b1 = 10;
		int b2 = b1;
		b2 = 20;
		System.out.println(b1);
		System.out.println(b2);
		
		
	}
}
