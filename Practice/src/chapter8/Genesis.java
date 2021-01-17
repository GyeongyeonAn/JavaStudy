package chapter8;

public class Genesis extends Car{

	@Override
	protected void start() {
		System.out.println("Genesis 시동을 켭니다.");
	}

	@Override
	protected void drive() {
		System.out.println("Genesis 달립니다.");
	}

	@Override
	protected void stop() {
		System.out.println("Genesis 멈춥니다.");
	}

	@Override
	protected void turnOff() {
		System.out.println("Genesis 시동을 끕니다.");
	}
	
}
