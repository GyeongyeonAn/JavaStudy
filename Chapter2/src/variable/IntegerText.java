package variable;

public class IntegerText 
{

	public static void main(String[] args) 
	{
		byte bs = 127; // 1byte -128 ~ 127까지 표현
		System.out.println(bs);
		
		// 왜 오류가 뜨는가? 자바에서는 기본적으로 숫자 자체를 4바이트를 넣고 어사인한다.
		long lVal = 12345678900L; // '숫자L'로 해결 
	}

}
