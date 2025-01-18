package castingTest;

public class CastingTest01 {
	public static void main(String[] args) {
		System.out.println(5 / 2);
		System.err.println(5/ 2.0);
		
//		강제 형변환
		System.out.println((double)5 / 2);
		System.out.println((int)2.9+5);
		
		
		double num1 = 8.43, num2 = 2.59;
		int result = (int)num1 + (int)num2;
		
		System.out.println(result);
		
	}
}
