package m_interface;

//	interface 는 설계도 라고보면된다!, 인터페이스를 구현하는 클래스는 인터페이스에 정의된 메소드를 무조건
//	재정의 해야한다,
//	인터페이스는 메소드만 가능항다!

public interface Animal {

//	인터페이스 Animal을 선언 
//	Animal 을 구현하는 클래스들은 Animal 의 정의된 메서드들을 재정의 해야만한다
	
//	final static int eyes = 2; final static 이생략되어있따.
//	int eyes = 2;
	int nose = 1;

	abstract void showHands();

	void sitdown();

	void poop();

}
