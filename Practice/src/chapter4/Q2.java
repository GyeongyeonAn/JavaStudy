package chapter4;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int lineCount;
		
		do {
			System.out.print("Ȧ���� �Է��ϼ���. : ");
			lineCount = scanner.nextInt();	
		}while(lineCount % 2 != 1);	
		
		int spaceCount = lineCount/2;
		int starCount = 1;
		
		/*
         0 1 * 3 4		i = 0
         0 * * * 4		i = 1
         * * * * *		i = 2
         	i = 3
         0 1 * 3 4	0 * * * 4		i = 4
		*/
		
		for(int i=0; i < lineCount; i++) {

			for(int j=0; j < spaceCount; j++) {
				System.out.print(' ');
			}
			
			for(int j=0; j < starCount; j++) {
				System.out.print('*');
			}
			
			for(int j=0; j < spaceCount; j++) {
				System.out.print(' ');
			}
	
			// ���� ������ �þ�� �κ�
			if(i < lineCount/2) {
				starCount += 2;
				spaceCount--;
				
			}
			// ���� ������ �پ��� �κ�
			else {
				starCount -= 2;
				spaceCount++;
			}
			
			System.out.println();
			
		}
		
	}
}
