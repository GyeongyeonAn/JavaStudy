package chapter6;

public class StudentTest {

	public static void main(String[] args) {

		Student studentLee = new Student("Lee");
		Student studentKim = new Student("Kim");
		Student studentCho = new Student("Cho");
		
		studentLee.addBook("�¹���1");
		studentLee.addBook("�¹���2");
		
		studentKim.addBook("����1");
		studentKim.addBook("����2");
		studentKim.addBook("����3");
		
		studentCho.addBook("�ظ�����1");
		studentCho.addBook("�ظ�����2");
		
		studentLee.showStudentInfo();
		studentKim.showStudentInfo();
		studentCho.showStudentInfo();
	}

}
