package java_20190801;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputOutputDemo2 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		/* window prefernces templates java Editor
		 * 이름정하고 내용만들고
		 * insert Variable
		 * cursor
		 * export
		   impotr 로 넣고빼기가능*/
		
		try {
		fis = new FileInputStream("c:dev\\test\\jdk.exe");
		fos = new FileOutputStream("c:dev\\test\\천진난만\\개변태\\jdk.exe");
			//외우래
			int readByteCount = 0;
			byte[] b = new byte[1024*10];
			/*fis.read(b) => FileInputStream에 1024 바이트를 읽어서
			 * b에 저장하고 읽은 바이트 수를 반환한다 */
			long start = System.currentTimeMillis();
			while((readByteCount = fis.read(b)) != -1) {
			fos.write(b,0,readByteCount);
			//
			}
			
			long end = System.currentTimeMillis();
			System.out.println("경과시간 : " +(end-start));

		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(fis != null) fis.close();
				if(fos != null) fos.close();
			} catch (IOException e) {
				e.printStackTrace();
				
				
		}
	}
}
}