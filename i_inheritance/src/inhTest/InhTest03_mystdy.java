package inhTest;

import inhTest.Hero.Warrior;

//class Hero {
//   int hp;
//   int dmg;
//   
//   public Hero() {;}
//   
//   public Hero(int hp, int dmg) {
//      this.hp = hp;
//      this.dmg = dmg;
//   }
//
//   void getDmg(int dmg) {
//      this.hp -= dmg;
//   }
//   
//   int attack() {
//      return dmg;
//   }
//}================================================================================
//
//class Thor extends Hero {
//   int hammerCount;
//   int shildCount;
//   
//   public Thor() {;}
//   
//   public Thor(int hp, int dmg, int hammerCount, int shildCount) {
//      super(hp, dmg);
//      this.hammerCount = hammerCount;
//      this.shildCount = shildCount;
//   }
//
//   @Override
//   void getDmg(int dmg) {
//      if(shildCount <= 0) {
//         super.getDmg(dmg);
//         return;
//      }
//      dmg -= shildCount;
//      super.getDmg(dmg);
//      shildCount--;
//   }
//   
//   @Override
//   int attack() {
//      int dmg = super.attack();
//      
//      if(hammerCount > 0) {
//         dmg = hammerCount == 1 ? dmg + 1 : (dmg * hammerCount);
//         hammerCount--;
//         return dmg;
//      }
//      
//      return dmg;
//   }
//}

// 원하는 히어로를 클래스로 구현하고 
// Hero 클래스를 상속받아서 구현한다.

// 하늘을 나는 전사, 
// 궁수가 있다.
// 
// hp 는 200, mp = 10, 공격력은 150 , 
// 각 던전이 있고 , 몬스터는 한마리씩공통적으로 공격력은 10, hp 200
// 궁수는 공격시 데미지를 입지않음.
// 턴이 끝나면 hp 10 회복
// 전사는 무조건 2번째 공격때 공격이 안맞음,
class Hero {
	String name;
	int damege;
	int hp;
	boolean fly;

	public Hero() {
		;
	}

	public Hero(int damege, int hp, boolean fly) {

		this.damege = damege;
		this.hp = hp;
		this.fly = fly;
	}

	void getdmg(int damege) {
		this.hp -= damege;

	}

	int attack() {
		return this.damege;
	}
//	=======================================================================================

}

class Warrior extends Hero {
	int money;
	int atkCount;

	public Warrior(int damege, int hp, boolean fly, int money) {
		super(damege, hp, fly);
		this.money = money;
		this.atkCount = atkCount;
	}

	@Override
	void getdmg (int damege) {
		if()
	}

}

class Archer extends Hero {

}

public class InhTest03_mystdy {
	public static void main(String[] args) {

//		Thor thor = new Thor(10, 5, 2, 2);   캐릭 설정
//		thor.getDmg(10); 		공격을 당함
//
//		System.out.println(thor.hp);
//		System.out.println(thor.shildCount);
//
//		System.out.println("입힌 데미지: " + thor.attack());
//		System.out.println(thor.hammerCount);
//		System.out.println("입힌 데미지: " + thor.attack());
//		System.out.println(thor.hammerCount);
//		System.out.println("입힌 데미지: " + thor.attack());
//		System.out.println(thor.hammerCount);

	}
}
