package card;

public class CardCompany {

	private static CardCompany instance = new CardCompany();
	private static int serialNumber = 10000; 
	
	private CardCompany() {
		
	}
	
	public static CardCompany getInstance() {
		if(instance == null) {
			instance = new CardCompany();
		}
		return instance;
	}
	
	public static int getSerialNumber() {
		return serialNumber;
	}

	public Card createCard() {
		serialNumber++;
		return new Card(serialNumber);
	}
	
}
