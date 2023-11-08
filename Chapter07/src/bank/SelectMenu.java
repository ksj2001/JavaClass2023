package bank;
import java.util.*;
public class SelectMenu {
	//��� ����
	Scanner scan = new Scanner(System.in);
	User user = new User();
	DepoTrans depotrans = new DepoTrans();
	String currentStatus = "�α׾ƿ�";
	boolean run = true;
	int menu = -1;
	
	//�Լ�
	public void menu() {
		while(run) {
			for(int i=0;i<user.arAcc.length;i++) {
				if(user.arAcc[i]!="") {
					System.out.println(user.arAcc[i]+" : "+user.arPw[i]+" : "+user.arMoney[i]+"��");
				}
			}
			status();
			System.out.println("# �α��� ���� : "+currentStatus);
			System.out.println("=== �츮���� ===");
			System.out.println("1.ȸ������");
			System.out.println("2.ȸ��Ż��");
			System.out.println("3.�α���");
			System.out.println("4.�α׾ƿ�");
			System.out.println("5.�Ա��ϱ�");
			System.out.println("6.��ü�ϱ�");
			System.out.println("7.����");
			System.out.print("�޴��� �������ּ��� : ");
			menu = scan.nextInt();
			switch(menu) {
			case 1:
				user.signUp();
				break;
			case 2:
				user.delete();
				break;
			case 3:
				user.logIn();
				break;
			case 4:
				user.logOut();
				break;
			case 5:
				depotrans.deposit();
				break;
			case 6:
				depotrans.transfer();
				break;
			case 7:
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
		}
		else {
			for(int i=0;i<user.arAcc.length;i++) {
				if(user.log==i) {
					currentStatus = user.arAcc[i]+"��, �α��� ��...";
				}
			}
		}
	}
	
	public void end() { // ���α׷� ���� �Լ�
		System.out.println("���θ� ����");
		run = false;
	}
}
