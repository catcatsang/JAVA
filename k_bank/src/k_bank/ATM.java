package k_bank;

import java.util.Random;
import java.util.Scanner;

public class ATM {
   public static void main(String[] args) {
//      2차원 배열(3행 100열)
      Bank[][] arrBank = new Bank[3][100];
      int[] arCount = new int[3];
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
         System.out.println(message);
         bankNumber = sc.nextInt();

         if (bankNumber == 4) {
            break;
         }

         while (true) {
            System.out.println(menu);
            choice = sc.nextInt();

            if (choice == 6) {
               break;
            }

            switch (choice) {
            // 계좌 개설
            case 1:
               account = "";
               Bank[] arBank = { new Shinhan(), new Kookmin(), new Kakao() };
               user = arBank[bankNumber - 1];

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
               user.setBankName(arName[bankNumber - 1]);

               System.out.println(nameMessage);
               name = sc.next();

               while (true) {
                  System.out.println(phoneMessage);
                  phone = sc.next();
                  phoneNumbers = phone.split("-");

                  if (phoneNumbers.length == 3) {
                     if (phoneNumbers[0].length() == 3) {
                        if (phoneNumbers[1].length() == 3 || phoneNumbers[1].length() == 4) {
                           if (phoneNumbers[2].length() == 4) {
                              phone = phone.replaceAll("-", "");
                              temp = Bank.checkPhone(arrBank, arCount, phone);
                              if (temp == null) {
                                 break;
                              }
                           }
                        }
                     }
                  }

                  System.out.println(errorMessage);

               }
               user.setPhone(콜);

               while (true) {
                  System.out.println(passwordMessage);
                  password = sc.next();
                  if (password.length() == 4) {
                     break;
                  }

                  System.out.println(errorMessage);
               }

               user.setPassword(password);

               arrBank[bankNumber - 1][arCount[bankNumber - 1]] = user;
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

                  user.deposit(돈);
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
                     user.withdraw(돈);
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












