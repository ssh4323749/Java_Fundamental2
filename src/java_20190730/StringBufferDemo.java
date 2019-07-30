package java_20190730;

public class StringBufferDemo {
	public static void main(String[] args) {
		StringBuffer s1 = new StringBuffer("test");
		StringBuffer s2 = new StringBuffer("test");
		System.out.println(s1 == s2);
		
		//equals() overriding 하지 않았기때문에
		System.out.println(s1.equals(s2));
		
		String s3 = s1.toString();
		String s4 = s2.toString();
		System.out.println(s3.equals(s4));
		
		StringBuffer sql = new StringBuffer();
		sql.append("select name, age");
		sql.append("from member");
		sql.append("where name = '변태영'");
		sql.append("order by name desc");
		
		System.out.println(sql);
		
		//sql의 모든 문자열 지우기
		sql.setLength(0);
		
		sql.append("'최태영 존나 변태새끼'");
		System.out.println(sql);
	}
}
