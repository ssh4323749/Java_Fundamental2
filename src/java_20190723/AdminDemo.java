package java_20190723;

public class AdminDemo {
	public static void main(String[] args) {
		Admin a = new Admin("암나이트","2","xoud@daum.net",1);
		/*a.setId("변태영");
		a.setPwd("1234");
		a.setEmail("xogud@daum.net");
		a.setLevel(1);*/
	System.out.printf("%s,%s,%s,%d %n", a.getId(),a.getPwd(),a.getEmail(),a.getLevel());
	}
}
