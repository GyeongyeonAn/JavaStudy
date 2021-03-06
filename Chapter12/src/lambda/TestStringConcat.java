package lambda;

public class TestStringConcat {

	public static void main(String[] args) {
		
		StringConImpl impl = new StringConImpl();
		impl.makeString("Hello", "world");
		
		// 람다식의 장점 : 클래스 구현이 필요가 업다. 인터페이스 만으로 구현 가능.
		StringConcat concat = (s, v) -> System.out.println(s + ", " + v);
		concat.makeString("Hello", "world");
		
		// 익명 클래스 : 람다식보다 코드가 많고 복잡함.
		StringConcat concat2 = new StringConcat() {
			
			@Override
			public void makeString(String s1, String s2) {
				System.out.println(s1 + ", " + s2);
			}
		};
		
		concat2.makeString("hello", "world");
		
		
	}

}
