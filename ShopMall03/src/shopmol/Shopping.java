package shopmol;

import java.util.*;

public class Shopping extends User {
	Scanner scan = new Scanner(System.in);
	ItemManager im = new ItemManager();
	boolean run = true;
	int menu = -1;

	public void menu() {
		while (run) {
			System.out.println("[1]�α���");
			System.out.println("[2]�α׾ƿ�");
			System.out.println("[3]����");
			System.out.println("[0]����");
			System.out.print("�޴�����: ");
			menu = scan.nextInt();
			switch (menu) {
			case 1:
				login();
				run = true;
				break;
			case 2:
				logout();
				break;
			case 3:
				shopMenu();
				run = true;
				break;
			case 0:
				run = false;
				System.out.println("���θ� ����");
				break;
			}
		}
		scan.close();
	}

	public void shopMenu() {
		if (log == -1) {
			System.out.println("�α��� �� �̿����ֽʽÿ�.");
		} 
		else {
			run = true;
			while (run) {
				System.out.println("[1]���θ��");
				System.out.println("[2]��ٱ���");
				System.out.println("[0]�ڷΰ���");
				System.out.println();
				System.out.println("�޴� ����");
				menu = scan.nextInt();
				switch (menu) {
				case 1:
					im.printCategory();
					System.out.println("���θ�� ���� [�ڷΰ���: -1] :");
					menu = scan.nextInt();
					for (int i = 0; i < im.category.size(); i++) {
						if (menu == i) {
							im.printItemList(menu);
							System.out.println("�׸��� ���� : ");
							menu = scan.nextInt();
							im.addBasket(menu);
							menu = -1;
						}
					}
					break;
				case 2:
					im.printBasket();
					break;
				case 0:
					run = false;
					break;
				}
			}
		}
	}

	public void login() {
		if (log != -1) {
			System.out.println("�̹� �α��ε� �����Դϴ�.");
		}
		else {
			System.out.print("ID�Է�: ");
			String inputId = scan.next();
			System.out.print("PW�Է�: ");
			String inputPw = scan.next();
			for (int i = 0; i < id.length; i++) {
				if (id[i].equals(inputId) && pw[i].equals(inputPw))
					log = i;
			}
			if (log == -1)
				System.out.println("���̵�� ��й�ȣ�� �ٽ� Ȯ�����ּ���.");
			else if (log == 0) {
				System.out.println("�������Դϴ�.");
				adminMenu();
			}
			else {
				im.fillBasket(log);
				System.out.println("[" + id[log] + "]��, ȯ���մϴ�.");
			}	
		}

	}
	
	public void adminMenu() {
		while (run) {
			System.out.println("[1]�α׾ƿ�");
			System.out.println("[2]�����۰���");
			System.out.println("[3]��ٱ��� ���");
			System.out.println();
			System.out.println("�޴� ����");
			menu = scan.nextInt();
			switch (menu) {
			case 1:
				log = -1;
				System.out.println("�ȳ����輼��.");
				run = false;
				break;
			case 2:
				adminItem(); // ������ �߰�, ����, ����
				run = true;
				break;
			case 3:
				im.printUserBasket();
				break;
			}
		}
	}
	
	public void adminItem() { // �����۰��� (������ �߰�, ����, ����)
		run = true;
		while (run) {
			System.out.println("[1]������ �߰�");
			System.out.println("[2]������ ����");
			System.out.println("[3]������ ����");
			System.out.println("[0]�ڷΰ���");
			System.out.println();
			System.out.println("�޴� ����");
			menu = scan.nextInt();
			switch (menu) {
			case 1:
				System.out.print("�߰��� item�� �̸� �Է� : ");
				String name = scan.next();
				System.out.print("�߰��� item�� ���� �Է� : ");
				int price = scan.nextInt();
				System.out.println();
				im.printCategory();
				System.out.println();
				System.out.print("�߰��� item�� ī�װ� �Է� : ");
				int categoryNum = scan.nextInt();
				im.addItem(name, price, categoryNum);
				break;
			case 2:
				for(int i=0;i<im.itemList.size();i++) {
					System.out.print("["+i+"]");
					im.itemList.get(i).printInfo();
				}
				System.out.print("������ item�� ��ȣ �Է� : ");
				int num = scan.nextInt();
				im.removeItem(num);
				break;
			case 3:
				for(int i=0;i<im.itemList.size();i++) {
					System.out.print("["+i+"]");
					im.itemList.get(i).printInfo();
				}
				System.out.print("������ item�� ��ȣ �Է� : ");
				num = scan.nextInt();
				System.out.print("������ item�� �̸� �Է� : ");
				String updateName = scan.next();
				System.out.print("������ item�� ���� �Է� : ");
				int updatePrice = scan.nextInt();
				im.updateItem(num,updateName,updatePrice);
				break;
			case 0:
				run = false;
				break;
			}
		}
	}
	
	public void logout() {
		if (log == -1) {
			System.out.println("�α��� �� �̿����ֽʽÿ�.");
		}
		else {
			im.saveUserBasket(log);
			im.clearBasket();
			log = -1;
			System.out.println("�ȳ����輼��.");
		}
	}

}
