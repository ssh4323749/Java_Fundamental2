package java_20190715;

public class CastingDemo {

	public static void main(String[] args) {
		//overflow 발생?��?�� 컴파?�� ?��?��
		//byte b1 = 250;
		
		byte b1 = (byte)250; //circuit 발생,권장?���??��?��
		System.out.println(b1);
		
		int i1 = (int)123.45; //cut 발생
		System.out.println(i1);
		
		double d1 = 123.45f; //?��?�� ?���??��
		
		byte b2 = 10, b3 = 20;
		
		//?��?��?��?��?��?�� 반환값이 int?���? ?��문에 ?��체�?? byte�? ?���??��?��?�� ?��?���? 발생?���? ?��?��
		byte b4 = (byte)(b2 + b3);

	}

}
