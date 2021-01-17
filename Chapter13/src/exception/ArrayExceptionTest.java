package exception;

public class ArrayExceptionTest {

	public static void main(String[] args) {

		int[] arr = new int[5];
		
		// 서버가 죽지 않고 예외처리 된다. 
		try {
			for(int i=0; i<=5; i++) {
				System.out.println(arr[i]);
			}
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
			System.out.println("에외처리");
		}
		System.out.println("프로그램 종료");
	}
}
