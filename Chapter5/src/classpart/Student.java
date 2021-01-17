package classpart;

// public 클래스는 하나만 있어야 하고, 파일 이름과 반드시 동일해야 한다.
public class Student {
	
	private int studentID;
	public String studentName;
	public String address;
	
	// 내가 원하는 생성자 형태 여러가지 가능하다.
	// 같은 이름의 여러 생성자 = 오버로딩 (메서드도 가능)
	public Student() {
	}
	
	public Student(String name) {
		studentName = name;
	}
	
	public Student(int id, String name) {
		studentID = id;
		studentName = name;
		address = "주소 없음";
	}
	
	
	public void showStudentInfo() {
		System.out.println(studentName + ',' + address);
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	
	// main은 Student의 Method가 아니다.
	// main은 클래스를 돌려보기 위해 구현하는 것.
	public static void main(String[] argc) {
		
		Student studentPark = new Student();	
		studentPark.studentName = "박은종";
		studentPark.showStudentInfo();
	}
}
