package staticex;

// public 클래스는 하나만 있어야 하고, 파일 이름과 반드시 동일해야 한다.
public class Student {
	
	private static int serialNum = 1000;
	private int studentID;
	
	public String studentName;
	public String address;
	
	public Student(String name) {
		studentName = name;
		serialNum++;
		studentID = serialNum;
	}
	
	public Student(int id, String name) {
		studentID = id;
		studentName = name;
		address = "주소 없음";
		serialNum++;
		studentID = serialNum;
	}
	
	
	public void showStudentInfo() {
		System.out.println(studentName + ',' + address);
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public int getStudentID() {
		return studentID;
	}

	// static 메서드는 인스턴스를 만들기 전부터 생성됨.
	// static이 아닌, heap메모리에 있는 인스턴스 property나 method를 사용할 수 없음.
	public static int getSerialNum() {
		return serialNum;
	}

	public static void setSerialNum(int serialNum) {
		Student.serialNum = serialNum;
	}
	
	
}
