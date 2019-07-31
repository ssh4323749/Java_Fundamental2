package java_20190731;
// 사용자 정의 예외 클라스
public class InsufficientBalanceException extends Exception {
	public InsufficientBalanceException(String msg) {
		//Exception 클래스의 매게변수 String인 생성자를 호ㅍㄹ
		//msg는 에러메세지를 출력 할 목적으로 사용한다.
		super(msg);
		
	}
}
