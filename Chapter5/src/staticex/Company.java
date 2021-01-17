package staticex;

public class Company {

	private static Company instance = new Company();
	
	// private »ı¼ºÀÚ
	private Company() {
		
	}
	
	public static Company getInstance() {
		if(instance == null) {
			instance = new Company();
		}
		return instance;
	}
	
}
