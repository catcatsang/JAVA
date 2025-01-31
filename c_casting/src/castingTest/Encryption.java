package castingTest;

public class Encryption {
   public static void main(String[] args) {
      String password = "ehdtjrdl1234";	// password 를 문자열로 초기화,
      String encryptedPassword = "", decryptedPassword = "";	// encryptedPassword 빈문자열로 초기화

      final int KEY = 3;	// 모든 문자열 아스키 코드에 곱할 3, 암호 이기때문에 , key 라고 이름을정함.
      
      for (int i = 0; i < password.length(); i++) {	// password 의 배열크기만큼 반복,
         encryptedPassword += (char)(password.charAt(i) * KEY);	// encryptedPassword 에다가 password의 문자들을 
//         key를 각각곱하여 char로 강제 형변환한뒤에 저장함
      }
      
      System.out.println(encryptedPassword);	
      
      for (int i = 0; i < encryptedPassword.length(); i++) {
         decryptedPassword += (char)(encryptedPassword.charAt(i) / KEY);
      }
      
      System.out.println(decryptedPassword);
   }
}







