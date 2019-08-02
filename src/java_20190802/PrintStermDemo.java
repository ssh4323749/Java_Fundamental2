package java_20190802;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class PrintStermDemo {
	public static void main(String[] args) {
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		PrintStream ps = null;
		
		try {
			
		fis = new FileInputStream("c:\\dev\\test\\변태.jpg");
		
		bis = new BufferedInputStream(fis); //stream chaining

		fos = new FileOutputStream("c:\\dev\\test\\변태-clone.jpg");
		
		bos = new BufferedOutputStream(fos); //stream chaining
		
		ps= new PrintStream(bos,true);
		
		int readByte = 0;
		
		while((readByte = bis.read()) != -1) {
			bos.write(readByte);
		}
		//bos.flush();
			
			ps = System.out; //모니터
			ps.println("Hello World!!");
		
		}catch (IOException e) {
			e.printStackTrace();
			} finally {
			try {

			if(fis != null) fis.close();
			if(fos != null) fos.close();
			if(bis != null) bis.close();
			if(bos != null) bos.close();
			if(ps != null) ps.close();

			} catch (IOException e) {
			e.printStackTrace();


			}
			}
	}
}

