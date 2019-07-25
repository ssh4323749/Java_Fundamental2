package java_20190725.step2;

public class StopWatchDemo {
	public static void main(String[] args) {
		StopWatch s1 = new StopWatch();
		//currentTimeMillis() => 
		//1970 1 1일부터 지금까지 시간을 밀리세컨드로 반환한다.
		s1.start();
		for(long i=0;i<30_000_000_000l;i++) {
			
		}
		s1.stop();
		
		double elapsedTime = s1.getElapsedTime();
		System.out.printf("경과시간 : %.3f", elapsedTime);
	}
}
