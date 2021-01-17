package object;

class Student {
	int studentID;
	String studentName;
	
	public Student(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			// 다운 캐스팅 해줘야 함.
			Student std = (Student)obj;
			return this.studentID == std.studentID;
		}
		else
			return false;
	}

	@Override
	public int hashCode() {
		return studentID;
	}

	
}

public class EqualsTest {

	public static void main(String[] args) {

		Student Lee = new Student(100, "이순신");
		Student Lee2 = Lee;
		Student Shin = new Student(100, "이순신");
		
		 System.out.println(Lee == Shin);
		 System.out.println(Lee == Lee2);
		 System.out.println(Lee.equals(Shin));
		 
		 System.out.println(Lee.hashCode());
		 System.out.println(Shin.hashCode());
		 
		 Integer i1 = new Integer(100);
		 Integer i2 = new Integer(100);
		 
		 System.out.println(i1.equals(i2));
		 System.out.println(i1.hashCode());
		 System.out.println(i2.hashCode());
		 
		 System.out.println(System.identityHashCode(i1));
		 System.out.println(System.identityHashCode(i2));
	}

}
