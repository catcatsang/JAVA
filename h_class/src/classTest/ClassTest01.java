package classTest;

class A {
//	전역 변수 (Global variable)
//	새로운 new를 만나면 메모리 해제
//	자동 초기화
	int data;
	
	void printData() {
//		지역 변수(Local variable)
//		닫는 중괄호(})를 ㅁㄴ나면 메모리 해제
//		직접 초기화
//		int data = 0;
		System.out.println(data);
	}
}

public class ClassTest01 {
	public static void main(String[] args) {
		A a = new A();
		System.out.println(a);
		
		
	}
	
}
