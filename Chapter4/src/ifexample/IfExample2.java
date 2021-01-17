package ifexample;

import java.util.Scanner;

public class IfExample2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("나이를 입력하세요. : ");
		int age = scanner.nextInt();
		
		int charge = 0;
		
		if (age < 8) {
			charge = 1000;
		}
		else if (age < 14) {
			charge = 1500;
		}
		else if (age < 20) {
			charge = 2000;
		}
		else {
			charge = 3000;
		}
		
		System.out.println("나이 : " + age);
		System.out.println("요금 : " + charge);

	}

}
