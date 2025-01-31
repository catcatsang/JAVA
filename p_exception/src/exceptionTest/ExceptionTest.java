package exceptionTest;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest {
   public static void main(String[] args) {
//      int[] arData = new int[5];
//
//      try {
//         System.out.println(arData[4]);
//         System.out.println("오류 없음");
//         
//      } catch (Exception e) {
//         e.printStackTrace();
//      }
      
//      사용자에게 정수를 입력받고 10을 더해서 출력하기
//      만약, 정수가 아닌 다른 값을 입력했다면 예외를 처리해준다.
      Scanner sc = new Scanner(System.in);
      String message = "정수 :";
      int number = 0;
      
      System.out.print(message);
      try {
         number = sc.nextInt();
         System.out.println(number + 10);
         
      } catch (InputMismatchException e) {
//         e.printStackTrace();
         System.out.println("정수만 입력하세요.");
      } catch (Exception e) {
         e.printStackTrace();
      }
   }
}


















