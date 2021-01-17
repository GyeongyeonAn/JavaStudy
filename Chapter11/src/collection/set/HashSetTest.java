package collection.set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {

	public static void main(String[] args) {

		HashSet<String> set = new HashSet<String>();
		set.add("�̼���");
		set.add("������");
		set.add("������");
		set.add("�̼���");
		
		
		// ������� ��µǴ� ���� �ƴ�, �ߺ��� ������ ����.
		System.out.println(set);
		
		// ������� �ϳ��� �������� �ʹٸ� iterator�� ����Ѵ�.
		Iterator<String> ir = set.iterator();
		
		while(ir.hasNext()) {
			String str = ir.next();
			System.out.println(str);
		}
		
	}

}
