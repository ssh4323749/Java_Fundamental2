package java_20190715;

public class CastingDemo {

	public static void main(String[] args) {
		//overflow λ°μ??¬ μ»΄ν?Ό ??¬
		//byte b1 = 250;
		
		byte b1 = (byte)250; //circuit λ°μ,κΆμ₯?μ§???
		System.out.println(b1);
		
		int i1 = (int)123.45; //cut λ°μ
		System.out.println(i1);
		
		double d1 = 123.45f; //?? ?λ³??
		
		byte b2 = 10, b3 = 20;
		
		//?°? ?°?°?? λ°νκ°μ΄ int?΄κΈ? ?λ¬Έμ ? μ²΄λ?? byteλ‘? ?λ³???΄?Ό ??¬κ°? λ°μ?μ§? ??
		byte b4 = (byte)(b2 + b3);

	}

}
