package chapter9.sort;

public class HeapSort implements Sort{
	
	@Override
	public void ascedning(int[] arr) {
		System.out.println("HeapSort ascedning");
	}

	@Override
	public void descedning(int[] arr) {
		System.out.println("HeapSort descedning");
	}

	@Override
	public void description() {
		Sort.super.description();
		System.out.println("HeapSort �Դϴ�.");
	}
}
