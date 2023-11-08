package megamart;
import java.util.*;
public class Shopping {
	Scanner scan = new Scanner(System.in);
	//��� ����
	User user = new User();
	Basket basket = new Basket();
	String currentStatus = "�α׾ƿ�";
	boolean run = true;
	int menu = -1;
	int productNum = -1; // ��ǰ��ȣ
	
	//�Լ�
	public void menu() { // MEGA MART �޴� ��� �Լ�
		while(run) {
			System.out.println("-------------------------");
			status();
			System.out.println("-------------------------");
			System.out.println("[MEGA MART]");
			System.out.println("[1]�α���");
			System.out.println("[2]�α׾ƿ�");
			System.out.println("[3]����");
			System.out.println("[4]��ٱ���");
			System.out.println("[0]�����ϱ�");
			System.out.print("�޴�����: ");
			menu = scan.nextInt();
			switch(menu) {
			case 1:
				user.logIn();
				break;
			case 2:
				user.logOut();
				break;
			case 3:
				shopping();
				break;
			case 4:
				basket.basket();
				break;
			case 0:
				end();
				break;
			default:
				System.out.println("���� �޴��Դϴ�.");
			}
		}
	}

	public void status() { // �α��λ��� �Լ�
		if(user.log==-1) {
			currentStatus = "�α׾ƿ�";
			System.out.println("����: "+currentStatus);
		}
		else {
			for(int i=0;i<user.id.length;i++) {
				if(user.log==i) {
					currentStatus = user.id[i]+"�� �α���";
					System.out.println("����: "+currentStatus);
				}
			}
		}
	}

	public void shopping() { // ��ǰ��� �Լ�
		if(user.log==-1) {
			System.out.println("�α��� �� �̿� �����մϴ�.");
		}
		else {
			while(true) {
				System.out.println("[��ǰ���]");
				for(int i=0;i<basket.item.length;i++) {
					System.out.println("["+(i+1)+"]"+basket.item[i]
							+"\t"+basket.price[i]+"��");
				}
				System.out.println("[0]�ڷΰ���");
				System.out.print("��ǰ��ȣ ����:");
				productNum = scan.nextInt();
				if(productNum==0) {
					System.out.println();
					break;
				}
				else if(productNum>4) {
					System.out.println("��ȿ���� ���� ��ǰ��ȣ�Դϴ�.");
				}
				else {
					for(int i=1;i<basket.item.length+1;i++) {
						if(i==productNum) {
							basket.count(i-1);
						}
					}
				}
			}
		}
	}
	
	public void end() { // ���α׷� ���� �Լ�
		System.out.println("���θ� ����");
		run = false;
	}
}
