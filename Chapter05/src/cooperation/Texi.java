package cooperation;

public class Texi {

	int texiNumber;
	int passengerCount;
	int money;
	
	public Texi(int texiNumber) {
		this.texiNumber = texiNumber;
	}
	
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	
	public void showBusInfo() {
		System.out.println(texiNumber + "�� �ý��� �°��� " + passengerCount + "�� �̰�, ������ " + money + "�� �Դϴ�.");
	}
}
