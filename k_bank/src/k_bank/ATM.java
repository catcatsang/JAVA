package k_bank;

import java.util.Random;
import java.util.Scanner;

public class ATM {
   public static void main(String[] args) {
//      2차원 배열(3행 100열)
      Bank[][] arrBank = new Bank[3][100];
      int[] arCount = new int[3]; // 사람이 입력하는거랑 
      String message = "1. 신한은행\n2. 국민은행\n3. 카카오뱅크\n4. 나가기";
      String menu = "1. 계좌개설\n2. 입금하기\n3. 출금하기\n4. 잔액조회\n5. 계좌번호 찾기\n6. 은행 선택 메뉴로 돌아가기";

      Scanner sc = new Scanner(System.in);
      Random r = new Random();

      Bank user = null, temp = null;
      int bankNumber = 0, choice = 0;
      String account = "";
      String name = null;
      String password = null;
      String phone = null;
      String[] phoneNumbers = null;
      int money = 0;

      String[] arName = { "신한은행", "국민은행", "카카오뱅크" };
      String accountMessage = "계좌번호: ";
      String nameMessage = "예금주: ";
      String passwordMessage = "비밀번호(4자리): ";
      String phoneMessage = "핸드폰번호(- 포함): ";
      String depositMessage = "입금액: ";
      String withdrawMessage = "출금액: ";
      String errorMessage = "다시 시도해주세요.";
      String loginFailMessage = "계좌번호 혹은 비밀번호를 다시 확인해주세요.";

      while (true) {
//    	  
         System.out.println(message); // message 를 출력함	
         bankNumber = sc.nextInt();		// Scanner 를 통해서 bankNumber 

         if (bankNumber == 4) { 	 // bankNumber 4일때 break while문 탈출 
            break;	
         }

         while (true) {				
            System.out.println(menu);		
            choice = sc.nextInt();		// choice 에 int 값을 전달함

            if (choice == 6) {
               break;
            }

            switch (choice) {		// swithch 의 choice 값에 따라 case 가 실행됨;
            // 계좌 개설
            case 1:
               account = ""; // 계좌 번호를저장하기위해 문자열로 저장
               Bank[] arBank = { new Shinhan(), new Kookmin(), new Kakao() }; // arBank의 각각 배열값에 생성자 신한 국민 카카오를 넣음, 신한 국민 카카오 는 이미 상속을 받은상태 이므로 객체 생성이 가능하다! ... 
               user = arBank[bankNumber - 1]; // user에 사용자가 누른 숫자에 -1 을 넣어서 배열의 자리값과 맞춘다.

               while (true) {
                  for (int i = 0; i < 6; i++) {	 // 6번 반복을 시작함 
                     account += r.nextInt(10);	// 랜덤 r.nextInt(10) 은 0~10 사이에 정수를 랜덤으로 6개 뽑아서 account에 저장함, 
//                     그리고 랜덤은 String 으로 리턴되기때문에 + 를 사용해서 이어붙힘.
                  }	
                  if (Bank.checkAccount(arrBank, arCount, account) == null) { // 계좌를 확인해주는 매서드에서 return 값이 null이면 while 문 탈출
                     break;	// 즉, 계좌를 검사했을때 중복이 없다면 생성하기위해서 while 문을 탈출해서 계좌를 생성하는 코드로 이동,
                  }
               }

               account = bankNumber + account; // account 에 bankNumber 에 랜덤으로 뽑힘 6자리 정수를 더하면 String 타입이기때문에
//               합쳐집니다.
               // 
               
               

               user.setAccount(account);	 // user의 타입은 bank 타입으로 null 로 초기화되었다, 그래서 bank필드를 사용할수있다, bank필드는 private로 선언되있기때문에 setAccount로 접근을 가능하게했다!!!!
               user.setBankName(arName[bankNumber - 1]);
//               은행의 이름을 저장하는 코드인데 , arname 의 배열 bankNumber - 1 자리값을 setBankName 안에있는 bankname에 저장한다
               System.out.println(nameMessage); 
               
               name = sc.next();
//             name 에 문자열을 입력받음

               while (true) {
                  System.out.println(phoneMessage);
                  phone = sc.next(); // 010-9866-5612
                  phoneNumbers = phone.split("-"); // {010, 9866, 5612} "-" 기준으로 나눠서 배열로 만듬,

                  if (phoneNumbers.length == 3) { // phoneNumber 배열크기가 3과 같을때 
                     if (phoneNumbers[0].length() == 3) {	// 0배열주소값 , 첫번째 배열값 의 크기가 3과 같을때
                        if (phoneNumbers[1].length() == 3 || phoneNumbers[1].length() == 4) { //두번째 배열 값의 길이가 3일때, 또는 phoneNumber 의 1두번쨰 값의 크기가 4일
                           if (phoneNumbers[2].length() == 4) {	// 세번쨰 배열의 자리 값의 크기가 4일때
                              phone = phone.replaceAll("-", ""); // phone 의 값에서 "-" 을 " " 로 바꾼다는 뜻, - 를 없애고 빈문자열로 쓰겠다~ 라는뜻이다.
                              temp = Bank.checkPhone(arrBank, arCount, phone); // Bank 의 매서드인 핸드폰 번호를 중복검사하는 매서드를 호출함, 리턴된 값을 temp 에 저장한다.
                              if (temp == null) { // temp 의 저장된값이 null 과 같다면 break; 멈추겠다는뜻
//                            	  if 문을 멈추겠다는 뜻이다. 그래서 104번째줄에 에러메세지를 표시함
                                 break;
                              }
                           }
                        }
                     }
                  }

                  System.out.println(errorMessage);

               }
               user.setPhone(phone);// setter 로 privata 접근제어자로 선언되있는 phone 을 가져옴

               while (true) {
                  System.out.println(passwordMessage);
                  password = sc.next();	// password 를 입력받음 next() 이니까 문자열
                   if (password.length() == 4) {	// paword 에 배열크기가 4와 같다면 while 문을 멈춘다
                     break;
                  }
                   	// 비밀번호 자리수가 같지않다면 에러메세지 후에 다시 반복
                  System.out.println(errorMessage);
               }
                
               user.setPassword(password);

               arrBank[bankNumber - 1][arCount[bankNumber - 1]] = user; // 2차원 배열,2중 배열인데, 
//               arr 배열 크기안에
               
               
               
               arCount[bankNumber - 1]++;

               System.out.println(arName[bankNumber - 1] + " 가입을 진심으로 환영합니다!");
               System.out.println(name + "님의 소중한 계좌번호: " + account);
               break;

//            입금하기
            case 2:
               System.out.println(accountMessage);
               account = sc.next();

               System.out.println(passwordMessage);
               password = sc.next();

               user = Bank.login(arrBank, arCount, account, password);

               if (user != null) {
                  // 계좌를 개설한 은행인지 검사
                  if (bankNumber != user.getAccount().charAt(0) - 48) {
                     System.out.println(user.getBankName() + "에서만 입금 서비스를 이용하실 수 있습니다.");
                     break;
                  }

//                  아래와 같은 검사는 사실상 불가능하다.
//                  if (bankType instanceof Shinhan) {
//                     depositCheck = user instanceof Shinhan;
//                     
//                  } else if (bankType instanceof Kookmin) {
//                     depositCheck = user instanceof Kookmin;
//                     
//                  } else if (bankType instanceof Kakao) {
//                     depositCheck = user instanceof Kakao;
//                     
//                  }
//
//                  if(!depositCheck) {
//                     if(user instanceof Shinhan) {
//                        bankName = "신한은행";
//                        
//                     }else if(user instanceof Kookmin) {
//                        bankName = "국민은행";
//                        
//                     }else if(user instanceof Kakao) {
//                        bankName = "카카오뱅크";
//                        
//                     }
//                     
//                     System.out.println(bankName + "에서만 입금 서비스를 이용하실 수 있습니다.");
//                     break;
//                  }

                  System.out.println(depositMessage);
                  money = sc.nextInt();

                  user.deposit(money);
                  break;
               }
               System.out.println(errorMessage);
               
               break;

//            출금하기
            case 3:
               System.out.println(accountMessage);
               account = sc.next();

               System.out.println(passwordMessage);
               password = sc.next();

               user = Bank.login(arrBank, arCount, account, password);

               if (user != null) {
                  System.out.println(withdrawMessage);
                  money = sc.nextInt();

                  if (money * (user instanceof Kakao ? 1.3 : 1) <= user.getMoney()) {
                     user.withdraw(money);
                     break;
                  }
               }
               
               System.out.println(errorMessage);
               break;
//            잔액조회
            case 4:
               System.out.println(accountMessage);
               account = sc.next();

               System.out.println(passwordMessage);
               password = sc.next();

               user = Bank.login(arrBank, arCount, account, password);

               if (user != null) {
                  System.out.println(user.showBalance());
                  break;
               }

               System.out.println(errorMessage);
               break;

//            계좌번호 찾기
            case 5:
               account = "";
               System.out.println(phoneMessage);
               phone = sc.next();
               phone = phone.replaceAll("-", "");
               
               System.out.println(passwordMessage);
               password = sc.next();
               
               user = Bank.checkPhone(arrBank, arCount, phone);
               if(user != null) {
                  if(user.getPassword().equals(password)) {
                     if (bankNumber != user.getAccount().charAt(0) - 48) {
                        System.out.println(user.getBankName() + "에서 계좌를 찾으실 수 있습니다.");
                        break;
                        
                     }
                     
                     while (true) {
                        for (int i = 0; i < 6; i++) {
                           account += r.nextInt(10);
                        }
                        if (Bank.checkAccount(arrBank, arCount, account) == null) {
                           break;
                        }
                     }

                     account = bankNumber + account;

                     user.setAccount(account);
                     System.out.println(name + "님의 소중한 계좌번호: " + account);
                  }
               }
               
               break;

            default:
               System.out.println(errorMessage);
            }
         }
      }
   }
}












