package chapter9.sort;

public interface Sort {
	
	void ascedning(int[] arr);
	void descedning(int[] arr);
	
	default void description() {
		System.out.println("���ڸ� �����ϴ� �˰��� �Դϴ�.");
	}
}
