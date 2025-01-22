package inhTest;

class Animal {
   String name;
   int age;
   String feed;

   // 자식에서는 항상 super()라는 부모의 기본 생성자를 호출하기 때문에
   // 앞으로는 기본 생성자를 필수적으로 만들어놓자!
   public Animal() {;}
   
   public Animal(String name, int age, String feed) {
      super();
      this.name = name;
      this.age = age;
      this.feed = feed;
   }
   
   void walk() {
      System.out.println("걷기");
   }
   
   void run() {
      System.out.println("뛰기");
   }
   
   void eat() {
      System.out.println("먹기");
   }
}

class Lion extends Animal {
   public Lion() {;}
   
   void hunt() {
      System.out.println("사냥 하기");
   }
   
   @Override
   void walk() {
      System.out.print("네 발로 ");
      super.walk();
//      System.out.println("네 발로 걷기");
   }
}

public class InhTest02 {
   public static void main(String[] args) {
      Lion lion = new Lion();
      
      lion.walk();
   }
}


















