package java_20190806;

public class RunnableDemo implements Runnable {
	
	public void run() {
		for(int i=0;i<1000;i++) {
			String threadName = Thread.currentThread().getName();
			System.out.printf("%s : %d%n", threadName,i);
	}
	}
	public static void main(String[] args) {
		System.out.println("*********start*********");
		
		
		RunnableDemo r1 = new RunnableDemo();
		Thread t1 = new Thread(r1);
		t1.start();

		RunnableDemo r2 = new RunnableDemo();
		Thread t2 = new Thread(r2);

		t2.start();
		
		System.out.println("********end************");

	}

}


//해당 클래스를 스레드로 상속받는다
//런 메서드로 오버라이딩한다