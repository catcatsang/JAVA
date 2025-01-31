package list.test;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListTest {
   public static void main(String[] args) {
      // <?>: 제네릭(이름이 없는)
      // 객체화할 때 타입을 지정하는 기법
      // 자료구조를 설계할 때 데이터의 타입을 지정할 수 없기 때문에 임시로 타입을 선언한다.
      // 따로 다운 캐스팅할 필요가 없으며, 지정할 타입에 제한을 줄 수 있기 때문에 Object와 목적이 다르다.
      
      ArrayList<Integer> datas = new ArrayList<Integer>();	// ArrayList는 가변길이의 배열
//      자바의 컬렉션 프레임워크 클래스다, 
//      new 생성자로 새로운 객체 datas 생성,
//      
      System.out.println(datas.size());
//      ArrayList 의 메소드 size 배열의 크기를 확인함.
//      datas 는 비어있는 ArrayList 객체를 참조하고있다.
      System.out.println("++++++++++++++++++++++++++++++++++++++++");
      datas.add(40); 	//	datas 리스트에 40을 추가
      datas.add(50);	//  datas 리스트에 50을 추가
      datas.add(90);	//  datas 리스트에 90을 추가
      datas.add(70);	// 
      datas.add(10);
      datas.add(80);
      datas.add(30);
      datas.add(20);
      
      System.out.println(datas);
      System.out.println(datas.size());	// datas add 된 값만큼 배열크기 출력.
      
      Collections.sort(datas);	// datas 리스트를 오름차순 정렬.
      System.out.println(datas);	
      
      Collections.reverse(datas);	// datas 리스트를 내림차순 정렬,
      System.out.println(datas);
      
      Collections.shuffle(datas);	// datas 리스트를 랜덤하게 섞음,
      System.out.println(datas);
      
//      추가(삽입), 60은 항상 30뒤에 삽입한다.
      if(datas.contains(30)) {	// datas 리스트에 30이 포함되어있니?
         datas.add(datas.indexOf(30) + 1, 60);	// datas 리스트에 30이 들어있는 배열주소값의 다음자리에 60을 datas.add() 추가한다는듰.
         System.out.println(datas);	
      }else{
         System.out.println("30은 없습니다.");	// 만약 30이없다면 출력 "30은 없습니다.";
      }
      
//      수정, 10을 1로 수정한다.
      if(datas.contains(10)) {	// datas 리스트에 10이 포함되어있니?
         System.out.print("수정 전: ");	
         System.out.println(datas.set(datas.indexOf(10), 1));	
         // datas 리스트에서 10의 값을가진 주소값을 1로 바꾸겠다. 
         
         System.out.println("수정 후: ");
         System.out.println(datas);
      }else {
         System.out.println("10이 없습니다.");
      }
      
      
//      삭제(값으로 삭제), 20을 삭제한다.
      if(datas.remove(Integer.valueOf(20))) {	
//    	  Integer 타입의 20이라는 값을 datas 리스트에서 삭제
         System.out.println("삭제 성공");
//         삭제되면 출력 "삭제 성공"
//         출력과 동시에 datas 리스트도 출력
         System.out.println(datas);
         
      }else {
         System.out.println("삭제 실패");
      }
      
//      삭제(인덱스로 삭제), 50을 삭제한다.
      int i = datas.indexOf(50);
//      int 타입의 i 에 datas 리스트의 값의 위치를 넣음,
//      
      if(i != -1) {	// 몰랐는데 indexOf() 에서 값의 위치를못찾으면 -1을 반환함,
//    	i 가   -1 이 아닐때 
         System.out.println(datas.remove(i) + " 삭제 성공");
//         i 에 인덱스 값을 넣었으므로 datas 의 50의 위치값 index 값이 삭제됨
         System.out.println(datas);
      }else {
         System.out.println("삭제 실패");
      }
      
//      조회
//      System.out.println(datas.get(3));
      for(int data: datas) {
//    	  이 for문은 int 타입의 data 에 datas 리스트들을 차례로 저장하겠다는뜻
         System.out.println(data);
      }
   }
}


















