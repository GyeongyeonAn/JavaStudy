package stream.coffee;

public class CoffeeTest {

	public static void main(String[] args) {

		Coffee americano = new KenyaAmericano();
		americano.brewing(); 
		System.out.println();
		
		Coffee KenyaLatte = new Latte(new KenyaAmericano());
		KenyaLatte.brewing();
		System.out.println();
		
		Coffee etiopiaAmericano = new Mocha(new Latte(new EtiopiaAmericano()));
		etiopiaAmericano.brewing();
	}

}
