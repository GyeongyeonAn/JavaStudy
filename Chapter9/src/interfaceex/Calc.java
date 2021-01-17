package interfaceex;

public interface Calc {

	double PI = 3.14;
	int ERROR = -999999999;
	
	int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	
	// dafault 메서드나 static 메서드
	// interface에서 구현하는 메서드를 만들고 싶을 때	
	default void description() {
		System.out.println("정수 계산기를 구현합니다.");
		myMethod();
	}
	
	static int total(int[] arr) {
		int total = 0;
		
		for(int i : arr) {
			total += i;
		}
		myStaticMethod();
		return total;
	}
	
	// private 메서드 (Java 9 부터 제공)
	// 구현하는 default 메서드에 깔끔하게 메서드를 만들어서 넣고 싶을 떄
	private void myMethod() {
		System.out.println("private method");
	}
	
	// 구현하는 static 메서드에 깔끔하게 메서드를 만들어서 넣고 싶을 떄
	private static void myStaticMethod() {
		System.out.println("private static method");

	}
}
