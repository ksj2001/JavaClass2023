package chapter_04;
import java.util.*;
public class Ifexample8 {
	public static void main(String[] args) {
		int cash = 20000; // �Աݽ� ����, ��ݽ� ����
		int balance = 30000; // �Աݽ� ����, ��ݽ� ����
		int account = 11111; // �α��ν� ���
		int password = 1234; // �α��ν� ���
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("===MEGA ATM===");
		System.out.println("1.�α��� 2.����");
		int menu1 = scan.nextInt(); // �޴� �Է� 1 (�α��� or ����)
		
		
		if(menu1==1) { // �α��� ����
			
			System.out.println("���¹�ȣ�� ��й�ȣ�� �Է��ϼ���");
			int inputAccount = scan.nextInt(); // ���¹�ȣ �Է�
			int inputPassword = scan.nextInt(); // ��й�ȣ �Է�
			
			if(account == inputAccount && password == inputPassword) {
				// ���¹�ȣ�� ��й�ȣ ��� ��ġ �� �Ա�,���,��ȸ �� ����
				System.out.println("1.�Ա� 2.��� 3.��ȸ");
				int menu2 = scan.nextInt(); // �޴� �Է� 2 (�Ա� or ��� or ��ȸ)
				
				if(menu2==1) { // �Ա� ����
					System.out.println("�Ա��� �ݾ��� �Է��ϼ���");
					int depositCash = scan.nextInt();
					if(depositCash > cash) {
						// �Ա� �Ұ� (�Ա��� �ݾ��� �� ���� �ܾ׺��� ����
						System.out.println("�Ա� �Ұ�(�Ա� �ݾ��� �� ���� �ܾ׺��� ����)");
					}
					
					else {
						cash -= depositCash; // �� ���� �ܾ� - �Ա��� �ݾ�
						balance += depositCash; // �����ܾ� + �Ա��� �ݾ�
						System.out.println("�Ա� �� �����ܾ�: "+balance+"��");
						System.out.println("�Ա� �� �� ���� �ܾ�: "+cash+"��");
					}
				}
				
				else if(menu2==2) { // ��� ����
					System.out.println("����� �ݾ��� �Է��ϼ���");
					int withdrawCash = scan.nextInt();
					if(withdrawCash > balance) {
						// �Ա� �Ұ� (����� �ݾ��� �����ܾ׺��� ����
						System.out.println("��� �Ұ�(��� �ݾ��� �����ܾ׺��� ����)");
					}
					else {
						balance -= withdrawCash; // �����ܾ� - ����� �ݾ�
						cash += withdrawCash; // �� ���� �ݾ� + ����� �ݾ�
						System.out.println("��� �� �����ܾ�: "+balance+"��");
						System.out.println("��� �� �� ���� �ܾ�: "+cash+"��");
					}
				}
				
				else if(menu2==3) { // ��ȸ ����
					System.out.println("�����ܾ�: "+balance+"��");
					System.out.println("�� ���� �ܾ�: "+cash+"��");
				}
				
				else { // ��ȿ���� ���� �޴�(2) �Է�
					System.out.println("��ȿ���� ���� �޴��Դϴ�.");
				}
			}
			
			else { // ���¹�ȣ or ��й�ȣ ����ġ
				System.out.println("���̵�� �н����带 Ȯ�����ּ���.");
			}
		}
		
		else if(menu1==2) {
			System.out.println("����");
		}
		
		else { // ��ȿ���� ���� �޴�(1) �Է�
			System.out.println("��ȿ���� ���� �޴��Դϴ�.");
		}
		scan.close();
	}
}
