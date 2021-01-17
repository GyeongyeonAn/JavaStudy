package classpart;

// public Ŭ������ �ϳ��� �־�� �ϰ�, ���� �̸��� �ݵ�� �����ؾ� �Ѵ�.
public class Student {
	
	private int studentID;
	public String studentName;
	public String address;
	
	// ���� ���ϴ� ������ ���� �������� �����ϴ�.
	// ���� �̸��� ���� ������ = �����ε� (�޼��嵵 ����)
	public Student() {
	}
	
	public Student(String name) {
		studentName = name;
	}
	
	public Student(int id, String name) {
		studentID = id;
		studentName = name;
		address = "�ּ� ����";
	}
	
	
	public void showStudentInfo() {
		System.out.println(studentName + ',' + address);
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	
	// main�� Student�� Method�� �ƴϴ�.
	// main�� Ŭ������ �������� ���� �����ϴ� ��.
	public static void main(String[] argc) {
		
		Student studentPark = new Student();	
		studentPark.studentName = "������";
		studentPark.showStudentInfo();
	}
}
