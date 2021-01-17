package chapter6;

import java.util.ArrayList;

public class Student {

	private String studentName;
	private ArrayList<Book> bookList;
	
	public Student(String studentName) {
		this.studentName = studentName;
		bookList = new ArrayList<Book>();
	}
	
	public void addBook(String title) {
		Book book = new Book(title);
		bookList.add(book);
	}
	
	public void showStudentInfo() {
		
		System.out.print(studentName + " �л��� ���� å�� : ");
		for(Book book : bookList) {
			System.out.print(book.getTitle() +" ");
		}
		System.out.println("�Դϴ�");
	}
	
}
