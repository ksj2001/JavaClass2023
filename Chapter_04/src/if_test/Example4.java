package if_test;
import java.util.*;
public class Example4 {
	public static void main(String[] args) {
		int cash = 20000; // �Աݽ� ���� , ��ݽ� ����
		int balance = 30000; // �Աݽ� ���� , ��ݽ� ����
		int account = 11111; // �α��ν� ���
		int password = 1234; // �α��ν� ���
		Scanner scan = new Scanner(System.in);
		System.out.println("===MEGA ATM===");
		System.out.println("1.�α��� 2.����");
		int input1 = scan.nextInt();
		switch(input1) {
			//�α���
			case 1:
				System.out.println("���¿� ��й�ȣ�� �Է��ϼ���");
				int input_Acc = scan.nextInt();
				int input_Pw = scan.nextInt();
				if ((input_Acc==account)&&(input_Pw==password)) {
					System.out.println("1.�Ա� 2.��� 3.��ȸ");
					int input2 = scan.nextInt();
					switch(input2) {
					//�Ա�
					case 1:
						System.out.println("�Ա��� �ݾ��� �Է��ϼ���");
						int dep_cash = scan.nextInt();
						if (dep_cash>cash) {
							System.out.println("���� �ܾ��� �����մϴ�.");
						}
						else {
							cash -= dep_cash;
							balance += dep_cash;
							System.out.println("�Ա� �� �����ܾ� : "+balance+"��");
							System.out.println("�Ա� �� �� ���� �ܾ� : "+cash+"��");
						}
						break;
					//���
					case 2:
						System.out.println("����� �ݾ��� �Է��ϼ���");
						int wit_cash = scan.nextInt();
						if (wit_cash>balance) {
							System.out.println("���� �ܾ��� �����մϴ�.");
						}
						else {
							cash += wit_cash;
							balance -= wit_cash;
							System.out.println("��� �� �����ܾ� : "+balance+"��");
							System.out.println("��� �� �� ���� �ܾ� : "+cash+"��");
						}
						break;
					//��ȸ
					case 3:
						System.out.println("���� �����ܾ� : "+balance+"��");
						System.out.println("���� �� ���� �ܾ� : "+cash+"��");
						}
						break;
				}
				else {
					System.out.println("���̵�� �н����带 Ȯ�����ּ���.");
				}
				break;
			//����
			case 2:
				System.out.println("����");
				break;
		}
		scan.close();
	}
}
