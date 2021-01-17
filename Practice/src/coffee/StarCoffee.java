package coffee;

public class StarCoffee {

	private int money;

	public StarCoffee() {
		this.money = 0;
	}

	public StarCoffee(int money) {
		this.money = money;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money += money;
	}
	
}
