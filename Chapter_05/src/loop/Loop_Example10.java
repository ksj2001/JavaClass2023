package loop;
import java.util.*;
public class Loop_Example10 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int dbAcc1 = 1111;
		int dbPw1 = 1234;
		int dbMoney1 = 50000;
		int dbAcc2 = 2222;
		int dbPw2 = 2345;
		int dbMoney2 = 70000;
		int menu;
		int inputAcc;
		int inputPw;
		int currentAcc = 0; // �α��� �� ���¹�ȣ ����
		int currentPw = 0; // �α��� �� ��й�ȣ ����
		int currentMoney = 0; // �α��� �� ���� �ܾ�
		int depMoney; // �Ա��� �ݾ�
		int witMoney; // ����� �ݾ�
		int transAcc; // ��ü�� ���¹�ȣ
		int transMoney; // ��ü�� �ݾ� 
		String status = "�α׾ƿ�";
		boolean run = true;
		while(run) {
			System.out.println("dbMoney1 = "+dbMoney1+"��");
			System.out.println("dbMoney2 = "+dbMoney2+"��");
			System.out.println("*���� : "+status);
			System.out.println("1.�α���");
			System.out.println("2.�α׾ƿ�");
			System.out.println("3.�Ա�");
			System.out.println("4.���");
			System.out.println("5.��ü");
			System.out.println("6.��ȸ");
			System.out.println("0.����");
			System.out.print("�޴� ���� : ");	
			menu = scan.nextInt();
			switch(menu) {
			case 1:
				if(currentAcc != 0) { // �α��� ���¿����� ��α��� �Ұ�
					System.out.println("�̹� �α��� ��...");
				}
				else {
					System.out.print("���¹�ȣ �Է� : ");
					inputAcc = scan.nextInt();
					System.out.print("��й�ȣ �Է� : ");	
					inputPw = scan.nextInt();
					if((inputAcc==dbAcc1 && inputPw==dbPw1)||(inputAcc==dbAcc2 && inputPw==dbPw2)) {
						currentAcc = inputAcc;
						currentPw = inputPw;
						if(currentAcc==dbAcc1) {
							currentMoney = dbMoney1;
						}
						else {							
							currentMoney = dbMoney2;  // ���� ������ 2���� �־ else������ ó����
						}
						System.out.println(currentAcc+"��, ȯ���մϴ�.");
						status = currentAcc+"�α���";
					}
					else {
						System.out.println("���̵� Ȥ�� ��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
					}
				}
				break;
			case 2:
				if(currentAcc == 0) { // �α��� �� �̿� ����
					System.out.println("�α��� �� �̿� �����մϴ�.");
				}
				else {
					currentAcc = 0;
					currentPw = 0;
					currentMoney = 0;
					System.out.println("�α׾ƿ� �Ǿ����ϴ�.");
					status = "�α׾ƿ�";
				}
				break;
			case 3:
				if(currentAcc == 0) { // �α��� �� �̿� ����
					System.out.println("�α��� �� �̿� �����մϴ�.");
				}
				else {
					System.out.print("�Ա��� �ݾ� �Է� : ");
					depMoney = scan.nextInt();
					System.out.println("�Ա��� �Ϸ��Ͽ����ϴ�.");
					if(currentAcc == dbAcc1) {
						currentMoney += depMoney;
						dbMoney1 = currentMoney;
					}
					else {
						currentMoney += depMoney;
						dbMoney2 = currentMoney;
					}
				}
				break;
			case 4:
				if(currentAcc == 0) { // �α��� �� �̿� ����
					System.out.println("�α��� �� �̿� �����մϴ�.");
				}
				else {
					System.out.print("����� �ݾ� �Է� : ");
					witMoney = scan.nextInt();
					if(witMoney > currentMoney) {
						System.out.println("�ܾ��� �����մϴ�.");
					}
					else {
						System.out.println("����� �Ϸ��Ͽ����ϴ�.");
						if(currentAcc == dbAcc1) {
							currentMoney -= witMoney;
							dbMoney1 = currentMoney;
						}
						else {
							currentMoney -= witMoney;
							dbMoney2 = currentMoney;
						}
					}
				}
				break;
			case 5: 
				if(currentAcc == 0) { // �α��� �� �̿� ����
					System.out.println("�α��� �� �̿� �����մϴ�.");
				}
				else {
					System.out.print("��ü�� ���¹�ȣ �Է� : ");
					transAcc = scan.nextInt();
					if(transAcc == currentAcc) {
						System.out.println("���� ���¿��� ��ü�� �� �����ϴ�.");
					}
					else if(transAcc == dbAcc1) {
						System.out.print("��ü�� �ݾ� �Է� : ");
						transMoney = scan.nextInt();
						if(transMoney > currentMoney) {
							System.out.println("�ܾ��� �����մϴ�.");
						}
						else {
							System.out.println("��ü�� �Ϸ��Ͽ����ϴ�.");
							currentMoney -= transMoney;
							dbMoney2 = currentMoney;
							dbMoney1 += transMoney;
						}
					}
					else if(transAcc == dbAcc2) {
						System.out.print("��ü�� �ݾ� �Է� : ");
						transMoney = scan.nextInt();
						if(transMoney > currentMoney) {
							System.out.println("�ܾ��� �����մϴ�.");
						}
						else {
							System.out.println("��ü�� �Ϸ��Ͽ����ϴ�.");
							currentMoney -= transMoney;
							dbMoney1 = currentMoney;
							dbMoney2 += transMoney;
						}
					}
					else {
						System.out.println("��ȿ���� ���� ���¹�ȣ�Դϴ�.");
					}
				}
				break;
			case 6:
				if(currentAcc == 0) { // �α��� �� �̿� ����
					System.out.println("�α��� �� �̿� �����մϴ�.");
				}
				else {
					// �ݺ����� �ݺ��� ������ dbMoney1�� dbMoney2�� ���� ��� �����ִµ� ��ȸ ����� �ʿ��Ѱ���?
				}
				break;
			case 0:
				System.out.println("���α׷� ����");
				run = false;
				break;
			}
		}
		scan.close();
	}
}
