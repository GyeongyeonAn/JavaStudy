package ifexample;

import java.util.Scanner;

public class SwitchCaseTesk {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("몇 월입니까 : ");
		int month = scanner.nextInt();
		int day;
		
		switch(month) {
			case 1 : case 3 : case 5 : case 7 : case 8 : 
			case 10 :  case 11 : case 12 : 
				day = 31;
				break;
			case 2 : 
				day = 28;
				break;
			case 4 : case 9 : 
				day = 29;
				break;
			case 6 : day = 30;
				break;
			default:
				day = 0;

		}
		
		System.out.println(day + "일 입니다.");
	}

}
