package java_20190731;

public class TryCatchDemo {
	public static double getAvg(int korean, int english) {
		
		int sum = korean + english;
		double avg = (double)sum / (double)2;
		return avg;
	}
	public static void main(String[] args) {
		
		try {
			int korean = Integer.parseInt(args[0]);
			int english = Integer.parseInt(args[1]);
			double average = getAvg(korean,english);
			System.out.printf("평균:%f",average);
		}catch(NumberFormatException e1){
			//System.err.println("최태영 변태");
			
		}	
        catch(ArrayIndexOutOfBoundsException e2){
		System.err.println("왜자꾸 깨우고 지랄이야");
}		finally {
		//예외가 발생하건 안 하건 무조건 실행
}		System.out.println("finally");

}
}