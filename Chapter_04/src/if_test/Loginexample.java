package if_test;
import java.util.*;
public class Loginexample {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("ID: ");
		int input_id = scan.nextInt();
		System.out.print("PW: ");
		int input_pw = scan.nextInt();
		int db_id = 1234;
		int db_pw = 1111;
		if ((input_id == db_id)&&(input_pw == db_pw)) {
			System.out.println("�α��� ����!");
		}
		else {
			System.out.println("���̵� Ȥ�� ��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
		}
		scan.close();
	}
}
