package exceptionTest;

import java.util.Scanner;

public class RPG02 {
//   캐릭터 이름을 입력받고,
//   "멍청이", "바보", "똥개"가 포함된 이름은
//   예외를 발생시켜 사용자에게 경고 메세지를 출력해준다.
//   ※ 강제 종료하지 않는다.
   
   void checkNickname(String nickname) throws NicknameException{
      String[] arName = {"멍청이", "바보", "똥개"};
      
      for (int i = 0; i < arName.length; i++) {
         if(nickname.contains(arName[i])) {
            throw new NicknameException();
         }
      }
   }
   
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      RPG02 rpg = new RPG02();
      String message = "캐릭터명: ";
      String nickname = null;
      
      System.out.print(message);
      nickname = sc.next();
      
      try {
         rpg.checkNickname(nickname);
         System.out.println("캐릭터명: " + nickname);
      } catch (NicknameException e) {
         System.out.println("사용할 수 없는 닉네임입니다.");
      }
   }
}












