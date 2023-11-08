package chapter_06;

import java.util.*;

public class ArrayExample_Move2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] seat = new String[7]; // �¼�
		boolean run = true;
		int menu; // ������ �޴�
		int pplNum; // ������ �����ο�
		int seatNum; // ������ �¼���ȣ
		int total = 0; // �� �����
		int index = 0; // �����ο��� 2�� �̻��� ��쿡 ���̴� �ε���

		for (int i = 0; i < 7; i++) {
			seat[i] = " "; // �¼� ��ġ �⺻�� ����
		}

		while (run) {
			for (int i = 0; i < 7; i++) {
				System.out.print("[" + seat[i] + "]"); // �¼� ��ġ
			}
			System.out.println();
			System.out.println("=�ް� ��ȭ��=");
			System.out.println("1.�¼�����");
			System.out.println("2.����");
			System.out.print("�޴� ���� : ");
			menu = scan.nextInt();

			switch (menu) {
			case 1:
				for (int i = 0; i < 3; i++) { // ¦���� �ڸ��� X�� ������ �������� ��ȯ
					if (seat[2 * i + 1] == "X")
						seat[2 * i + 1] = " ";
				}
				index = 0; // �ε��� �� �ʱ�ȭ
				
				System.out.print("���� �ο��� �Է��ϼ���[1~7] :");
				pplNum = scan.nextInt();
				if (pplNum >= 1 && pplNum <= 7) { // �����ο� : 1�� �̻�, 7�� ����
					if (pplNum == 1) { // �����ο� : 1��
						System.out.print("�¼���ȣ ����[1~7] : ");
						seatNum = scan.nextInt();
						if (seatNum >= 1 && seatNum <= 7) { // 1~7 ������ �¼���ȣ ����
							if (seatNum % 2 == 0) { // ¦�� �ڸ� ���� �õ�
								System.out.println("�����ο��� 1���� ��� ¦���� �ڸ��� ���� �Ұ����մϴ�.");
								for (int i = 0; i < 3; i++)
									if (seat[2 * i + 1] != "O") // ¦���� �ڸ��� ���ſϷ�� �¼��� ������
										seat[2 * i + 1] = "X";
							} else {
								if (seat[seatNum - 1] == "O") { // ������ �¼���ȣ�� �̹� ���ſϷ� ������
									System.out.println("�̹� ���Ű� �Ϸ�� �ڸ��Դϴ�.");
								} else { // ���� ���� (1��)
									seat[seatNum - 1] = "O";
									total += 12000;
								}
							}
						} else { // �¼���ȣ ���� �ʰ� (�����ο� 1�� case)
							System.out.println("�߸��� �¼���ȣ�Դϴ�.");
						}
					} else { // �����ο� : 2�� �̻�
						System.out.print("�¼���ȣ ����[1~7] : ");
						seatNum = scan.nextInt();
						if (seatNum >= 1 && seatNum <= 7) { // 1~7 ������ �¼���ȣ ����
							if(pplNum + seatNum - 1 > 7) // ���� �ο��� �����Ϸ��� �ڸ����� ���� ���
								System.out.println("���� �ο��� �����Ϸ��� �ڸ����� �����ϴ�.");
							else{
								// ������ �¼���ȣ���� ���� �ο��� ä������ ��, ���ſϷ�� �ڸ��� ��ġ���� Ȯ��
								for(int i=seatNum;i<seatNum+pplNum;i++) { 
									if(seat[i-1] == "O") { // ��ġ�� ���
										index = -1; // �ε����� -1���� ����
										System.out.println("�̹� ���Ű� �Ϸ�� �ڸ��Դϴ�.");
									}
								}
								
								if(index == 0) { // ������ �¼���ȣ���� ���� �ο��� ä������ ��, ���ſϷ�� �ڸ��� ��ġ�� ���� �ϳ��� ���� ���
									for(int i=seatNum;i<seatNum+pplNum;i++) { // ������ �¼���ȣ���� ���� �ο��� ä���ֱ�
										seat[i-1] = "O";
										total += 12000;
									}
								}
							}
						} else { // �¼���ȣ ���� �ʰ� (�����ο� 2�� �̻� case)
							System.out.println("�߸��� �¼���ȣ�Դϴ�.");
						}
					}
				} else { // �����ο� ���� �ʰ�
					System.out.println("���� �ο��� �߸��Ǿ����ϴ�.");
				}

				break;
			case 2:
				run = false; // �ݺ��� ����
				System.out.println("�����: " + total + "��");
				break;
			default:
				System.out.println("������ �� ���� �޴��Դϴ�.");
				break;
			}
		}

		scan.close();
	}
}
