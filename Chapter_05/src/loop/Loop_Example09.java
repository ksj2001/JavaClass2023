package loop;
import java.util.*;
public class Loop_Example09 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int myMoney = 50000;
		int yourMoney = 70000;
		int yourAcc = 2222;
		int depMoney; //�Ա��� �ݾ�
		int witMoney; //����� �ݾ�
		int transAcc; //��ü�� ���¹�ȣ
		int transMoney; //��ü�� �ݾ�
		int menu;
		boolean run = true;
		while(run) {
			System.out.println("1.�Ա�");
			System.out.println("2.���");
			System.out.println("3.��ü");
			System.out.println("4.��ȸ");
			System.out.println("0.����");
			System.out.print("�޴� ���� : ");
			menu = scan.nextInt();
			switch(menu) {
			case 1:
				System.out.print("�Ա��� �ݾ� �Է� : ");
				depMoney = scan.nextInt();
				myMoney += depMoney;
				System.out.println("�Ա��� �Ϸ��Ͽ����ϴ�.");
				break;
			case 2:
				System.out.print("����� �ݾ� �Է� : ");
				witMoney = scan.nextInt();
				if(witMoney>myMoney) {
					System.out.println("�ܾ��� �����մϴ�.");
				}
				else {
					myMoney -= witMoney;
					System.out.println("����� �Ϸ��Ͽ����ϴ�.");
				}
				break;
			case 3:
				System.out.print("��ü�� ���¹�ȣ �Է� : ");
				transAcc = scan.nextInt();
				if (transAcc == yourAcc) {
					System.out.print("��ü�� �ݾ� �Է� : ");
					transMoney = scan.nextInt();
					if(transMoney>myMoney) {
						System.out.println("�ܾ��� �����մϴ�.");
					}
					else {
						myMoney -= transMoney;
						yourMoney += transMoney;
						System.out.println("��ü�� �Ϸ��Ͽ����ϴ�.");
					}
				}
				else {
					System.out.println("�߸��� ���¹�ȣ�Դϴ�.");
				}
				break;
			case 4:
				System.out.println("myMoney = "+myMoney+"��");
				System.out.println("yourMoney = "+yourMoney+"��");
				break;
			case 0:
				run = false;
				System.out.println("���α׷��� �����մϴ�.");
				break;
			default:
				System.out.println("�߸��� �����Դϴ�.");
				break;
			}		
		}
		scan.close();
	}
}
