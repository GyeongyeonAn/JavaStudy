package classpart;

public class StudentTest {

	public static void main(String[] args) {
		
		Student studentLee = new Student(2016112621, "안경연");
		studentLee.address = "서울";
		
		studentLee.showStudentInfo();

		Student studentKim = new Student("안경범");
		studentKim.address = "경주";
		
		studentKim.showStudentInfo();
		
		System.out.println(studentLee);
		System.out.println(studentKim);

		
	}

}
