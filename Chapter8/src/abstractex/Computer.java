package abstractex;

// 추상 클래스
// 추상 클래스는 단독으로 사용하려는 목적이 아니라. 하위 클래스에서 사용되기 위한 목적임.
public abstract class Computer {

	// 추상 메서드
	// 구현의 책임을 하위 클래스에게 위임한다.
	public abstract void display();
	public abstract void typing();
	
	public void turnOn() {
		System.out.println("전원을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("전원을 끕니다.");
	}
	
}
