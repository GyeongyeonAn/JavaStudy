package template;

public abstract class Car {

	// �ݵ�� �����ؾ� �ϴ� ����̶�� "abstract Method"�� �����Ѵ�.
	public abstract void drive();
	public abstract void stop();
	
	public void startCar() {
		System.out.println("�õ��� �մϴ�.");
	}
	
	public void turnOff() {
		System.out.println("�õ��� ���ϴ�.");
	}
	
	public void WashCar() {}
	
	// ���ø� : �ߺ�, �ó�����, Ʋ�� ����� ��. = �����ӿ�ũ�� ������.
	// ������ logic��� �����ϵ��� �ϱ� ����.
	// ������ �� �� ������ final Ű���带 �־��ش�. 
	final public void run() {
		startCar();
		drive();
		stop();
		turnOff();
		WashCar();
	}
	
}
