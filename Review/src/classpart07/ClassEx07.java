package classpart07;

import java.util.*;

public class ClassEx07 {
	Scanner scan = new Scanner(System.in);
	String[] arAcc = { "1111", "2222", "3333", "4444", "5555" };
	String[] arPw = { "1234", "2345", "3456", "4567", "5678" };
	int[] arMoney = { 87000, 34000, 17500, 98000, 12500 };

	int count = 5;

	// 3333 �α��� ��
	int loginCheck = 2;

	int menu;

	boolean run = true;

	String inputAcc = ""; // �Է��� ���¹�ȣ
	String inputPw = ""; // �Է��� ��й�ȣ
	int inputMoney = 0; // �Է��� �ݾ�
	int index = 0;

	// �޼���

	public void selectMenu() { // �޴� ���� �޼���
		while (run) {
			System.out.println("-------------------------");
			System.out.println("���¹�ȣ\t��й�ȣ\t�����ܾ�");
			System.out.println("-------------------------");
			for (int i = 0; i < arAcc.length; i++) {
				System.out.println(arAcc[i] + "\t" + arPw[i] + "\t" + arMoney[i]);
			}
			System.out.println("-------------------------");
			if (loginCheck != -1)
				System.out.println("���� : " + arAcc[loginCheck] + " �α���");
			else
				System.out.println("���� : �α׾ƿ�");
			System.out.println("-------------------------");

			System.out.println("[Mega Bank]");
			System.out.println("[1]ȸ������");
			System.out.println("[2]ȸ��Ż��");
			System.out.println("[3]�α���");
			System.out.println("[4]�α׾ƿ�");
			System.out.println("[5]�Ա��ϱ�");
			System.out.println("[6]��ü�ϱ�");
			System.out.println("[7]�ܾ���ȸ");
			System.out.println("[0]�����ϱ�");
			menu = -1;
			System.out.print("�޴� ���� : ");
			menu = scan.nextInt();
			if (menu == 1)
				signUp();
			else if (menu == 2)
				delete();
			else if (menu == 3)
				logIn();
			else if (menu == 4)
				logOut();
			else if (menu == 5)
				deposit();
			else if (menu == 6)
				transfer();
			else if (menu == 7)
				checkBalance();
			else if (menu == 0)
				endProgram();
			else
				System.out.println("��ȿ���� ���� �޴��Դϴ�.");
		}
	}

	public void signUp() { // ȸ������ �޼���
		System.out.print("[����]���¹�ȣ�� �Է��ϼ��� : ");
		inputAcc = scan.next();
		for (int i = 0; i < count; i++) {
			if (inputAcc.equals(arAcc[i])) {
				System.out.println("[�޼���]�ߺ��Ǵ� ���¹�ȣ �Դϴ�.");
				index = -1;
			}
		}
		if (index != -1) {
			System.out.print("[����]��й�ȣ �Է� : ");
			arAcc[count] = scan.next();
			count++;
			System.out.println("������ �Ϸ�Ǿ����ϴ�.");
		}
		
		// �̿�
	}

	public void delete() { // ȸ��Ż�� �޼���
		if (loginCheck != -1) {
			System.out.println("�̹� �α��� �� �����Դϴ�.");	
		} else {
			System.out.println("Ż��Ǿ����ϴ�.");
			for(int i = loginCheck; i<count-1 ; i++) {
				arAcc[i] = arAcc[i+1];
				arPw[i] = arPw[i+1];
				arMoney[i] = arMoney[i+1];
			}
			arAcc[count] = "";
			arPw[count] = "";
			arMoney[count] = 0;
			count--;
			loginCheck = -1;
		}
	}

	public void logIn() { // �α��� �޼���
		if (loginCheck != -1) {
			System.out.println("�̹� �α��� �� �����Դϴ�.");	
		} else {
			System.out.print("ID�Է� : ");
			inputAcc = scan.next();
			System.out.print("PW�Է� : ");
			inputPw = scan.next();
			for (int i = 0; i < arAcc.length; i++) {
				if (arAcc[i].equals(inputAcc) && arPw[i].equals(inputPw)) {
					System.out.println(arAcc[i] + "��, ȯ���մϴ�.");
					loginCheck = i;
				}
			}
			if (loginCheck == -1) {
				System.out.println("ID�� PW�� Ȯ�����ּ���.");
			}
		}
	}

	public void logOut() { // �α׾ƿ� �޼���
		if (loginCheck == -1) {
			System.out.println("�α��� �� �̿� �����մϴ�.");
		} else {
			System.out.println("�α׾ƿ� �Ǿ����ϴ�.");
			loginCheck = -1;
		}
	}

	public void deposit() { // �Ա� �޼���
		if (loginCheck == -1) {
			System.out.println("�α��� �� �̿� �����մϴ�.");
		} else {
			System.out.println("�Ա��� �ݾ� �Է� : ");
			inputMoney = scan.nextInt();
			arMoney[loginCheck] += inputMoney;
		}
	}

	public void transfer() { // ��ü �޼���
		if(loginCheck==-1) {
			System.out.println("�α��� �� �̿� �����մϴ�.");
		}
		else {
			System.out.print("��ü�� ���¹�ȣ�� �Է��ϼ��� : ");
			inputAcc = scan.next();
			index = -1;
			for(int i=0;i<count;i++) {
				if(inputAcc.equals(arAcc[i])) {
					index = i;
				}
			}
			if(index == -1) {
				System.out.println("��ȿ���� ���� ���¹�ȣ�Դϴ�.");
			}
			else {
				System.out.print("��ü�� �ݾ��� �Է��ϼ��� : ");
				inputMoney = scan.nextInt();
				if(inputMoney>arMoney[loginCheck]) {
					System.out.println("�ܾ��� �����մϴ�.");
				}
				else {
					arMoney[loginCheck] -= inputMoney;
					arMoney[index] += inputMoney;
				}	
			}		
		}
	}

	public void checkBalance() { // �ܾ���ȸ �޼���
		if (loginCheck == -1) {
			System.out.println("�α��� �� �̿� �����մϴ�.");
		} else {
			System.out.println("���¹�ȣ: " + arAcc[loginCheck]);
			System.out.println("���� �ܾ�: " + arMoney[loginCheck]);
		}
	}

	public void endProgram() { // ���α׷� ���� �޼���
		System.out.println("���α׷� ����");
		run = false;
	}

}
