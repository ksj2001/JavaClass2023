package if_test;
import java.util.*;
public class Example3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int myAcc = 1234;
		int myMoney = 8700;
		int yourAcc = 4321;
		int yourMoney = 12000;
		System.out.print("��ü�� ���¹�ȣ�� �Է��ϼ��� : ");
		int inputAcc = scan.nextInt();
		if (yourAcc!=inputAcc) {
			System.out.println("���¹�ȣ�� ��ġ���� �ʽ��ϴ�.");
		}
		else {
			System.out.print("��ü�ݾ��� �Է��ϼ��� : ");
			int inputMoney = scan.nextInt();
			if (inputMoney > myMoney) {
				System.out.println("�ܾ��� �����մϴ�.");
			}
			else {
				System.out.println("��ü�� �Ϸ��Ͽ����ϴ�.");
				myMoney -= inputMoney;
				yourMoney += inputMoney;
				System.out.println("myMoney = "+myMoney+"��");
				System.out.println("yourMoney = "+yourMoney+"��");
			}
		}
		scan.close();
	}
}
