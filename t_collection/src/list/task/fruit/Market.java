package list.task.fruit;

import java.util.List;

import list.task.DBConnecter;

public class Market {
//   과일 이름 검사
   public Fruit checkName(String name) {
      for(Fruit fruit: DBConnecter.fruits) {
         if(fruit.getName().equals(name)) {
            return fruit;
         }
      }
      return null;
   }
   
//   과일 추가
   public void save(Fruit fruit) {
      DBConnecter.fruits.add(fruit);
   }
   
//   과일 삭제
   public void delete(Fruit fruit) {
      DBConnecter.fruits.remove(fruit);
   }
   
   public void delete(String name) {
      Fruit fruit = checkName(name);
      
      if(fruit != null) {
         DBConnecter.fruits.remove(fruit);
      }
   }
   
//   과일 가격이 평균 가격보다 낮은 지 검사
   public boolean checkPrice(Fruit newFruit) {
      int total = 0;
      double average = 0.0;
      
      for(Fruit fruit: DBConnecter.fruits) {
         total += fruit.getPrice();
      }
      
      average = (double)total / DBConnecter.fruits.size();
      return average > newFruit.getPrice();
   }
   
//   과일 전체 조회
   public List<Fruit> findAll(){
      return DBConnecter.fruits;
   }
   
//   과일 이름으로 가격 조회
   public int findPrice(String name) {
      Fruit fruit = checkName(name);
      if(fruit != null) {
         return fruit.getPrice();
      }
      return -1;
   }
}
















