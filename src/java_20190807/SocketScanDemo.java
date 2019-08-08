package java_20190807;

import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;


public class SocketScanDemo {
	public static void main(String[] args) {
		Socket socket = null;
		for(int i=1; i<=1024;i++){
		/*socket 객체가 생성되었다는 애기는 host, port로 통신할 수 있다는 얘기이고 이는 해당 host에 port번호를 사용하고 있다는 것*/
		
				//cmd => nslookup => url주소입력
		
			
			/*try {
			socket = new Socket("222.122.84.24",i);
			System.out.println(i+"번호를 사용하고 있습니다.");

		} catch (UnknownHostException e) {
			System.out.println(i+"호스트가 존재하지 않습니다.");
		} catch (IOException e) {
			System.out.println(i+"번호를 사용하지 않고 있습니다.");
		}
		*/
		/*	socket = new Socket("222.122.84.24",21); //wep server
			OutputStream out = socket.getOutputStream()
					out.writer();
*/
}
}
}
