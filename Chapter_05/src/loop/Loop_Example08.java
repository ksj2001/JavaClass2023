package loop;
import java.util.*;
public class Loop_Example08 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int dbAcc1 = 1111;
		int dbPw1 = 1234;
		int dbAcc2 = 2222;
		int dbPw2 = 2345;
		int menu;
		int keyAcc = 0; // �Է¹��� ���¹�ȣ
		int keyPw = 0; // �Է¹��� ��й�ȣ
		int count = 0; // 0�̸� �ʱ� �α׾ƿ� ����
		boolean run = true;
		while(run) {
			System.out.println("1.�α���");
			System.out.println("2.�α׾ƿ�");
			System.out.println("0.����");
			System.out.print("�޴� ���� : ");
			menu = scan.nextInt();
			switch(menu) {
			case 1:
				if (keyAcc != 0 && count != 0){
					System.out.println("�̹� �α��εǾ� �ֽ��ϴ�.");
				}
				else {
					System.out.print("���¹�ȣ �Է� : ");
					keyAcc = scan.nextInt();
					System.out.print("��й�ȣ �Է� : ");
					keyPw = scan.nextInt();
					if ((keyAcc==dbAcc1)&&(keyPw==dbPw1)) {
						keyAcc = dbAcc1;
						keyPw = dbPw1;
						System.out.println(keyAcc+"��, ȯ���մϴ�.");
						count++;
					}
					else if ((keyAcc==dbAcc2)&&(keyPw==dbPw2)) {
						keyAcc = dbAcc2;
						keyPw = dbPw2;
						System.out.println(keyAcc+"��, ȯ���մϴ�.");
						count++;
					}
					else {
						System.out.println("���¹�ȣ Ȥ�� ��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
					}
				}	
				break;
			case 2:
				if(keyAcc == 0 && keyPw == 0) {
					System.out.println("�α׾ƿ� �����Դϴ�.");
				}
				else {
					keyAcc = 0;
					keyPw = 0;
					System.out.println("�α׾ƿ� �Ǿ����ϴ�.");
				}
				break;
			case 0:	
				run = false;
				System.out.println("���α׷� ����");
				break;
			}
		}
		scan.close();
	}
}
