package arraylist;
import java.util.*;
public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<Integer> num = new ArrayList<>(); // ArrayList �迭 ����
		// add(��)�޼���� �� �߰�
		num.add(10);
		num.add(20);
		num.add(30);
		num.add(40);
		num.add(50);
		System.out.println(num);
		
		// add(index, ��)�޼���� ����
		num.add(1, 60);
		System.out.println(num);
		
		// remove(index)�޼���� ����
		num.remove(1);
		System.out.println(num);
		
		// get(index)�޼���� �ε����� ���� ����
		System.out.println(num.get(3));
		
		// set(index, ��)�޼���� ����
		num.set(4, 55);
		System.out.println(num);
		
		// size()�޼���� ArrayList�� ũ��
		System.out.println(num.size());
		
		// indexOf(��)�޼���� �迭�� ���� �����ϸ� �� ���� �ִ� �ε�����ȣ�� ��µ�
		// ���� �������� ������ -1�� ���
		System.out.println(num.indexOf(25));
		System.out.println(num.indexOf(55));
		
		// �迭 ����� �� for��
		for(int i=0;i<num.size();i++) {
			System.out.println(num.get(i));
		}
		
		// * for(�ڷ��� ������ : �迭 or ArrayList)
		//        �ݺ��� ����
		System.out.println("============");
		for(int nu:num) {
			System.out.print(nu+" ");
		}
		System.out.println();
		
		// clear()�޼���� �迭 �ʱ�ȭ
		num.clear();
		System.out.println(num);
		
		// isEmpty()�޼���� �迭�� �����̸� TRUE
		if(num.isEmpty()) {
			System.out.println("�迭�� ���� �������� �ʽ��ϴ�.");
		}
	}

}
