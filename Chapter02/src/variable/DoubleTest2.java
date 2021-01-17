package variable;

public class DoubleTest2 {

	public static void main(String[] args) {
		
		double dNum = 1;
		
		for(int i = 0; i < 10000; i++) {
			// 부동 소수점 오차로 인해 정확한 숫자가 출력되지 않는다.
			dNum += 0.1;
		}
		
		System.out.println(dNum);
	}

}
