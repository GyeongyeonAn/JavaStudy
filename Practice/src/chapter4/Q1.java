package chapter4;

public class Q1 {

	public static void main(String[] args) {

		int num1 = 10, num2 = 5;
		char operator = '+';
		
		if(operator == '+')
			System.out.println(num1+num2);
		else if(operator == '-')
			System.out.println(num1-num2);
		else if(operator == '*')
			System.out.println(num1*num2);		
		else if(operator == '/')
			System.out.println(num1/num2);
		else
			System.out.println("잘못된 입력입니다.");
	}

}
