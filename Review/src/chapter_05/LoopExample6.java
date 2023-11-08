package chapter_05;

import java.util.Scanner;

public class LoopExample6 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int bul = 8700; // �Ұ����� ����
		int sae = 6200; // ������� ����
		int col = 1500; // �ݶ� ����
		int menu = 0; // �޴� ��ȣ
		int countBul = 0; // �Ұ����� �ֹ� ����
		int countSae = 0; // ������� �ֹ� ����
		int countCol = 0; // �ݶ� �ֹ� ����
		int total = 0; // �� �ݾ�
		int cash = 0; // ����

		System.out.println("=== �Ե����� ===");
		System.out.println("1.�Ұ�� ���� : 8700��");
		System.out.println("2.���� ���� : 6200��");
		System.out.println("3.�ݶ� : 1500��");
		
		for(int i=0;i<5;i++) { // 5�� �ݺ� (�ֹ��ޱ�)
			System.out.print("�޴� ���� : ");
			menu = scan.nextInt(); // �޴� ��ȣ �Է�
			if (menu != 1 && menu != 2 && menu != 3) { // 1,2,3�� �ƴ� �޴���ȣ�� �Է����� ���
				System.out.println("��ȿ���� ���� �޴��Դϴ�.");
				scan.close();
				return; // ���α׷� ����
			} else if (menu == 1) {
				countBul++; // �Ұ����� �ֹ� ���� �߰�
				total += bul; // �� �ݾ׿� �Ұ����� ���� �߰�
			} else if (menu == 2) {
				countSae++; // ������� �ֹ� ���� �߰�
				total += sae; // �� �ݾ׿� ������� ���� �߰�
			} else {
				countCol++; // �ݶ� �ֹ� ���� �߰�
				total += col; // �� �ݾ׿� �ݶ� ���� �߰�
			}
		}
		
		System.out.println("�� �ݾ� = "+total+"��");
		System.out.print("���� �Է� : ");
		cash = scan.nextInt();
		if(cash<total) { // ������ �� �ݾ׺��� ���� ���
			System.out.println("���� �Ұ�(���� ����)");
			scan.close();
			return; // ���α׷� ����
		}
		cash -= total; // ���� - �ѱݾ� (= �ܵ�)
		
		System.out.println("=== �Ե����� ������ ===");
		System.out.println("1.�Ұ�� ���� : "+countBul+"��");
		System.out.println("2.���� ���� : "+countSae+"��");
		System.out.println("3.�ݶ� : "+countCol+"��");
		System.out.println("4.�ѱݾ� : "+total+"��");
		System.out.println("4.�ܵ� : "+cash+"��");
		
		scan.close();
	}
}
