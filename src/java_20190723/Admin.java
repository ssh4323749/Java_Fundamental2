package java_20190723;

public class Admin {
	private String id; //null
	private String pwd; //null
	private String email; //null
	private int level; //0
	
	public Admin() {
		/*디폴트 생성자(defult constructor)*/
		 
		 
	}
	
	
	/* 생성자 (constructor)
	 * 생성자는 반환값이 없고, 이름은 클래스 이름과 동일하게
	 * 역활은 인스턴스 벼수 초기화(값을 처음으로 할당)
	 */
	public Admin(String id, String pwd, String email, int level) {
		this.id = id;
		this.pwd = pwd;
		this.email = email;
		this.level = level;

		
		
		
	}
	
	public Admin(String id, String pwd, String email) {
		/*this.id = id;
		this.pwd = pwd;
		this.email = email;*/
		
		this(id,pwd,email,0);
		//다른 생성자 호출
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public String getId() {
		return id;
	}
	
	public String getPwd() {
		return pwd;

	}
	
	public String getEmail() {
		return email;
	}	
	public int getLevel() {
		return level;

	}
}
	