package lambdaEx;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class LambdaEx01 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			list.add(i);
		}
		list.forEach(System.out::print); // List의 모든 요소를 출력
		System.out.println();
		list.forEach(i -> System.out.print(i+" "));
		
		list.removeIf(x -> x % 2 == 0 || x % 3 == 0);
		System.out.println();
		System.out.println(list);
		
		list.replaceAll(i -> i * 10);
		System.out.println(list);
		Collections.sort(list,Collections.reverseOrder());
		System.out.println(list);
	}

}
