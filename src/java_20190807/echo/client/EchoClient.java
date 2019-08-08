package java_20190807.echo.client;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class EchoClient {

	Socket socket = null;
	OutputStream out = null;
	OutputStreamWriter osw = null;
	BufferedWriter bw = null;
	InputStream in = null;
	InputStreamReader isr = null;
	BufferedReader br = null;
	
	
	
	
	
	private String ip;
	private int port;

	public EchoClient(String ip, int port) {
		this.ip = ip;
		this.port = port;
	}

	public void run() {
		Socket socket = null;
		try {
			//ip와 port로 서버접속을 시도
			//3. 소켓을 생성
			//4. 서버와 연걸
			socket = new Socket(ip, port);
			//6. 소켓과 출력스트림을 생성 후 서버에게 메세지 전송
		
			OutputStream out = socket.getOutputStream();
			OutputStreamWriter osw = new OutputStreamWriter(out);
			BufferedWriter bw = new BufferedWriter(osw);
			bw.write("안녕하세요..pervert is 태영");
			bw.newLine();
			bw.flush();
			
			InputStream in = socket.getInputStream();
			InputStreamReader isr = new InputStreamReader( in);
			BufferedReader br = new BufferedReader(isr);
			String readLine = br.readLine();
			System.out.println(readLine);
		
		} catch (UnknownHostException e) {
			System.out.println("서버주소가 잘못됨");
		} catch (IOException e) {
			System.out.println("서버가 죽음");
			
		}finally {
			try {
				if(out !=null) out.close();
				if(osw !=null) osw.close();
				if(bw !=null) bw.close();
				if(in !=null) in.close();
				if(isr !=null) isr.close();
				if(br !=null) br.close();
				if(socket !=null) socket.close();
			} catch (IOException e2) {
				System.out.println("서버가 죽음");
			}
		}
	}
			
	public static void main(String[] args) {
	new EchoClient("192.168.0.52", 3000).run();
	
	
		}
	}
	
	

