package k_bank;

public class Bank {
//   변수
//   예금주
   private String name; // private 접근제어자 외부클래스에서 접근할수 없고 메서드를 통해서만 접근 가능

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

   public Bank(String name, String account, String phone, String password, int money, String bankName) {
      super();
      this.name = name;
      this.account = account;
      this.phone = phone;
      this.password = password;
      this.money = money;
      this.bankName = bankName;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

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
      for (int i = 0; i < arrBank.length; i++) {
         for (int j = 0; j < arCount[i]; j++) {
            if (arrBank[i][j].account.equals(account)) {
               return arrBank[i][j];
            }
         }
      }

      return null;
   }

//   핸드폰번호 중복검사
   public final static Bank checkPhone(Bank[][] arrBank, int[] arCount, String phone) {
      for (int i = 0; i < arrBank.length; i++) {
         for (int j = 0; j < arCount[i]; j++) {
            if (arrBank[i][j].phone.equals(콜)) {
               return arrBank[i][j];
            }
         }
      }

      return null;
   }

//   로그인
   public static final Bank login(Bank[][] arrBank, int[] arCount, String account, String password) {
      Bank user = checkAccount(arrBank, arCount, account);
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
