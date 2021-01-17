package array;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {

		// 자료구조의 '노드'와 유사.
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		
		for(int i=0; i<list.size(); i++) {
			String str = list.get(i);
			System.out.println(str);
		}
		
		// 향상된 for 문
		for(String s : list) {
			System.out.println(s);
		}
	}

}
