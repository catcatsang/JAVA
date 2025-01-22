package classTest;

class Animal {
	String name;
	int age;
	String feed;
	
	void shleep() {
		System.out.println(this.name + "쿨쿨");
	}
	
	void introduce() {
		System.out.println("name");
	}
	
//	Animal() {
//		System.out.println("기본 생성자 ㅎ출됨");
//	}
	
	Animal(String name, int age, String feed) {
		this.name = name;
		this.age= age;
		this.feed = feed;
	}
}


public class ClassTest02 {
	public static void main(String[] args) {
		Animal lion = new Animal("사자",4,"사슴");
		
//		lion.name = "사자";
//		lion.age = 4;
//		lion.feed = "사슴";
		
		
		
		
	}
}
