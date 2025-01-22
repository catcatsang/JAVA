package classTest;

// 유치원에 아이들이 다닌다.

// 유치원(Kindergarten)
// 이름, 주소, 정원

// 아이(Child)
// 이름, 나이

// 유치원에 다니는 아이들의 이름만 전체 출력
// 단, 3살 이상만 출력하라
public class ClassTask07 {
   public static void main(String[] args) {
      
      Kindergarten 병설유치원 = new Kindergarten(); // Kindergarten .
      //kindergarten 은 클래스이름이다.
//      new kindergarten 은 클래스의 인스턴스(객체화)를 생성하는 코드,
//      병설유치원은 생성된 객체를 참조하는 변수이름, 이변수에는 kindergarten 객체의 주소값이 저장된다.
      
      Child[] children = {	// Child 클래스의 객체를 담을 수 있는 배열을 생성하고, 이를 children 변수에 할당
//    		  children은 이배열의 참조값을 저장하는 변수
         new Child("영희", 3),	// child 클래스의 생성자를 호출하여 새 객체를 생성
//         child 클래스의 생성자를 호출하여 "영희"라는 이름과 3살의 데이터를 가진 객체를생성한다,
         new Child("철수", 5)		// 
         
      };
      
      병설유치원.name = "병설";
      병설유치원.address = "경기도 고양시";
      병설유치원.count = 2;
      병설유치원.children = children;
      
      for(int i=0; i<병설유치원.children.length; i++) {
         if(병설유치원.children[i].age >= 3) {
            System.out.println(병설유치원.children[i].name);
         }
      }
      
//      Child 영희 = new Child();
//      영희.name = "영희";
//      영희.age = 3;
//      
//      병설유치원.name = "병설";
//      병설유치원.address = "경기도 고양시";
//      병설유치원.count = 2;
//      병설유치원.children = new Child[병설유치원.count];
//      병설유치원.children[0] = 영희;
//      
//      System.out.println(병설유치원.name);
//      System.out.println(병설유치원.address);
//      System.out.println(병설유치원.count);
//      System.out.println(병설유치원.children[0].name);
//      System.out.println(병설유치원.children[0].age);
   }
}





















