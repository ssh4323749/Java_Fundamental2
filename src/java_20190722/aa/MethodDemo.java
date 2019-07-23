package java_20190722.aa;

public class MethodDemo {
	public boolean isLeafYear(int year) {
		// 5~8라인 까지의 메서드를 정의
		// bloolean 매서드의 반환갑사
		// instacce 메서드
		return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
		// 메서드의 반환겂이 boolean이기에 return value의 value고 boolean이어야한다.

	}

	public char charofString(String msg, int index) {
		return msg.charAt(index);
	}

	public long plus(int first, int second) {
		return (long) first + (long) second;
	}

	public double divide(long first, long second) {
		return (double) first / (double) second;
		// 나누기
	}
	
	public void ascending(int[] array){
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length - (i + 1); j++) {
				if (array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
		
	}
		
		
	

	public static void main(String[] args) {
		MethodDemo m1 = new MethodDemo();
		boolean isLeafYear = m1.isLeafYear(234);
		System.out.println(isLeafYear);
		System.out.println (new MethodDemo().isLeafYear(2019));
		//
		char c = m1.charofString("hello", 0);
		System.out.println(c);

		long sum = m1.plus(21000000, 21000000);
		
		

		double div = m1.divide(0, 0);
		System.out.println(div);
		
		int[] temp = {1,2,3,4,5,41,6,25,11};
		
		for(int a : temp) {
			System.out.print(a+"\t");
		}
		
		m1.ascending(temp);

	}
}