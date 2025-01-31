package lambdaTask;

// 함수형 인터페이스 , 추상형 클래스를 한개만 딱 한개만 가지고있다.
@FunctionalInterface

public interface Calc {
	// 두 정수의 연산을 수행하고 리턴하는 추상 메소드 선언
//	정수 2개를 입력는 메소드
//	public 접근제어자, 이 메소드는 어디서나 접근가능하다는 뜻,
//	클래스 외부에서도 접근가능하다!
//	int 타입을 리턴한다는것
//	메서드 이름입니다.     매개변수 정수 2개, 이 메소드를 호출할때 두개의 값을 전달해야함
	public int calc(int num1,int num2);
	
}
