package controlStatementTest;

import java.util.Scanner;

public class ForTask02 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
//		브론즈 1~100 출력
//		100~1까지 출력
//		1~100 까지 중 짝수만 출력
//		for (int i = 0; i <= 100; i++) {
//			System.out.println(i);
//
//		}
//		int result = 0;
//		int num1 = 0;
//		
//		
//		System.out.println("-------------------");
//		for (int i = 0; i < 100; i++) {
//			if (i % 2 == 0) {
//				System.out.println(i);
//			}
//
//		}

//		실버
//		1~10까지 합 출력
//		int result = 0;
//		int num1 = 0;
//		
//		for (int i = 0; i <= 10; i++) {
//			result += i;
//			
//		}
//		System.out.println(result);

//		1~n까지 합 출력(n은 입력받기)
//		int result = 0;
//		int num1 = 0;
//		
//		int input = 0;
//		
//		System.out.println("1~입력한값 의 합");
//		System.out.println(" 값을 입력해주세요 : ");
//		input = sc.nextInt();
//		
//		for (int i = 0; i <= input; i++) {
//			result += i;
//			
//		}
//		System.out.println(result);

//		골드
//		A ~ F 까지 출력

//		char ch = 'A';
//		int num = (int)ch;
//		
//		
//		for (int i = 65; i <= 71 ; i++) {
//			System.out.println((char)i);
//		}

//		다이아

//		for (int i = 0; i < 12; i++) {
//			System.out.println(i % 3);
//		}
//		

//		0120120120120120 출력

//		aBcDeF

//		for (int i = 0; i < 26 ; i++) {
//			char num1 = (char)('A' + i);
//			num1 += (i%2) * 32;
//			System.out.println(num1 + "");
//			
//			
//		}
//		

//		한번에 3개의 값을 입력받기( 스페이스바 3번 , 엔터 한번) ,  2개의 값을 입력받기( 엔터 2번 )

//		int num1 = 0, num2 = 0, num3 = 0, num4=0 , num5=0;
//		
//		num1 = sc.nextInt();
//		num2 = sc.nextInt();
//		num3 = sc.nextInt();
//		num4 = sc.nextInt();
//		num5 = sc.nextInt();
//		
//		
//		
//		
//				
//		int result = 0;
//		
//		
//		result = num1 + num2 + num3 + num4 + num5;
//		System.out.println(result);

//		출력된 값들을 비교하여 가장 큰 수에 곱하기 10의 짝수 , 홀수를 출력
//		

//		가장 낮은 값은 그 숫자의 곱하기 1~10까지 

//		int result = 0;
//		int num1 = 10;

//		for (int i = 0; i <= 81; i++) {
//			System.out.println("%d"*"%d");
//		}
			
		
		
		
		for (int i = 0; i < 81; i++) {
			int first = i / 9 + 1, last =i % 9 + 1;
			int result = first * last;
		}
		
		
		
	}

}
