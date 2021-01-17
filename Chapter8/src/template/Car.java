package template;

public abstract class Car {

	// 반드시 구현해야 하는 기능이라면 "abstract Method"로 설계한다.
	public abstract void drive();
	public abstract void stop();
	
	public void startCar() {
		System.out.println("시동을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("시동을 끕니다.");
	}
	
	public void WashCar() {}
	
	// 탬플릿 : 견본, 시나리오, 틀을 만드는 것. = 프레임워크랑 동일함.
	// 정해직 logic대로 동작하도록 하기 위함.
	// 재정의 할 수 없도록 final 키워드를 넣어준다. 
	final public void run() {
		startCar();
		drive();
		stop();
		turnOff();
		WashCar();
	}
	
}
