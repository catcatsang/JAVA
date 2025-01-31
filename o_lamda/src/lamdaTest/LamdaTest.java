package lambdaTest;

public class LambdaTest {
   public static void main(String[] args) {
//      익명 클래스로 구현하기에는 코드가 길고 복잡하다.
//      LambdaInter lambdaInter = new LambdaInter() {
//         
//         @Override
//         public boolean checkMulipleOf10(int number) {
//            // TODO Auto-generated method stub
//            return false;
//         }
//      };
      
//      어차피 메소드 1개 있는 함수형 인터페이스기 때문에 그냥 아래와 같이 람다쓰자!
//      리턴만 하면 되기 때문에 중괄호 쓸 필요 없다.
//      lambdaInter에 구현된 클래스의 필드 주소값이 들어간다.
//      따라서 lambdaInter에 구현된 자식 클래스가 들어갔기 때문에 up casting 되었다.
      LambdaInter lambdaInter = (number) -> number % 10 == 0;
      System.out.println(lambdaInter.checkMulipleOf10(97));
      
   }
}



















