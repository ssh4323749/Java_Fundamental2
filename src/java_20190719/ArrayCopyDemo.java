package java_20190719;

public class ArrayCopyDemo {

	public static void main(String[] args) {

		String[] fruits = { "apple", "banana", "watermelon", "bluwberry" };
		String[] temp = new String[6];
		// fruits => 원본배열
		// 0 원본 배열의 위치, 원본배열에 복사 할 위치
		// temp 카피 할 배열
		// 0=> 카피 할 배열의 위치
		// 4=> 원본배열의 4요소를 카피
		System.arraycopy(fruits, 0, temp, 0, 4);
		temp[0] = "peach";
		temp[1] = "rasberry";
		for (String 태영이는변태다 : temp) {
			System.out.println(태영이는변태다);
			// str 임의로 정한 변수 - 태영이는 변태다 그건 부정할 수 없는 사실이다
			
			}

		}
	}

