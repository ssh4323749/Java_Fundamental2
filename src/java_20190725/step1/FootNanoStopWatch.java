package java_20190725.step1;
//1. 요구상은 밀리 세컨드로 경과 시간을 만들어주세요....
public class FootNanoStopWatch {
	long startTime;
	long endTime;
	
	long startNanoTime;
	long endNanoTime;
	
	public double getElapsedTime() {
		return (double)(endTime - startTime)/(double)1000;
	}
	public double getElapsedNanoTime() {
		return (double)(endNanoTime - startNanoTime)/(double)1000000000;
	}
	
	public static void main(String[] args) {
		FootNanoStopWatch f1 = new FootNanoStopWatch();
		//currentTimeMillis() => 
		//1970 1 1일부터 지금까지 시간을 밀리세컨드로 반환한다.
		f1.startNanoTime = System.nanoTime();
		for(long i=0;i<30_000_000_000l;i++) {
			
		}
		f1.endNanoTime = System.nanoTime();
		
		double elapsedTime = f1.getElapsedNanoTime();
		System.out.printf("경과시간 : %.9f", elapsedTime);
	}
}