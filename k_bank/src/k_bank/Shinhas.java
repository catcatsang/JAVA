package k_bank;

public class Shinhas extends Bank {
	@Override
	public int showBalance() {
		setMoney(getMoney() / 2);
		return super.showBalance();
	}

}
