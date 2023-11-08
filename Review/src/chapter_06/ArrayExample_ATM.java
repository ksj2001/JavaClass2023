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
			System.out.println("1.가입");
			System.out.println("2.탈퇴");
			System.out.println("0.종료");
			System.out.print("메뉴 선택 : ");
			menu = scan.nextInt();
			index = 0;

			switch (menu) {
			case 1:
				if (cnt >= 5) {
					System.out.println("더이상 가입할 수 없습니다.");
					break;
				}

				System.out.print("[가입]계좌번호 입력 : ");
				accs[cnt] = scan.nextInt();
				for (int i = 0; i < cnt; i++) {
					if (accs[i] == accs[cnt]) {
						System.out.println("계좌번호가 중복됩니다.");
						accs[cnt] = 0;
						index = -1;
					}
				}
				if (index != -1) {
				System.out.print("[가입]비밀번호 입력 : ");
				pws[cnt] = scan.nextInt();
				cnt++;
				}
				break;

			case 2:
				if (cnt < 1) {
					System.out.println("더 이상 탈퇴할 수 없습니다.");
					break;
				}

				System.out.println("삭제할 값을 입력하세요.");
				int value = scan.nextInt();

				delIndex = -1;
				for (int i = 0; i < cnt; i++) {
					if (accs[i] == value) {
						delIndex = i;
					}
				}
				if (delIndex == -1) {
					System.out.println("존재하지 않는 값입니다.");
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
