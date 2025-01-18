package InputTest;

import java.util.Scanner;

public class inputTest03 {
	public static void main(String[] args) {
		Scanner inputInt = new Scanner(System.in);

		int num1 = 0, num2 = 0, num3 = 0, result = 0;

		System.out.print("정수 입력 : ");
		num1 = inputInt.nextInt();
		System.out.println(num1);
		num2 = inputInt.nextInt();
		System.out.println(num2);
		num3 = inputInt.nextInt();

		result = num1 + num2 + num3;

		System.out.println("더한 값은 : " + result);

//		3개의 정수를 한 번에 입력받은 후 덧셈 결과 출력
//		nextInt(): 사용자가 입력한 정수

//		1. Scanner 선언
//		2. int,result 변수 3개 생성 ,초기화
//		3. result 에 num1,num2 값 넣기 
//		3. 변수 3개에 입력값 넣기.
//		4. 더한 값을 result 에 넣기.
//		5. result 출력

	}
}
