package chapter_05;

import java.util.*;

public class LoopExample7 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int dbAcc1 = 1111; // ���¹�ȣ 1
		int dbPw1 = 1234; // ��й�ȣ 1
		int dbAcc2 = 2222; // ���¹�ȣ 2
		int dbPw2 = 2345; // ��й�ȣ 2

		int menu = -1; // �޴���ȣ
		int inputAcc = 0; // �Է��� ���¹�ȣ
		int inputPw = 0; // �Է��� ��й�ȣ
		String status = "�α׾ƿ�"; // ���� ���� (�α��� or �α׾ƿ�)

		while (true) {
			System.out.println("1.�α���");
			System.out.println("2.�α׾ƿ�");
			System.out.println("0.����");
			System.out.print("�޴� ���� : ");
			menu = scan.nextInt();

			if (menu != 0 && menu != 1 && menu != 2) { // �޴���ȣ�� 0,1,2�� �ƴ� ��
				System.out.println("�߸��� �޴��Դϴ�.");
			}

			else if (menu == 1) { // �α���
				if (status == "�α���") { // ����: �α���
					System.out.println("�̹� �α��ε� �����Դϴ�.");
				} 
				else { // ���� : �α׾ƿ�
					System.out.print("���¹�ȣ �Է� : ");
					inputAcc = scan.nextInt();
					System.out.print("��й�ȣ �Է� : ");
					inputPw = scan.nextInt();

					if ((inputAcc == dbAcc1 && inputPw == dbPw1) // 1�� ����,��й�ȣ ������ ��ġ
					|| (inputAcc == dbAcc2 && inputPw == dbPw2)) { // �Ǵ� 2�� ����,��й�ȣ ������ ��ġ
						System.out.println(inputAcc+"��, ȯ���մϴ�.");
						status = "�α���";
					}
					else { // �α��� ����
						System.out.println("���¹�ȣ �Ǵ� ��й�ȣ�� Ȯ�����ּ���.");
					}
				}
			}
			
			else if (menu == 2) { // �α׾ƿ�
				if (status == "�α׾ƿ�") { // ����: �α׾ƿ�
					System.out.println("�̹� �α׾ƿ��� �����Դϴ�.");
				} 
				else { // ���� : �α���
					System.out.println("�α׾ƿ� �Ǿ����ϴ�.");
					status = "�α׾ƿ�";
				}
			}
			
			else { // ����
				System.out.println("���α׷� ����");
				break;
			}
			
		}
		
		scan.close();
		
	}
}
