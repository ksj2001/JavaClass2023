package collection.treeset;

import java.util.TreeSet;

public class TreeTest {

	public static void main(String[] args) {
		TreeSet<String> tr = new TreeSet<>();
		tr.add("a");
		tr.add("c");
		tr.add("b");
		
		System.out.println(tr);
		tr.comparator();
		System.out.println(tr);
	}

}
