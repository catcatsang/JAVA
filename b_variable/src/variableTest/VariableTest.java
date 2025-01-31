package variableTest;

public class VariableTest {
	public static void main(String[] args) {
		int	age = 10;
		float floatNumber = 12.1563f;	// 실수 2비트 타입,
		double doubleNumber = 10.1563;	// 실수 8비트 타입,
		char grade = 'A';	// 캐릭터(character) 문자형 타입, 
		String data = "ABC";	// 문자열 타입, 
		
		age = 30;	// age 를 재정의함?..
		
		System.out.println(age);	
		System.out.println(floatNumber);
		System.out.println(doubleNumber);
		System.out.println(grade);
		System.out.println(data);
		
	}

}
