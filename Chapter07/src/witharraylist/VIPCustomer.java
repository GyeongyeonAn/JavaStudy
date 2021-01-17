package witharraylist;

public class VIPCustomer extends Customer{

	double salseRatio;
	private int agentID;
	
	public VIPCustomer() {
		initVIPCustomer();
	}
	
	public VIPCustomer(int customerID, String customerName, int agentID) {
		
		super(customerID, customerName);
		
		this.agentID = agentID;
		initVIPCustomer();

	}
	
	private void initVIPCustomer() {
		customerGrade = "VIP";
		bonusRatio = 0.05;
		salseRatio = 0.1;
	}

	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price * salseRatio);
	}
	
	@Override
	public String showCustomerInfo() {
		return super.showCustomerInfo() + " 담당 상담원 번호는 " + agentID + "입니다.";
	}
	
	
}
