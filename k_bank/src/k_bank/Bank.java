package k_bank;

public class Bank {
//   변수
//   예금주
   private String name; // private 접근제어자 외부클래스에서 접근할수 없고 메서드를 통해서만 접근 가능
   
//  외부에서 멤버 변수에 직접 접근하지 못하도록 보호(캡슐화)라고함
//   데이터를 직접변경하지 못하게 해서 getter, setter 를 사용해서 접근하게함
   
//   계좌번호
   private String account;

//   핸드폰번호
   private String phone;

//   비밀번호
   private String password;

//   잔액(통장)
   private int money;

//   은행명
   private String bankName;

   public Bank() {
      ;
   }
   // 기본 생성자 인데 , 객체를 초기화 한다고함, 
//   기본 생성자는 아무 매개변수도 받지않음, 객체 생성하지만 변수 값 초기화는안함
   
   public Bank(String name, String account, String phone, String password, int money, String bankName) {
      super();		// 부모 클래스의 생성자를 호출
//      생성자에 전달된 값을 멤버 변수에 대입,
//      this 는 객체 자신을 참조하는 키워드로, 멤버 변수와 매개변수를 구분할 때 사용됩니다.
      this.name = name;			
      this.account = account;
      this.phone = phone;
      this.password = password;
      this.money = money;
      this.bankName = bankName;
   }
//      name의 값을 반환함, 즉 this.name = class Bank 필드의 name
//   	접근제어자가 private 이기때문에 getter 메서드를 사용해서 반환함.
//   	setter 내부에 조건을 추가해 잘못된 값 설정을 방지할수 있음?
   public String getName() {
      return name;
   }
//       name 의 값을 수정할수있음, 매개변수를통해 값을 저장해서 , 
   public void setName(String name) {
      this.name = name;
   }
//      
   public String getAccount() {
      return account;
   }

   public void setAccount(String account) {
      this.account = account;
   }

   public String getPhone() {
      return phone;
   }

   public void setPhone(String phone) {
      this.phone = phone;
   }

   public String getPassword() {
      return password;
   }

   public void setPassword(String password) {
      this.password = password;
   }

   public int getMoney() {
      return money;
   }
//   
   public void setMoney(int money) {
      this.money = money;
   }

   public String getBankName() {
      return bankName;
   }

   public void setBankName(String bankName) {
      this.bankName = bankName;
   }

   // 계좌번호 중복검사
   public final static Bank checkAccount(Bank[][] arrBank, int[] arCount, String account) {
//	   public 이 메서드는 클래스 외부에서도 호출할수있다.
//	   final 이 메서드는 오버라이드 불가 , 즉 상수다, 수정이불가하다, 
//	   객체 생성없이 클래스 이름으로 호출가능, Bank.checkAccount();
	   
      for (int i = 0; i < arrBank.length; i++) {
//    	   반복문 for문에 arrBank 배열에 크기만큼 반복한다는뜻,
//    	  즉 arrBank 2중배열인데 행먼저 접근하여 은행 갯수가 3개니까 3번 반복함
         for (int j = 0; j < arCount[i]; j++) {
//        	 현재 3개의 계좌가 있다고 할때 100개의 계좌를 저장할수있지만 , 
//        	 3개의 계좌가 data에 저장되 있기때문에 3번만 반복수를 돌려 비교하게한다.
        	 
            if (arrBank[i][j].account.equals(account)) {
//            	은행에 저장되있는 배열 , 안에있는 , 계좌를 , equals 비교하겠다(입력한 계좌)
               return arrBank[i][j];
//               그리고 비교한 값을 반환한다. 다시 사용하기 위해서? 안하면 어떻게될까
            }
         }
      }

      return null;
//      왜 null을 리턴하지? , 
      
   }

//   핸드폰번호 중복검사
   public final static Bank checkPhone(Bank[][] arrBank, int[] arCount, String phone) {
//	   public 이 메소드는 클래스 외부에서도 호출가능,
//	   final 이 메서드는 오버라이드 불가함
//	  static 제어문 객체값을 공유하기위해 사용함 생성없이 클래스 이름으로 호출가능함, Bank.checkPhone();
      for (int i = 0; i < arrBank.length; i++) {
//    	  for 반복문이다, arrBank.length 는 arrBank 의 배열크기만큼 반복한다는뜻인데
//    	  arrBank.length 는 2중배열인데, 행먼저 시작하기때문에 3번 반복한다,
         for (int j = 0; j < arCount[i]; j++) {
//        		반복문에 arCount[i] 만큼 반복하겠다는건데, 
//        	  이 반복문에 목적은 
            if (arrBank[i][j].phone.equals(phone)) {
               return arrBank[i][j];
//               반복문을 통해 중복되는 계좌를 찾으면 그 계좌를 리턴함 
//               
            }
         }
      }

      return null;
//      만약 중복 계좌를 못찾으면 null 반환
   }

//   로그인
   public static final Bank login(Bank[][] arrBank, int[] arCount, String account, String password) {
//	   public 메소드는 클래스 외부에서도 호출가능,
//	   final 메소드는 오버라이드 불가, 즉 상수, 수정 불가
//	   static 메소드는 은 모든 객체가 공유하
      Bank user = checkAccount(arrBank, arCount, account);
//      Bank 타입의 클래스의 user 객체는 checkAccount의 매개변수 arrBank, arCount, account 의 값을 담는다.
      if (user != null) {
         if (user.password.equals(password)) {
            return user;
         }
      }
      return null;
   }

//   입금
   public void deposit(int money) {
      this.money += money;
   }

//   출금
   public void withdraw(int money) {
      this.money -= money;
   }

//   잔액 조회
   public int showBalance() {
      return this.money;
   }
}
