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
		set.add("aaa"); // HashSet은 중복이 허용되지 않기 때문에 더 이상 저장이 되지 않는다.
		System.out.println(set);
	}

}
