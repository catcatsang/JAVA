package exceptionTest;

import java.util.Scanner;

import javax.management.RuntimeErrorException;

public class RPG01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String message = "닉네임";
		String nickName = null;
		
		System.out.println(message);
		nickName = sc.next();
		
		if(nickName.contains("바보")) {
//			반드시 예외를 처리할 떄 사용하는 클래스.
//			throw new Exception();
			
//			일부러 프로그램을 강제 종료시킬 때에 사용
			
		}
			System.out.println(nickName+"용사님 어소오세요.");	
	}
}
