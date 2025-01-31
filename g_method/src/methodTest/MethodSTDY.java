package methodTest;

public class MethodSTDY {
	
//	void print () {
//		for (int i = 0; i < 10; i++) {
//			System.out.println(i + 1);
//		}
//	}
	
//	int substract(int num,int num2, int num3) {
//		int result = 0;
//		result = num-num2-num3;
//		
//		return result;
//	}
	
//	int square(int num,int degree) {
//		int result = 1;
//		for (int i = 1; i < degree; i++) {
//			result *= i;
//		}
//		return result;
//	}
	
	
//		int[] divide(int number1 , int number2) {
//		int[] result = null;
//		
//		result = new int[] {number1/number2 , number1%number2};
//		
//		
//		return result;
//		
//	}
//	int add (int n) {			
//		int result = 1;			
//		for (int i = 0; i < n; i++) {	
//			result += i;
//		}
//		return result;
//	}
//	
	int[] getMaxAndMin(int[] arData) {
		int [] result = new int [2];	// int 타입 배열 선언 및 배열크기 2 생성
				
			result[0] = arData[0];	// result 첫번째 배열에 arData 첫번째 배열값을 넣음 , 초기화
			result[1] = arData[0];	// result 두번쨰 배열에 arData 첫번째 배열값을 넣음 , 초기화
			
			for (int i = 0; i < arData.length; i++) {	// arData 배열크기만큼 반복을 돌림
				
				if(result[0] < arData[i]) { 	// result 의 첫번째 값보다 arData 배열크기 값들보다 작으면
//					result 첫번째 값에 저장,
					result[0] = arData[i];
				}
				if(result[1] > arData[i]) {		// result 의 두번째 값보다 arData 배열크기 값들보다 크면
//					두번째값에 저장,
					result[1] = arData[i];
				}
				
			}
			return result;	// 2의 배열크기를 리턴함,
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		MethodSTDY m = new MethodSTDY();
		int[] result = m.getMaxAndMin(new int[]{5, 8});		// 배열이니까 배열로 타입을 적고, 리턴이름 적고 , 입력값을 적은건가?
//		
		System.out.println("작은" + result[0]);	//  작은값 출력
		System.out.println("큰"+ result[1]);		// 	큰값 출력
		
		
		
		
		
		
		
		
	}
}
