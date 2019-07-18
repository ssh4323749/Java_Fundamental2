package java_20190716;

public class SsnDemo {

	public static void main(String[] args) {
		int a1 = 1,
			a2 = 1,
			a3 = 1,
			a4 = 1,
			a5 = 1,
			a6 = 1,
			
			b1 = 1,
			b2 = 1,
			b3 = 1,
			b4 = 1,
			b5 = 1,
			b6 = 1,
			b7 = 8;
		
		//1. 각자리수를 2부터 9까지 곱하고 다시 2-5까지 곱해서 합을 구함
		
		int sum = a1 * 2 + a2 * 3 + a3 * 4 + a4 * 5 + a5 * 6 + a6 * 7
				+ b1 * 8 + b2 * 9 + b3 * 2 + b4 * 3 + b5 * 4 + b6 * 5;
		
		//2. 총합을 11로 나눈 나머지를 구한다
		sum %= 11;

		// 3. 11에서 나머지를 뺀다
		sum = 11 - sum;

		// 4. 3의 결과를 10으로 나눈 나머지를 구한다
		sum %= 10;

		// 5. 4의 결과와 마지막 숫자가 같은 정상적인 주민 번호
		if (sum == b7) {
			System.out.println("정상");
		} else {
			System.out.println("비정상");
		}
		System.out.println("오늘은 그만?");
	}

}
