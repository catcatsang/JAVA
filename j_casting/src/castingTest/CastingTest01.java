package castingTest;

class Car {
   String brand;
   String color;
   int price;
   
   public Car() {;}

   public Car(String brand, String color, int price) {
      super();
      this.brand = brand;
      this.color = color;
      this.price = price;
   }
   
   void engineStart() {
      System.out.println("시동 켜기");
   }
   
   void engineStop() {
      System.out.println("시동 끄기");
   }
}

class SuperCar extends Car{
   String mode;
   
   @Override
   void engineStart() {
      System.out.println("음성으로 시동 켜기");
   }
   
   void openRoof() {
      System.out.println("뚜따");
   }
   
}

public class CastingTest01 {
   public static void main(String[] args) {
//      up casting
      Car noOptionFerrari = new SuperCar();		// noOptionFerrari 는 SuperCar 에 부모다
      
//      down casting
      SuperCar fullOptionFerrari = (SuperCar)noOptionFerrari;
      
      Car matiz = new Car();
      
//      오류
//      SuperCar brokenFerrai = (SuperCar)new Car();

      System.out.println(noOptionFerrari instanceof Car);
      System.out.println(noOptionFerrari instanceof SuperCar);
      System.out.println(fullOptionFerrari instanceof Car);
      System.out.println(fullOptionFerrari instanceof SuperCar);
      System.out.println(matiz instanceof SuperCar);
      
   }
}




















