package java_20190807.echo.server;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {
	private int port;

	public EchoServer(int port) {
		this.port = port;
	}

	public void run() {
		ServerSocket serverSocket = null;
		try {
			//1. serverSocket를 생성
			serverSocket = new ServerSocket(port);

		} catch (IOException e) {
			e.printStackTrace();
		}

		while (true) {
			System.out.println("클라이언트가 접속을 기다리고 있습니다.");
			
			
			
			
			try {
				//2.서버소켓으로 클라이언트의 접속을 기다린다.
				Socket socket = serverSocket.accept();
				//5.클라이언트와 통신 할 소켓을 생성
				InetAddress i = socket.getInetAddress();
				String ip = i.getHostAddress();
				System.out.println("클라이언트가 접속함. IP:" + ip);
				
				InputStream in = socket.getInputStream();
				InputStreamReader isr = new InputStreamReader( in);
				BufferedReader br = new BufferedReader(isr);
				String readLine = br.readLine();
				System.out.println(readLine);
				
				OutputStream out = socket.getOutputStream();
				OutputStreamWriter osw = new OutputStreamWriter(out);
				BufferedWriter bw = new BufferedWriter(osw);
				bw.write(readLine);
				bw.newLine();
				bw.flush();
				
				

			} catch (IOException e) {
				e.printStackTrace();

			}

		}
	}

	public void main() {
		new EchoServer(3000).run();
	}

}