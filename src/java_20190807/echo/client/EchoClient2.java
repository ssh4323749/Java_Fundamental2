package java_20190807.echo.client;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class EchoClient2 {

	Socket socket = null;
	OutputStream out = null;
	OutputStreamWriter osw = null;
	BufferedWriter bw = null;
	InputStream in = null;
	InputStreamReader isr = null;
	BufferedReader br = null;
	FileOutputStream fos = null;

	private String ip;
	private int port;

	public EchoClient2(String ip, int port) {
		this.ip = ip;
		this.port = port;
	}

	public void run() {
		Socket socket = null;
		try {
			// ip와 port로 서버접속을 시도
			// 3. 소켓을 생성
			// 4. 서버와 연걸
			socket = new Socket(ip, port);
			// 6. 소켓과 출력스트림을 생성 후 서버에게 메세지 전송

			in = socket.getInputStream();
			File f = new File("c:\\dev\\test\\network");
			f.mkdirs();
			f = new File(f, "apache-tomcat-9.0.22.zip");
			fos = new FileOutputStream(f);
			byte[] readBytes = new byte[1024 * 8];
			int readByteCount = 0;
			while ((readByteCount = in.read(readBytes)) != 1) {
				fos.write(readBytes, 0, readByteCount);

			}
		} catch (UnknownHostException e) {
			System.out.println("서버주소가 잘못됨");
		} catch (IOException e) {
			System.out.println("서버가 죽음");

		} finally {
			try {
				if (out != null)
					out.close();
				if (osw != null)
					osw.close();
				if (bw != null)
					bw.close();
				if (in != null)
					in.close();
				if (isr != null)
					isr.close();
				if (br != null)
					br.close();
				if (socket != null)
					socket.close();
			} catch (IOException e2) {
				System.out.println("서버가 죽음");
			}
		}
	}

	public static void main(String[] args) {
		new EchoClient2("192.168.0.52", 4000).run();

	}
}
