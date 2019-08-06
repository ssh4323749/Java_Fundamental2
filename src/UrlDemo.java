
package java_20190806;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;


public class UrlDemo {
	public static void main(String[] args) throws IOException  {
		URL ur1 = new URL("http://biz.chosun.com/site/data/html_dir/2019/08/06/2019080601644.html#content");
		String protocol = ur1.getProtocol();
		String host = ur1.getHost();
		int port = ur1.getPort();
		String path = ur1.getPath();
		String query = ur1.getQuery();
		String reg = ur1.getRef();
		System.out.println("host :" + host);
		System.out.println("port :" + port);
		System.out.println("path :" + path);
		System.out.println("query :" + query);
		System.out.println("reg :" + reg);

		
		
		InputStream is = ur1.openStream();
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br= new BufferedReader(isr);
		String readLine = null;
		while((readLine  = br.readLine()) != null){
			System.out.println(readLine );
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
		}
	}
				

	}


