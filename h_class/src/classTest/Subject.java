package classTest;
	

public class Subject {
//  과목명
  String name;	// 과목의 이름 문자열을 전역변수로 선언했다, 
//  과목 점수
  int score;	// 과목의 점수를 즉 정수,를  전역변수로 선언
  
  public Subject() {;}

  public Subject(String name, int score) {
     this.name = name;			// 매개변수 name 값을 클래스의 name 변수에 할당합니다.
//     	this 키워드를 사용하여 클래스 변수와 매개변수를 구분합니다.
     this.score = score;		// 매개변수 scroe 의 값을 클래스의 score 변수에 할당합니다.
//     	this 키워드는 같은 이름의 매개변수와 전역 변수를 명확히 구분하는 데 사용됩니다.
  }
}
