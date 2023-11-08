package chapter_06;

import java.util.*;

public class ArrayExample_ATM {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] accs = { 1001, 1002, 0, 0, 0 };
		int[] pws = { 1111, 2222, 0, 0, 0 };
		int cnt = 2;
		int menu;
		int index;
		int delIndex;

		boolean run = true;
		while (run) {
			for (int i = 0; i < cnt; i++) {
				System.out.println(i + 1 + "." + accs[i] + ":" + pws[i]);
			}
			System.out.println();
			System.out.println("1.����");
			System.out.println("2.Ż��");
			System.out.println("0.����");
			System.out.print("�޴� ���� : ");
			menu = scan.nextInt();
			index = 0;

			switch (menu) {
			case 1:
				if (cnt >= 5) {
					System.out.println("���̻� ������ �� �����ϴ�.");
					break;
				}

				System.out.print("[����]���¹�ȣ �Է� : ");
				accs[cnt] = scan.nextInt();
				for (int i = 0; i < cnt; i++) {
					if (accs[i] == accs[cnt]) {
						System.out.println("���¹�ȣ�� �ߺ��˴ϴ�.");
						accs[cnt] = 0;
						index = -1;
					}
				}
				if (index != -1) {
				System.out.print("[����]��й�ȣ �Է� : ");
				pws[cnt] = scan.nextInt();
				cnt++;
				}
				break;

			case 2:
				if (cnt < 1) {
					System.out.println("�� �̻� Ż���� �� �����ϴ�.");
					break;
				}

				System.out.println("������ ���� �Է��ϼ���.");
				int value = scan.nextInt();

				delIndex = -1;
				for (int i = 0; i < cnt; i++) {
					if (accs[i] == value) {
						delIndex = i;
					}
				}
				if (delIndex == -1) {
					System.out.println("�������� �ʴ� ���Դϴ�.");
					index = -1;
				}
				if (index != -1) {
					for (int i = delIndex; i < cnt - 1; i++) {
						accs[i] = accs[i + 1];
						pws[i] = pws[i + 1];
					}
					accs[cnt - 1] = 0;
					pws[cnt - 1] = 0;
					cnt--;
				}
				break;

			case 0:
				run = false;
				break;
			}
		}

		scan.close();
	}
}
