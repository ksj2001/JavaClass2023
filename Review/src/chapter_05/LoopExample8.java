package chapter_05;

import java.util.*;

public class LoopExample8 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int myMoney = 50000;
		int yourMoney = 70000;
		// int myAccount = 1111;
		int yourAccount = 2222;
		int menu = -1;
		int depositMoney = 0;
		int withdrawMoney = 0;
		int transferMoney = 0;
		int inputAccount = 0;
		
		while (true) {
			System.out.println("1.�Ա�");
			System.out.println("2.���");
			System.out.println("3.��ü");
			System.out.println("4.��ȸ");
			System.out.println("0.����");
			System.out.print("�޴� ���� : ");
			menu = scan.nextInt();
			
			if (menu == 1) { // �Ա�
				System.out.print("�Ա��� �ݾ� �Է� : ");
				depositMoney = scan.nextInt();
				System.out.println("�Ա��� �Ϸ��Ͽ����ϴ�.");
				myMoney += depositMoney;
			}

			else if (menu == 2) { // ���
				System.out.print("����� �ݾ� �Է� : ");
				withdrawMoney = scan.nextInt();
				if(withdrawMoney > myMoney) {
					System.out.println("�ܾ��� �����մϴ�.");
					continue;
				}
				System.out.println("����� �Ϸ��Ͽ����ϴ�.");
				myMoney -= withdrawMoney;
			}

			else if (menu == 3) { // ��ü
				System.out.print("��ü�� ���¹�ȣ �Է� : ");
				inputAccount = scan.nextInt();
				
				if(inputAccount != yourAccount) {
					System.out.println("���� ���¹�ȣ�Դϴ�.");
					continue;
				}
				
				System.out.print("��ü�� �ݾ� �Է� : ");
				transferMoney = scan.nextInt();
				
				if(transferMoney > myMoney) {
					System.out.println("�ܾ��� �����մϴ�.");
					continue;
				}
				
				System.out.println("��ü�� �Ϸ��Ͽ����ϴ�.");
				myMoney -= transferMoney;
				yourMoney += transferMoney;
			}

			else if (menu == 4) { // ��ȸ
				System.out.println("myMoney = "+myMoney+"��");
				System.out.println("yourMoney = "+yourMoney+"��");
			}
			
			else if (menu == 0) { // ����
				System.out.println("���α׷� ����");
				break;
			}

			else {
				System.out.println("��ȿ���� ���� �޴��Դϴ�.");
			}
		}
		
		scan.close();
	}
}
