package chapter5;

public class MyDateTest {

	public static void main(String[] args) {
		
		MyDate date1 = new MyDate(32, 2, 2000);
		System.out.println(date1.isValid());
		MyDate date2 = new MyDate(2, 10, 1000);
		System.out.println(date2.isValid());

	}

}
