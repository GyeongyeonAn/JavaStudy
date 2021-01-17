package coffee;

public class CoffeeTest {

	public static void main(String[] args) {

		Person Kim = new Person("Kim", 10000);
		Person An = new Person("An", 1000000);
		
		StarCoffee starCoffee = new StarCoffee();
		BeanCoffee beanCoffee = new BeanCoffee();

		Kim.buyStarCoffee(starCoffee, Menu.STARMERICANO);
		An.buyBeanCoffee(beanCoffee, Menu.BEANLATTE);
		
		
	}

}
