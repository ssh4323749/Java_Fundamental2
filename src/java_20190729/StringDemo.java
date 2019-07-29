package java_20190729;

public class StringDemo {
	public static void main(String[] args) {
		String s1 = new String("test");
		String s2 = new String("test");
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		String s3 = "abc";
		String s4 = "abc";
		System.out.println(s3 == s4);
		System.out.println(s3.equals(s4));
		
		String sql = "select id, pwd, email from member ";
		sql += "where id = 'syh1011' and email = 'sdf@sf.com' ";
		sql += "sdf";//xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
		sql += "sdf";//xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
		sql += "sdf";//xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
		sql += "sdf";//xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
		sql += "sf";//xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
		sql += "sdf";//xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
		sql += "sdf";//xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
		sql += "sdf";//xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
		sql += "sdf";//xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
		sql += "sdf";//xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
		sql += "sdf";//xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
		
		String ssn = "111111-1111118";
		char c = ssn.charAt(6);
		System.out.println(c);
		
		ssn = ssn+("abcd");
		System.out.println(ssn);
		
		String fileName = "abd.abc.abc.abc.dddddd.doc";
		if(fileName.endsWith("zip")) {
			System.out.println("압축파일 입니다.");
		}else if(fileName.endsWith("doc")) {
			System.out.println("워드 문서 입니다.");
		}else {
			System.out.println("파일 입니다.");
		}
		
		System.out.println(fileName.equalsIgnoreCase("ABD.DOc"));
		
		int index = ssn.indexOf("-");
		
		System.out.println(index);
		
		System.out.println(fileName.indexOf("."));
		System.out.println(fileName.lastIndexOf("."));
		//111111-1111118
		String first = fileName.substring(0,fileName.lastIndexOf("."));
		String second = fileName.substring(fileName.lastIndexOf(".")+1);
		System.out.println(first);
		System.out.println(second);
		
		
		
		
		
	}
}