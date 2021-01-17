package collection.treeset;

import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {

		TreeSet<String> treeSet = new TreeSet<String>();
		treeSet.add("홍길동");
		treeSet.add("강감찬");
		treeSet.add("이순신");
		
		// 정렬되어 저장됨.
		// Binary Search Tree 구조로 저장되어 있음.
		for(String str : treeSet) {
			System.out.println(str);
		}
	}

}
