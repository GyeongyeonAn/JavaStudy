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
		System.out.println(texiNumber + "번 택시의 승객은 " + passengerCount + "명 이고, 수입은 " + money + "원 입니다.");
	}
}
