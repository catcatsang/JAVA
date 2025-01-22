package classTest;

public class Customer {
   String name;
   int discount;
   int money;
   
   // 오버로딩;
   public Customer() {;}

   public Customer(String name, int discount, int money) {
      this.name = name;
      this.discount = discount;
      this.money = money;
   }
}
