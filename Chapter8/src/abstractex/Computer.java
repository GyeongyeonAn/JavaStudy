package abstractex;

// �߻� Ŭ����
// �߻� Ŭ������ �ܵ����� ����Ϸ��� ������ �ƴ϶�. ���� Ŭ�������� ���Ǳ� ���� ������.
public abstract class Computer {

	// �߻� �޼���
	// ������ å���� ���� Ŭ�������� �����Ѵ�.
	public abstract void display();
	public abstract void typing();
	
	public void turnOn() {
		System.out.println("������ �մϴ�.");
	}
	
	public void turnOff() {
		System.out.println("������ ���ϴ�.");
	}
	
}
