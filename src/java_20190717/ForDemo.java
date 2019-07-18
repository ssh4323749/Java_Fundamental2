package java_20190717;

public class ForDemo {
	public static void main(String[] args) {

		// 1부터 10까지 짝수의 합 구하기
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				sum += i;
			}
		}
		System.out.printf("1부터 10까지 총 짝수 합은 %d입니다.", sum);

		// 구구단 만들기
		for (int first = 2; first <= 9; first++) {
			for (int second = 1; second <= 9; second++) {

				System.out.printf("%d * %d = %d%n", first, second, first * second);
		}
		}
		
		// 별(*) 역삼각형 만들기
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5-i; j++) {
			}
			System.out.print("*"); {
		
			System.out.println();
		}
		}
		// 역구구단 만들기
		for (int first = 9; first >= 2; first--) {
			for (int second = 1; second <= 9; second++) {

			System.out.printf("%d * %d = %d%n", first, second, first * second);
		}
		}
		
	}
}