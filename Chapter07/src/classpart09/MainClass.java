package classpart09;

import java.util.Arrays;

public class MainClass {
	public static void main(String[] args) {
		int[] x = new int[5]; // �Ű����� �� ���� 
		ClassEx9 c = new ClassEx9();
		c.test1(x);
		System.out.println("�л����� = "+Arrays.toString(x));
		System.out.println("�л����� = "+c.scoreTotal(x));
		System.out.println("�л���ü��� = "+c.scoreAverage(x));
		System.out.println("1�� ���� = "+c.searchFirst(x));
		System.out.println("�õ� ���� = "+c.searchLast(x));
	}
}
