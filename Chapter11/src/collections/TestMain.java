package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestMain {

	public static void main(String[] args) {
		List list = new ArrayList<>();
		
		Collections.addAll(list, 1,2,3,4,5);
		System.out.println(list);
		
		Collections.rotate(list, 2); // ���������� �� ĭ �̵�
		System.out.println(list);
		
		Collections.swap(list, 1, 3);
		System.out.println(list); // �� ��° ���� �� ��° ���� ���� �ٲ��.
		
		Collections.shuffle(list);
		System.out.println(list); // �������� ���� ���´�.
		
		Collections.sort(list);
		System.out.println(list); // �������� ����
		
		Collections.sort(list, Collections.reverseOrder());
		System.out.println(list); // ��������(����) ����
		
		Collections.fill(list, 2); // list�� ��Ҹ� ��� 2�� ä���.
		System.out.println(list);
		
		Collections.replaceAll(list, 2, 1); // list �ȿ� �ִ� 2�� ��� 1�� �ٲ۴�.
		System.out.println(list);
		
		List newList = Collections.nCopies(list.size(), 3);
		System.out.println(newList);

		System.out.println(Collections.disjoint(list, newList)); // �������� ������ true, ������ false
		
		System.out.println(Collections.frequency(list, 1)); // �󵵼��� ����Ѵ�.
		
		Collections.copy(list, newList); // �ڿ� �ִ� newList�� ��Ұ� List�� ��ҷ� �����
		System.out.println(list);
		
		
		
		ArrayList<String> list2 = new ArrayList<>();
		Collections.addAll(list2, "����","�ٳ���","������","����","���");
		
		// binarySearch�� ����ϱ� ���� �ݵ�� ������ ���� �����Ѵ�.
		Collections.sort(list2);
		System.out.println(list2);
		System.out.println(Collections.binarySearch(list2, "���"));
		
		
		
		
		
		
	}

}
