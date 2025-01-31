package classTest;

public class Student {
//   학생 번호
	int id;
//   과목들
	Subject[] arSubject;
//   총점
	int total;
//   평균
	double average;

	public Student() {
		;
	}

// 	Student 의 매개변수가 있는 생성자 이고, 객체는 Student 가 된다. 

	public Student(int id, Subject[] arSubject) {
		// "id" 초기화
//		매개변수로 전달된 "id" 값을 "student" 클래스의 " id" 필드에 저장합니다.
		this.id = id; // student 클래스의 객체에 접근하기위해 사용함

//      

		this.arSubject = arSubject;	// 과목 배열에 접근하기위해 초기화,

		if (arSubject != null) {		// arSubject 에 값이 들어있따면,
			for (int i = 0; i < arSubject.length; i++) {	//과목 배열만큼 반복함,
				this.total += arSubject[i].score;		//총점에 과목 배열의 점수를 모두 더함,
			}
			this.average = (double) this.total / arSubject.length;
			this.average = Double.parseDouble(String.format("%.2f", this.average));
		}
	}
// 객체가 
}
