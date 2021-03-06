package thread;

import java.util.ArrayList;

// Critical Section
class FastLibrary{
	
	public ArrayList<String> books = new ArrayList<String>();
	
	public FastLibrary() {
		books.add("태백 산맥 1");
		books.add("태백 산맥 2");
		books.add("태백 산맥 3");
	}
	
	public synchronized String lendBook() throws InterruptedException {
	
		// 현재 실행중인 쓰레드를 반환한다.
		Thread t = Thread.currentThread();
		
		// notifyAll로 모든 쓰레드를 깨웠으므로 
		// 다시 wait 해야 하는 쓰레드를 wait 시킨다.
		while(books.size() == 0) {
			System.out.println(t.getName() + " waiting start");
			wait();
			System.out.println(t.getName() + " waiting end");
		}
		
		String title = books.remove(0);
		System.out.println(t.getName() + ": " + title + " lend");
		return title;
	}
	
	public synchronized void returnBook(String title) {
		
		Thread t = Thread.currentThread();
		books.add(title);
		// 더 공평한 방법은 모든 쓰레드를 깨우는 것이다.
		notifyAll();
		System.out.println(t.getName() + ": " + title + " return");
	}
}

class Student extends Thread{
	public void run() {
				
		try {
			String title = LibraryMain.library.lendBook();
			if(title == null) return;
			sleep(5000);
			LibraryMain.library.returnBook(title);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}


public class LibraryMain {

	public static FastLibrary library = new FastLibrary();
	public static void main(String[] args) {

		Student std1 = new Student();
		Student std2 = new Student();
		Student std3 = new Student();
		Student std4 = new Student();
		Student std5 = new Student();
		Student std6 = new Student();
		
		std1.start();
		std2.start();
		std3.start();
		std4.start();
		std5.start();
		std6.start();
		
	}

}
