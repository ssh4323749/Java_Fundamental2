package java_20190725.step5;

public class StopWatchDemo {
	public static void execute(StopWatch sw) {
		sw.execute();
	}
	
	public static void main(String[] args) {
		StopMicroWatch s1 = new StopMicroWatch();
		execute(s1);
	}
}