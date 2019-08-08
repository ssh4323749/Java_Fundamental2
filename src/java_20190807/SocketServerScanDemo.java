package java_20190807;

import java.io.IOException;
import java.net.ServerSocket;

public class SocketServerScanDemo {
	public static void main(String[] args) {
		ServerSocket serversocket = null;
		
		for(int i=1;i<=65356;i++) {
			try {
				/*ServerSocket  클래스는 해당 서버의 port번호를 사용할 수 있으면 ServerSocket 객체를 생성
				 *그렇지 않으면 예외를 발생. 즉, 예외가 발생한다는 얘기는 port를 사용하는 경우이다.*/
				serversocket = new ServerSocket(i);
				System.out.println(i+"번호를 사용할 수 있습니다");
			}catch (IOException e) {
				System.out.println(i+"번호를 사용할 수 없습니다");

				e.printStackTrace();
			}
		}
	}
}
