package java_20190802;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintReaderWriterDemo2 {
		public static void main(String[] args) {
			FileReader fr = null;
			BufferedReader br = null;
			FileWriter fw = null;
			BufferedWriter bw = null;
			
			PrintWriter pr = null;
			
			try {
				fr = new FileReader("c:\\dev\\test\\kic.txt");
				br = new BufferedReader(fr);
				fw = new FileWriter("c:\\dev\\test\\kic.txt");
				bw = new BufferedWriter(fw);
				pr = new PrintWriter(bw, true);
				
				
				String readLine = null;
				while((readLine = br.readLine()) !=null) {
				pr.println(readLine);

				
			}
			bw.flush();
			
		}catch (IOException e) {
			e.printStackTrace();
		}finally {
			
			try {

				if(fr != null) fr.close();
				if(br != null) br.close();
				if(fw != null) fw.close();
				if(bw != null) bw.close();
				if(pr != null) pr.close();
				
			
				
			}catch (IOException e) {
				e.printStackTrace();
			
		}
	}
	}
	}

