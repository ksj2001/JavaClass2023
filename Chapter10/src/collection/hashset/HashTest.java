package collection.hashset;

import java.util.HashSet;
import java.util.Set;

public class HashTest {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		
		set.add("aaa");
		set.add("bbb");
		set.add("ccc");
		
		System.out.println(set);
		set.add("aaa"); // HashSet�� �ߺ��� ������ �ʱ� ������ �� �̻� ������ ���� �ʴ´�.
		System.out.println(set);
	}

}
