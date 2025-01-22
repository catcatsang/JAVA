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

		this.arSubject = arSubject;

		if (arSubject != null) {
			for (int i = 0; i < arSubject.length; i++) {
				this.total += arSubject[i].score;
			}
			this.average = (double) this.total / arSubject.length;
			this.average = Double.parseDouble(String.format("%.2f", this.average));
		}
	}
// 객체가 
}
