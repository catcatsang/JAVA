package castingTest;

public class CastingTest01 {
	public static void main(String[] args) {
		System.out.println(5 / 2);	
		System.err.println(5/ 2.0);	// 강제형변환 (double) 이 생략이 되있다.
		
//		강제 형변환
		System.out.println((double)5 / 2);	// 원래 int 타입으로 나와야하는데 double타입으로 강제변환
		System.out.println((int)2.9+5);	// double 타입인데 int타입으로 강제 형변환시킴
		
		
		double num1 = 8.43, num2 = 2.59;	// double 타입으로 초기화,
		int result = (int)num1 + (int)num2; 	// result 는 int 타입으로 강제형변환된 double 타입의 num1과 num2 
//		를 더하는 값으로 저장,
		
		System.out.println(result);
		
	}
}
