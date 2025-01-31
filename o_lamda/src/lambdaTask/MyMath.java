package lambdaTask;

import java.util.ArrayList; // 자바에서 가져오는 ArrayList 클래스
import java.util.Arrays; // 자바에서 가져오는 Arrays 클래스, 클래스 내부 필드를.. 사용할수있는것?
import java.util.Scanner; // 자바에서 가져오는 Scanner 클래스 

// 어디서든 접근이 가능하다는 public 이 있는 MyMath 클래스다.

public class MyMath {
//	public 클래스 외부에서도 접근 할수있다.

//	어디서든 접근이 가능한 public 
//	static 은 모든 객체
	public static Calc operate(String oper) { // Calc 이메서드는 operate는 메서드 명이다, 
//		메서드가 하나의 매개변수를 받는다는 것 , string 문자열을 받음.
											// 
		// oper가 +면 두 정수의 덧셈으로 구현하여 리턴
		// oper가 -면 두 정수의 뺄셈으로 구현하여 리턴
		return oper.equals("+") ? (n1, n2) -> n1 + n2 : (n1, n2) -> n1 - n2;
//		oper 변수에 + 가 있는지 확인하고 있다면 n1,n2 를 입력받아 더하는식, 없다면 뺴는 식을 리턴함
//		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	// 스캐너를 호출
		String message = "정수의 덧셈, 뺄셈에 대한 식을 입력하세요.";		
		String example = "예)9+7-5";
		String expression = null;
		String[] opers = null;
		String[] temp = null;
		int number1 = 0, number2 = 0;

		System.out.println(message);
		System.out.println(example);
		expression = sc.next();	

//      사용자가 입력한 expression에서 +와 -를 추출한다.
		OperCheck operCheck = (e) -> {		// OperCheck 인터페이스 함수의 기능을 만들어놓음,
//			OperCheck 인터페이스 이름이다. (e)
			String result = ""; // 반복문을 통해서 나오는 문자들을 배열로 저장,
			// 하나씩 문자 검사해서 + 또는 -면 계속 연결
			for (int i = 0; i < e.length(); i++) {	// e 배열의 크기만큼 반복을돌리는데
//				오,,, String은 문자 "열" 이기떄문에 랭스를 사용해서 문자 크기만큼  반복할수있다!!
//				
				char c = e.charAt(i); 
//				char 타입의 c 변수명을 가진 변수에 operCheck 메서드 매개변수 e = 입력받은값, 의 i번째 문자를 저장,
				if (c == '+' || c == '-') {
//					만약 char c 에 저장된 값이 + 나 -이면 
//					result에 저장한다,
					result += c;
				}
			}
			return result.split("");
//			입력한 값에서 + - 들을 각 문자 로 분리 하는 기능을 리턴
		};

		opers = operCheck.getOpers(expression); // opers 를 operCheck.getOpers의 메서드 
		temp = expression.split("\\+|\\-");
		number1 = Integer.parseInt(temp[0].equals("") ? opers[0] + temp[1] : temp[0]);
		for (int i = 0; i < opers.length; i++) {
			if (i == 0 && number1 < 0) {
				continue;
			}
			number2 = Integer.parseInt(temp[i + 1]);
			number1 = MyMath.operate(opers[i]).calc(number1, number2);
		}

		System.out.println(number1);
	}
}
