package java_20190715;

public class CharLiteralDemo {

	public static void main(String[] args) {
		//char literal? ? ?μ½λ ?? => '\u0000'
		char c1 = '\uAE40';
		char c2 = '\uAC74';
		char c3 = '\uD615';
	
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		//char literal? ??€?€μ½λ ?? => 65
		
		char c4 = 65;
		System.out.println(c4);
		
		//char literal? λ¬Έμ?? => ''
		
		char c5 = 'q';
		
		char c6 ='\\';
		
		// \n -> line feed
		// \t -> tab
		// \\ -> back slash
		// \' -> single quotation
		// \" -> double quotation
		
		String path = "aa\nbb";
		
		System.out.println(path);
		
	}

}
