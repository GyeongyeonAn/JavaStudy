package ifexample;

import java.util.Scanner;

public class IfTesk {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("성적을 입력하세요 : ");
		int grade = scanner.nextInt();
		
		if(90 <= grade) {
			System.out.println("A");
		}
		else if(80 <= grade) {
			System.out.println("B");
		}
		else if(70 <= grade) {
			System.out.println("C");
		}
		else if(60 <= grade) {
			System.out.println("D");
		}
		else {
			System.out.println("F");
		}
	}

}
