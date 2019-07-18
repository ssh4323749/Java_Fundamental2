package java_20190717;

public class BreakDemo {
	public static void main(String[] args) {

	// 1부터 10까지 짝수의 합 구하기
		int sum = 0;
		test:
		for (int i = 1; i <= 10; i++) {
			if (i == 6) break test; //break 는 해당 블록의 반복 루프를 빠져나가는 것
				sum += i;
		}
		System.out.printf("1부터 5까지 총 짝수 합은 %d입니다.", sum);


	// 구구단 만들기
		outter:for (int first = 2; first <= 9; first++) {
			for (int second = 1; second <= 9; second++) {
			if(first == 4 && second == 8) break outter;
		System.out.printf("%d * %d = %d%n", first, second, first * second);
		}
		}
	// 레이블("outter:")을 사용하면, if 구문을 빠져나갈수 있다.
	}
}