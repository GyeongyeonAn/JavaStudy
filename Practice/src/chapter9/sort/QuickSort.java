package chapter9.sort;

public class QuickSort implements Sort{

	@Override
	public void ascedning(int[] arr) {
		System.out.println("QuickSort ascedning");
	}

	@Override
	public void descedning(int[] arr) {
		System.out.println("QuickSort descedning");
	}

	@Override
	public void description() {
		Sort.super.description();
		System.out.println("QuickSort �Դϴ�.");
	}

}
