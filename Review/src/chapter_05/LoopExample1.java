package chapter_05;

public class LoopExample1 {

	public static void main(String[] args) {
		// ����1) 1~10���� �ݺ��� 5~9 ���
		for (int a = 1; a <= 10; a++) {
			if (a >= 5 && a <= 9) {
				System.out.print(a + " ");
			}
		}
		System.out.println();
		// ����2) 10~1���� �ݺ��� 6~3 �Ųٷ� ���
		for (int b = 10; b >= 1; b--) {
			if (b >= 3 && b <= 6) {
				System.out.print(b + " ");
			}
		}
		System.out.println();
		// ����3) 1~10���� �ݺ��� ¦���� ���
		for (int c = 1; c <= 10; c++) {
			if (c % 2 == 0) {
				System.out.print(c + " ");
			}
		}
	}
}
