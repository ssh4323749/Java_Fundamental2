package java_20190723;

public class PrimeNumberDemo {
	public static void main(String[] args) {
		PrimeNumber p1 = new PrimeNumber();
		p1.printPrimeNumber(100);
		
		int[] array = p1.getPrimeNumber(100);
		for(int temp : array) {
			System.out.print(temp + "\t");
		}
		System.out.println();
		
		System.out.printf("총 갯수 : %d",array.length);
	}
}
