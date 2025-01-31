package abstractTest;

public class Refrigerator extends Electronics {

	
//	Electronics의 on 메소드를 오버라이딩 을 통해 재정의
   @Override
   public void on() {
      System.out.println("버튼을 위로 올려서 전원 켜기");

   }
//	Electronics의 off 메소드를 오버라이딩 을 통해 재정의
   @Override
   public void off() {
      System.out.println("버튼을 아래로 내려서 전원 끄기");

   }
}