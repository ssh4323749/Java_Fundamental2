package java_20190809;

import java.util.Calendar;
import java.util.GregorianCalendar;

class A extends Thread{
	
	public void run() {
		
		
		System.out.println("스레드1....");
		 super.run();
		 
	}
}
class B implements Runnable{
	
	@Override
		public void run() {
			// TODO Auto-generated method stub
		
		System.out.println("스레드2....");
	}
		}

public class GarbageDemo {
	public static void main (String [] args) {
		A a = new A();
		a.start();
		System.out.println("aaaaa");
		
		
		B b = new B();
		Thread t1 = new Thread(b);
		t1.start();
		
		System.out.println("bbbbb");
		
		Calendar c = Calendar.getInstance();
		//Calendar c1 = new GregorianCalendar();
	}
	/*calender 클래스 메서드만 사용할 수 있음
	 단,Gregoriancalender 클래스에서 overring된 메서드는 사용 가능.
	public static Calendar getICalendar() {
		Calendar c = new GregorianCalendar();
		return new GregorianCalendar();*/
	}
		
	
}
