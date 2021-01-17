package innerclass;

class Outer2 {
	
	int outNum = 100;
	static int sNum = 200;
	
	// �͸� Inner Ŭ����  <<< ���� ���� ����Ѵ�.
	Runnable getRunnable(int i) {
		
		int num = 100;
		return new Runnable() {

			@Override
			public void run() {
				
				System.out.println(num);
				System.out.println(i);
				System.out.println(outNum);
				System.out.println(Outer.sNum);
				
			}
		};
	}
	
	// �͸� Inner Ŭ����  <<< ���� ���� ����Ѵ�.
	// �ȵ���̵� �ۿ��� Ŭ���ϰ� �ڵ鸵 ó���ϴ� �͵� ��� �̷��� �����.
	Runnable runner = new Runnable() {
		
		@Override
		public void run() {
			System.out.println("test");
		}
	};
}

public class AnonymousInnerClssTest {

	public static void main(String[] args) {
		Outer2 outer = new Outer2();
		outer.runner.run();
		
		Runnable runnable = outer.getRunnable(50);
		
		runnable.run();
	}
}