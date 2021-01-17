package coffee;

public class BeanCoffee {
	
	private int money;

	public BeanCoffee() {
		this.money = 0;
	}

	public BeanCoffee(int money) {
		this.money = money;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money += money;
	}
	

}
