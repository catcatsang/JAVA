package inhTest;

import java.util.Random;

class Job {

	int money;

	public Job() {
		;
	}

	public Job(int money) {
		super();
		this.money = money;
	}
	// 직업은 괴한이다.
	// 잔고는 1000원이다.
	// 사람을 만났다, 30프로 확률로 도망을가고, 30프로 확률로

	static {

	}

	{

	}

}

class Thief extends Job {
	int speed;

	public Thief() {
		;
	}

	public Thief(int money, int speed) {
		super(money);
		this.speed = speed;
	}

	void doThis() {
		Random random = new Random();
		int rating = 30;		// int rating 의 값을 30 으로 초기화
		int[] arData = new int[10];	// arData 의 배열크기를 10으로 정함,
		for (int i = 0; i < rating / 10; i++) {		// rating을 10으로 나눈만큼 반복함,
			arData[i] = 1;	// rating을 10으로 나눈만큼의 정수만큼 차례로 1을 저장함, 

		}
		
		if (arData[random.nextInt(arData.length)] == 1) {

			System.out.println("30");
			System.out.println("oh! POLICE!");

		} else {
			System.out.println("70");
			money += 1000;
			System.out.println("MEET PERSON");
			System.out.println("money get" + money);
		}

	}

}

public class InhTest04 {
	public static void main(String[] args) {
		Thief thief = new Thief(100, 100);
		thief.doThis();
		thief.doThis();

	}

}
