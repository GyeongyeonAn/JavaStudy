package witharraylist;

public class Customer {

	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	
	int bonusPoint;
	double bonusRatio;

	public Customer() {

		initCustomer();
	}

	public Customer(int customerID, String customerName)
	{
		this.customerID = customerID;
		this.customerName = customerName;

		initCustomer();
	}
	
	private void initCustomer() {
		customerGrade = "SILVER";
		bonusRatio = 0.01;
	}
	
	// 구매 계산, 보너스 포인트 적립
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price;
	}
	
	// 고객 정보 반환
	public String showCustomerInfo() {
		return getCustomerName() + "님의 등급은 " + customerGrade + "이며, 적립된 보너스 포인트는 " + bonusPoint + "점 입니다.";
	}
	
	// getter, setter
	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}
	
	
}
