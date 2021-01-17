package stream;

import java.util.Arrays;

public class IntArrayTest {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		
		int sum = Arrays.stream(arr).sum();
		int count = (int)Arrays.stream(arr).count();
		
		System.out.println(sum);
		System.out.println(count);
		
		System.out.println();
		
		// 배열의 모든 연산 더하기 stream.reduce 활용하기
		System.out.println(Arrays.stream(arr).reduce(0, (a,b)->a+b));
		
	}
	
}
