package java_20190715;

public class CastingDemo {

	public static void main(String[] args) {
		//overflow ë°œìƒ?•˜?—¬ ì»´íŒŒ?¼ ?—?Ÿ¬
		//byte b1 = 250;
		
		byte b1 = (byte)250; //circuit ë°œìƒ,ê¶Œì¥?•˜ì§??•Š?Œ
		System.out.println(b1);
		
		int i1 = (int)123.45; //cut ë°œìƒ
		System.out.println(i1);
		
		double d1 = 123.45f; //??™ ?˜•ë³??™˜
		
		byte b2 = 10, b3 = 20;
		
		//?‚°?ˆ ?—°?‚°??Š” ë°˜í™˜ê°’ì´ int?´ê¸? ?•Œë¬¸ì— ? „ì²´ë?? byteë¡? ?˜•ë³??™˜?•´?•¼ ?—?Ÿ¬ê°? ë°œìƒ?•˜ì§? ?•Š?Œ
		byte b4 = (byte)(b2 + b3);

	}

}
