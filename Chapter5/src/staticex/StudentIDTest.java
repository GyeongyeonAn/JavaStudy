package staticex;

public class StudentIDTest {

	public static void main(String[] args) {

		Student studentLee = new Student("Lee");
		
		System.out.println(Student.getSerialNum());

		Student studentKim = new Student("Kim");
		
		System.out.println(studentKim.getStudentID());
		System.out.println(studentLee.getStudentID());
	}

}
