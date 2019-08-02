package java_20190802;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URL;

public class NaverCafeScaningDemo {
	public static void main(String[] args) throws IOException {
		URL url = new URL("https://blog.naver.com/PostView.nhn?blogId=harloveysj&logNo=221460034406&redirect=Dlog&widgetTypeCall=true&directAccess=false");
		InputStream is = url.openStream();
		
		

		/* 1. InputStream을 InputStreamReader로 변환
		 * 2. InputStreamReader을 BufferReader로 변환
		 * 3. BufferReader로 읽은 정보를 (html)로 전송
		 * c:\\dev\\test\\nabercafe.html파일로 저장한다*/
		
		InputStreamReader ir = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		
		FileWriter fw = null;
		BufferedWriter bw = null;
		PrintWriter pw =null;
		
		ir = new InputStreamReader(is);
		br = new BufferedReader(ir);
		fw = new FileWriter("c:\\dev\\test\\navercafe.html",true);
		bw = new BufferedWriter(fw);
		pw = new PrintWriter(bw,true);

		String readLine = null;
		while((readLine = br.readLine()) !=null) {
		pw.println(readLine);

	}
}
}

