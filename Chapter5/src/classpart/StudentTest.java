package classpart;

public class StudentTest {

	public static void main(String[] args) {
		
		Student studentLee = new Student(2016112621, "�Ȱ濬");
		studentLee.address = "����";
		
		studentLee.showStudentInfo();

		Student studentKim = new Student("�Ȱ��");
		studentKim.address = "����";
		
		studentKim.showStudentInfo();
		
		System.out.println(studentLee);
		System.out.println(studentKim);

		
	}

}
