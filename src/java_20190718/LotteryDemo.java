package java_20190718;

public class LotteryDemo {
	public static void main(String[] args) {
		//Math.ramdom() => 0보다 크거나 같고 1보다 작은 양수를 doulb 값으로 변화한다.
		
		int[] lotto = new int[6];
		
		for(int i=0;i<lotto.length;i++) {
			
			double random = Math.random();
			int temp = (int)(random * 45) +1;
			lotto[i] = temp;
			if(i==0) { // 첫번째 방은 무조건 임의의값 Temp를 저장한다.
			// temp = 1보다 크거나 같고 45보다 작거나 같은 임의의 매번 생성되는 값.

		}else{
			//isExisted는 임의의 값 temp와 이전배열값을 비교했을때 동일한 값이 있는경우 ture , 없으면 false
			boolean isExisted = false;
			//i==1 아래의 for loop은1번반볶
			//i==2 아래의 for loop은2번반볶
			//i==3 아래의 for loop은3번반볶
		}
	       // for(int j=0;j<i;j++)

			for(int j=0;j<i;j++) {
	        	if(lotto[j]>lotto[j+1] {
	        		int temp = lotto[j];
	        		lotto[j] = lotto[j+1];
	        		lotto[j+1] = temp
	        	}
	        		//새로운 temo와 이전배열의 같은값이 존재하면 새
	        	}
	        		isExisted = ture;
	        				break;
	        	}
	        }
	       // temp = 1보다 크거나 같고 45보다 작거나 같은 임의의 매번 생성되는 값.
	        	
	        	if(!isExisted) {
	        		lotto[i] = temp;
	        	
	        	}else {
	        		i--; // 이전 위치로 변경하면 for문에서 i++로 증가하기 때문에 원 위치로 다시 시도할 수 있음
	        		
	        		int (lotto i=0;i<lotto.length;i++){
	        	System.out.print(lotto[i] + ",");

	        }
	}
}
}

