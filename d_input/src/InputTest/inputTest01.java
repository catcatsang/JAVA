package InputTest;

import java.util.Scanner;

public class inputTest01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String name = null;
		System.out.print("이름:");
//		sc.next();
		sc.nextLine();
		System.out.println(name + "님 환영합니다!");
	}
}
