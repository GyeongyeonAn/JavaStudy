package lambda;

public class TestStringConcat {

	public static void main(String[] args) {
		
		StringConImpl impl = new StringConImpl();
		impl.makeString("Hello", "world");
		
		// ���ٽ��� ���� : Ŭ���� ������ �ʿ䰡 ����. �������̽� ������ ���� ����.
		StringConcat concat = (s, v) -> System.out.println(s + ", " + v);
		concat.makeString("Hello", "world");
		
		// �͸� Ŭ���� : ���ٽĺ��� �ڵ尡 ���� ������.
		StringConcat concat2 = new StringConcat() {
			
			@Override
			public void makeString(String s1, String s2) {
				System.out.println(s1 + ", " + s2);
			}
		};
		
		concat2.makeString("hello", "world");
		
		
	}

}