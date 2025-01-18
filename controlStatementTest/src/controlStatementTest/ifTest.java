package controlStatementTest;

import java.util.Scanner;

public class ifTest {
	public static void main(String[] args) {
		int number1 = 0, number2 = 0;
	      String result = null;
	      String message = "두 정수를 입력하세요.\n예)1 6";
	      boolean condition1 = false, condition2 = false;
	      Scanner scan = new Scanner(System.in);
	      
	      System.out.println(message);
	      number1 = scan.nextInt();
	      number2 = scan.nextInt();
	      condition1 = number1 > number2;
	      condition2 = number1 == number2;
	      
	      if ( condition1) {
	    	      result= number1 + "이 더크다"
	      }else if (condition2) {
	    	  
	      }else { 
	    	  number2가 더 크다.
	      }
	      
	      
	}
}
