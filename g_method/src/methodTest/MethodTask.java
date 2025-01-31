package methodTest;

public class MethodTask {

//    1 ~ 10까지 println()으로 출력하는 메소드
   void print1To10() {		// 리턴 값이없는 상태
      for (int i = 0; i < 10; i++) {		// for문 반복 을 10번 
         System.out.println(i + 1);			// 0부터 10까지 증가하는 i에 1씩 더함
      }
   }

//    "홍길동"을 n번 println()으로 출력하는 메소드
   void printHong(int n) {
      for (int i = 0; i < n; i++) {
         System.out.println("홍길동");
      }
   }

//    이름을 n번 println()으로 출력하는 메소드
   void printName(int n, String name) {
      for (int i = 0; i < n; i++) {
         System.out.println(name);
      }

   }

//   세 정수의 뺄셈 메소드
   int substract(int[] arData) {	//int 타입 메소드 생성 배열이 매개변수로 생성
      int result = 0;				// result 초기화
      arData[0] *= -1;				// 배열 첫번째 값에 -1을 곱함
      for (int i = 0; i < arData.length; i++) {	
         result -= arData[i];	// result에 입력받는 배열들을 모두 뻄
      }

      return result;
   }

//   정수 1개를 입력받고, 차수도 입력받는다.
//   해당 차수만큼의 값을 구해주는 메소드 선언
   int square(int number, int degree) {  // number1 2, 정수를 두개 입력받는다
	   int result = 1;					// result 를 1로 초기화
      for (int i = 0; i < degree; i++) {	// for문 반복횟수를 차수 횟수만큼 반복
         result *= number;				// result 에 곱한 정수를 저장함
      }
      return result;			
   }

//   두 정수의 나눗셈 후 몫과 나머지 두 개를 구하는 메소드
//   반드시 리턴한다.
   int[] divide(int number1, int number2) {			// number1 2 정수를 받아옴
      // 배열도 하나의 자료형으로 보자!
      // int[], double[], String[]... 모든게 자료형이다.

      int[] result = null;			// result 배열을 초기화해줌

      if (number2 != 0) {			// if 문을 사용할때 딱좋음============
         result = new int[] { number1 / number2, number1 % number2 };	// result[0] 은 나누기 , result [1]은 나머지값 
      }

      // 리턴값은 단 1개이다.
      // 여러 개를 리턴한다면 꼭 묶어서 보내자
      return result;													
   }

   // 두 정수의 덧셈과 뺄셈을 구해주는 메소드
   int[] getResult(int number1, int number2) {					// 입력받아올 매개변수 2개설정
      return new int[] { number1 + number2, number1 - number2 };	// 리턴값에 정수 2개 더한값을 1번째자리, 뺀값을 2번째자리
   }

   // 1 ~ n까지의 합을 구해주는 메소드
   int getTotal(int end) {	// end 를 반환하는 매서드
      int total = 0;	// total 을 0으로 초기화
      for (int i = 0; i < end; i++) {	// for문 end만큼 반복
         total += i + 1;	// total 에 i 에 +1 한만큼 계속 total 에 저장하겠다는 코드.
//         total = total + i + 1;
      }
      return total;	 // total을 return
   }
   
   // 홀수는 짝수로, 짝수는 홀수로 리턴
   int change(int number) {		
      return ++number;	
   }
   
//   5개의 정수를 입력받고 최대값과 최소값을 구해주는 메소드
   int[] getMaxAndMin(int[] arData) {
      int[] result = new int[2];
      
      result[0] = arData[0];
      result[1] = arData[0];
      
//      m.getMaxAndMin({})
      
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

//   ★ 고수만 하기
//   위에서 해결한 문제를 아래의 방법으로 해결한다.
//   리턴 타입은 void로 설정하고, 사용하는 부분에서 메소드 내부의 결과값을 사용할 수 있도록 구현
//   		return x			main 에서  {} 안에 적힌 코드를 사용함		
   public static void main(String[] args) {
      MethodTask m = new MethodTask();
      
      
   
      
      
      
      int result = 0;
      int[] arResult = null;
      String message = null;

      m.print1To10();
      m.printHong(10);
      m.printName(10, "한동석");

      result = m.substract(new int[] { 1, 3, 5 });
      System.out.println(result);

      result = m.square(2, 10);
      System.out.println(result);

      arResult = m.divide(10, 3);

      if (arResult == null) {
         System.out.println("0으로 나눌 수 없습니다.");
      } else {
         System.out.println("몫: " + arResult[0] + ", 나머지: " + arResult[1]);
      }

      arResult = m.getResult(10, 4);
      System.out.println(arResult[0] + ", " + arResult[1]);

      message = m.change(10) % 2 == 0 ? "짝수로 변경되었습니다." : "홀수로 변경되었습니다.";
      System.out.println(message);
      
      arResult = m.getMaxAndMin(new int[] { 1, 3, 5, 9, 10 });
      
      System.out.println("최대값: " + arResult[0] + ", 최소값: " + arResult[1]);
      
   }
}

















