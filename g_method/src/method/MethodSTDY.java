package method;

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
		int [] result = new int [2];
				
			result[0] = arData[0];
			result[1] = arData[0];
			
			for (int i = 0; i < arData.length; i++) {
				if(result[0] < arData[i]) {
					result[0] = arData[i];
				}
				if(result[1] > arData[i]) {
					result[1] = arData[i];
				}
				
			}
			return result;
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		MethodSTDY m = new MethodSTDY();
//		int[] result = m.divide(5, 8);		// 배열이니까 배열로 타입을 적고, 리턴이름 적고 , 입력값을 적은건가?
//		
//		System.out.println("몫" + result[0]);
//		System.out.println("나머지"+ result[1]);
		System.out.println();
		
		
		
		
		
		
		
	}
}
