package list.task.user;

import java.util.Base64;
import java.util.HashMap;
import java.util.Random;

import org.json.simple.JSONObject;

import list.task.DBConnecter;
import net.nurigo.java_sdk.api.Message;
import net.nurigo.java_sdk.exceptions.CoolsmsException;

public class UserService {
   private static final int CERTIFICATED_NUMBER_LENGTH = 5;
   public static Long id;

//   이메일 중복검사
//   화면으로부터 사용자가 작성한 이메일을 받아온다.
   public User findByUserEmail(String email) {
//      빠른 for문(향상된 for문), forEach
//      DB에 있는 회원들을 순서대로 하나씩 user객체에 담아준다.
      for (User user : DBConnecter.users) {
//         DB에 있는 회원들의 이메일을 가져와서 사용자가 작성한 이메일과 같은지 검사
         if (user.getEmail().equals(email)) {
//            중복이 있을 때,
//            그 회원을 통채로 리턴한다.
//            Why? : 다른 메소드에서 이 리턴값을 활용하기 위해서
//            보통 서버에서는 boolean으로 리턴한다.
            id = user.getId();
            return user;
         }
      }
//      만약 중복된 이메일이 없으면, 이쪽으로 와서 null을 리턴한다.
      return null;
   }

//   회원가입
//   사용자가 입력한 회원의 전체 정보를 한 번에 받아온다.
   public void join(User user) {
//      전달받은 정보 중, 비밀번호를 암호화(인코딩)해서
      user.setPassword(encrpyt(user.getPassword()));
//      저장소에 저장한다.
      DBConnecter.users.add(user);
   }

//   로그인
//   사용자로부터 이메일과 비밀번호를 전달받는다.
   public User login(String email, String password) {
//      위에서 정의해놓은 이메일 검사 메소드를 통해 이메일 검사 진행.
      User user = findByUserEmail(email);

//      1. user가 null이 아닐 경우
//         정상 이메일
      if (user != null) {
//         그 이메일을 가진 회원의 비밀번호와 사용자가 전달한 비밀번호를 비교한다.
//         ★ 단, 회원가입시 비밀번호를 인코딩했기 때문에 비교할 때에도 인코딩하여
//         인코딩된 비밀번호끼리 비교해야한다!
         if (user.getPassword().equals(encrpyt(password))) {
//            로그인 성공
//            성공한 회원 정보 통채로 리턴
            id = user.getId();
            return user;
         }
      }
//      2. user가 null일 경우
//      잘못된 이메일
      return null;
   }

//   로그아웃
   public void logout() {
      id = null;
   }

//   암호화(인코딩)
//   원본 비밀번호를 전달받는다.
   public String encrpyt(String password) {
//      인코딩 방식 중, base64방식으로 비밀번호 문자열 값의 각 byte를 모두 인코딩시킨다.
      return new String(Base64.getEncoder().encode(password.getBytes()));
   }

//   개인 정보 수정(마이페이지)
   public void update(User newUser) {
      for (User user : DBConnecter.users) {
         if (user.getId() == newUser.getId()) {
            // 수정 완료
            user = newUser;
         }
      }
   }

//   비밀번호 변경
//   1. 로그인 후 비밀번호 변경
//   기존 비밀번호를 검사한 뒤 변경시킨다.
   public boolean checkPassword(String password) {
      for (User user : DBConnecter.users) {
         if (user.getId() == id) {
            if (user.getPassword().equals(encrpyt(password))) {
               return true;
            }
         }
      }
      return false;
   }

//   2. 로그인 전 비밀번호 변경
   public void changePassword(String newPassword) {
      for (User user : DBConnecter.users) {
         if (user.getId() == id) {
            user.setPassword(encrpyt(newPassword));
         }
      }
   }

//   비밀번호 찾기
//   SMS API를 사용해서 임시 비밀번호 발송
   public void sendPassword(String phone) {
      String api_key = "";
      String api_secret = "";
      Message coolsms = new Message(api_key, api_secret);
      String temp = makePassword();

      // 4 params(to, from, type, text) are mandatory. must be filled
      HashMap<String, String> params = new HashMap<String, String>();
      params.put("to", phone);
      params.put("from", "01000000000");
      params.put("type", "SMS");
      params.put("text", temp);
      params.put("app_version", "test app 1.2"); // application name and version

      System.out.println(temp);

//    임시 비밀번호로 기존 비밀번호 변경
      for (User user : DBConnecter.users) {
         if (user.getPhone().equals(phone)) {
            user.setPassword(encrpyt(temp));
         }
      }

//       try {
//         JSONObject obj = (JSONObject) coolsms.send(params);
//         
////          임시 비밀번호로 기존 비밀번호 변경
//          for(User user: DBConnecter.users) {
//             if(user.getPhone().equals(콜)) {
//                user.setPassword(encrpyt(temp));
//             }
//          }
//         
//         System.out.println(obj.toString());
//       } catch (CoolsmsException e) {
//         System.out.println(e.getMessage());
//         System.out.println(e.getCode());
//       }
   }

//   랜덤한 5자리 임시 비밀번호 생성
   private String makePassword() {
      Random random = new Random();
      String passwordCharacter = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%^&*()-_=+0123456789";
      String temp = "";

      for (int i = 0; i < CERTIFICATED_NUMBER_LENGTH; i++) {
         temp += passwordCharacter.charAt(random.nextInt(passwordCharacter.length()));
      }

      return temp;
   }

//   인증번호 발송
   public String sendCertificatedNumber(String phone) {
      String api_key = "";
      String api_secret = "";
      Message coolsms = new Message(api_key, api_secret);
      String certificatedNumber = makeCertificatedNumber();

      // 4 params(to, from, type, text) are mandatory. must be filled
      HashMap<String, String> params = new HashMap<String, String>();
      params.put("to", phone);
      params.put("from", "01000000000");
      params.put("type", "SMS");
      params.put("text", certificatedNumber);
      params.put("app_version", "test app 1.2"); // application name and version

      System.out.println(certificatedNumber);

//       try {
//         JSONObject obj = (JSONObject) coolsms.send(params);
//         System.out.println(obj.toString());
//       } catch (CoolsmsException e) {
//         System.out.println(e.getMessage());
//         System.out.println(e.getCode());
//       }
      return certificatedNumber;
   }

//   인증번호 생성
   private String makeCertificatedNumber() {
      Random random = new Random();
      String certificatedNumber = "";

      for (int i = 0; i < CERTIFICATED_NUMBER_LENGTH; i++) {
         certificatedNumber += random.nextInt(10);
      }

      return certificatedNumber;
   }

//   회원 번호로 회원 조회
   public User findById() {
      if (id == null) {
         return null;
      }

      for (User user : DBConnecter.users) {
         if (user.getId() == id) {
            return user;
         }
      }

      return null;
   }

}
