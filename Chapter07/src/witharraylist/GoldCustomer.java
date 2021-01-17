package witharraylist;

public class GoldCustomer extends Customer {

	double salseRatio;
	
	public GoldCustomer() {
		
		initGoldCustomer();
		
	}
	
	public GoldCustomer(int customerID, String customerName) {
		
		super(customerID, customerName);
		initGoldCustomer();
	}
	
	private void initGoldCustomer() {
		customerGrade = "GOLD";
		bonusRatio = 0.02;
		salseRatio = 0.1;
	}
	
	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price * salseRatio);
	}
	
}
