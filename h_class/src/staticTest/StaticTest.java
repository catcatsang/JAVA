package staticTest;

class Data {
   int data;
   // 생성자가 아닌 컴파일러가 메모리에 할당해준다.
   // 즉, 생성자 호출에 영향을 받지 않는다.
   // 클래스당 단 1개만 만들어지기 때문에 모든 객체가 공유할 수 있다.
   // 모든 객체가 공유해야 하는 필드가 있다면 static을 붙여준다.
   static int dataS;
   
   public Data() {;}

   public Data(int data) {
      this.data = data;
   }

   void increase() {
      System.out.println(++data);
   }
   
   void increseS() {
      System.out.println(++dataS);
   }
   
}

public class StaticTest {
   public static void main(String[] args) {
      Data data = new Data();
      
      data.increase();
      data.increase();
      data.increase();
      data.increase();
      data.increase();
      
      data = new Data();
      
      data.increase();
      data.increase();
      data.increase();
      data.increase();
      data.increase();
      
      System.out.println("====================");
      
      data.increseS();
      data.increseS();
      data.increseS();
      data.increseS();
      data.increseS();
      
      data = new Data();
      
      data.increseS();
      data.increseS();
      data.increseS();
      data.increseS();
      data.increseS();
   }
}

























