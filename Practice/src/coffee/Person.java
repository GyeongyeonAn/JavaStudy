package coffee;

public class Person {

	private String name;
	private int money;
	
	public Person(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	public String getName() {
		return name;
	}
	
	public int getMoney() {
		return money;
	}
	
	public void setMoney(int money) {
		this.money = money;
	}
	
	public void buyStarCoffee(StarCoffee starCoffee, int money) {
		starCoffee.setMoney(money);
		this.money -= money;
		if(money == 4000) {
			System.out.println(name + "���� " + money + "���� �� �ٹ� �Ƹ޸�ī�븦 �����߽��ϴ�.");
		}
		else if(money == 4300) {
			System.out.println(name + "���� " + money + "���� �� �ٹ� �󶼸� �����߽��ϴ�.");
		}
	}
	
	public void buyBeanCoffee(BeanCoffee beanCoffee, int money) {
		beanCoffee.setMoney(money);
		this.money -= money;
		if(money == 4100) {
			System.out.println(name + "���� " + money + "���� �� �ٹ� �Ƹ޸�ī�븦 �����߽��ϴ�.");
		}
		else if(money == 4500) {
			System.out.println(name + "���� " + money + "���� �� �ٹ� �󶼸� �����߽��ϴ�.");
		}
	}
	
}
