package java_20190802;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferdInputOutputStreamDemo {
public static void main(String [] args)	{
FileInputStream fis = null;
FileOutputStream fos = null;

BufferedInputStream bis = null;
BufferedOutputStream bos = null;


try {
/* FileInputStream 과 FileOutputStream 이용하여 1바이트로 입출력 테스트. 
 
fis = new FileInputStream("c:\\dev\\test\\git.pdf");
fos = new FileOutputStream("c:\\dev\\test\\git.pdf");

int readByte = 0;
long start = System.currentTimeMillis();

while((readByte = fis.read()) != -1) {
	fos.write(readByte);
	
}

long end = System.currentTimeMillis();
System.out.printf("경과시간 : %d%n",end-start);*/

	/* BufferedInputStream 과 BufferedOutputStream 이용하여 1바이트로 입출력 테스트
	 * BufferedInputStream read() 메서드는 1바이트를 읽어서 BufferedOutputStream의
	 * 버퍼 (byte[])공간에 저장한다.
	 * BufferedOutputStream의 write() 메서드는 1바이트 출력하는 것이 아니라 
	 * BufferedOutputStream의 버퍼(byte[])공간에 가득 차 있으면 출력한다.
	 * 만약 다 채워지지않으면 출력하지 않는다
	 * 이런경우 flush()메서드를 이용하여 출력한다.
	 
	fis = new FileInputStream("c:\\dev\\test\\git.pdf");
	fos = new FileOutputStream("c:\\dev\\test\\git.pdf");
	
	bis = new BufferedInputStream(fis); //stream chaining
	bos = new BufferedOutputStream(fos); //stream chaining


	int readByte = 0;
	long start = System.currentTimeMillis();

	while((readByte = fis.read()) != -1) {
		bos.write(readByte);
		
	}
	
	BufferedOutputStream의 버퍼 (byte [])는 다 채워지면 자동으로 전송하지만 다채워지지않으면 전송하지 않는다.
	 따라서 다 채워지지 않더라도 버퍼를 비우기 위해서는 flush() 메서드를 사용해야 한다.
	bos.flush(); //꼬옥 입력해야 됨
	long end = System.currentTimeMillis();
	System.out.printf("경과시간 : %d%n",end-start);*/
	
	/*FileInputStream 과 FileOutputStream를 이용하여 8192 바이트를 읽어서 8192바이트를 출력 */

fis = new FileInputStream("c:\\dev\\test\\git.pdf");
fos = new FileOutputStream("c:\\dev\\test\\git.pdf");

int readByteCount = 0;
byte[] readbytes = new byte[8192];
long start = System.currentTimeMillis();

while((readByteCount = fis.read()) != -1) {
	fos.write(readbytes,0,readByteCount);
	
}

long end = System.currentTimeMillis();
System.out.printf("경과시간 : %d%n",end-start);

} catch (IOException e) {
e.printStackTrace();
} finally {
try {

if(fis != null) fis.close();
if(fos != null) fos.close();
if(fos != null) bis.close();
if(fos != null) bos.close();


} catch (IOException e) {
e.printStackTrace();

}
}


}

}

	

