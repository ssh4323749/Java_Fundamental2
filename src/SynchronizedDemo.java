package java_20190806;

public class SynchronizedDemo implements Runnable {
	int x;
	int y;
	
	@Override
	public synchronized void run() {
	  synchronized (this) {
		//synchronized (SynchronizedDemo.calss)
	
		for(int i=0;i<1000;i++) {
			x++;
			y++;
			String threadName = Thread.currentThread().getName();
			System.out.printf(" x: %d, y: %d - %s%n", x,y,threadName);
			
			
			//쓰레드를 사용할꺼면 인스턴스변수 사용하지말라고 새끼야
			
		}
	}
	}
	public static void main(String[] args) {
		SynchronizedDemo s1 = new SynchronizedDemo();
		SynchronizedDemo s2 = new SynchronizedDemo();

		Thread t1 = new Thread(s1);
		Thread t2 = new Thread(s2);

		t1.start();
		t2.start();
	}
}
