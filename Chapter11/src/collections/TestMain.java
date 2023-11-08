package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestMain {

	public static void main(String[] args) {
		List list = new ArrayList<>();
		
		Collections.addAll(list, 1,2,3,4,5);
		System.out.println(list);
		
		Collections.rotate(list, 2); // 오른쪽으로 두 칸 이동
		System.out.println(list);
		
		Collections.swap(list, 1, 3);
		System.out.println(list); // 두 번째 값과 네 번째 값이 서로 바뀐다.
		
		Collections.shuffle(list);
		System.out.println(list); // 무작위로 값을 섞는다.
		
		Collections.sort(list);
		System.out.println(list); // 오름차순 정렬
		
		Collections.sort(list, Collections.reverseOrder());
		System.out.println(list); // 내림차순(역순) 정렬
		
		Collections.fill(list, 2); // list의 요소를 모두 2로 채운다.
		System.out.println(list);
		
		Collections.replaceAll(list, 2, 1); // list 안에 있는 2를 모두 1로 바꾼다.
		System.out.println(list);
		
		List newList = Collections.nCopies(list.size(), 3);
		System.out.println(newList);

		System.out.println(Collections.disjoint(list, newList)); // 교집합이 없으면 true, 있으면 false
		
		System.out.println(Collections.frequency(list, 1)); // 빈도수를 출력한다.
		
		Collections.copy(list, newList); // 뒤에 있는 newList의 요소가 List의 요소로 복사됨
		System.out.println(list);
		
		
		
		ArrayList<String> list2 = new ArrayList<>();
		Collections.addAll(list2, "포도","바나나","오렌지","딸기","사과");
		
		// binarySearch를 사용하기 전에 반드시 정렬을 먼저 진행한다.
		Collections.sort(list2);
		System.out.println(list2);
		System.out.println(Collections.binarySearch(list2, "사과"));
		
		
		
		
		
		
	}

}
