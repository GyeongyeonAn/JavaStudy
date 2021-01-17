package exception;

public class AutoCloseTest {

	public static void main(String[] args) {
		
		try(AutoCloseObj obj = new AutoCloseObj()){
			// 시험삼아 강제로 Exception을 발생시킴
			throw new Exception();
			
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}

}
