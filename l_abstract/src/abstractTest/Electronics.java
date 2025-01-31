package abstractTest;

//    abstract 는 추상클래스

//		상속받아서 기능구현함, 그래서 틀만 만들어놓고 기능구현 오버라이딩을 통해 구현함.

public abstract class Electronics {
//   무조건 재정의(구현)해라!
//	 기능이구현이 안돼어있고 매서드 선언(?) 만 한상태
//	 abstract 는 추상 메소드다 on, off 만 보고는 어떤 기능을 할지 모른다, 그래서 
//	 오버라이드 를 사용해서 재정의를 해줘야한다.
   public abstract void on();
   public abstract void off();
   
//   골라서 재정의해라!
//   일반 메소드는 꼭 재정의 할필요는없다, 
//   하지만 재정의가 필요하다면 가능!
   public void printProduct() {
      System.out.println("전자제품");
   }
   
//   재정의 하지마라!
//   final 상수, 재정의를 할수없음, 
   public final void sos() {
      System.out.println("긴급 전화");
   }
}