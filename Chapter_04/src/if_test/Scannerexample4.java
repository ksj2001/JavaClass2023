package if_test;
import java.util.*;
public class Scannerexample4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("=== ȸ������ ===");
		System.out.print("������ Id�� �Է��ϼ��� : ");
		int db_Id = scan.nextInt();
		System.out.print("������ Pw�� �Է��ϼ��� : ");
		int db_Pw = scan.nextInt();
		System.out.println("������ �����մϴ�.");
		System.out.println("=== �α��� ===");
		System.out.print("Id �Է� : ");
		int input_Id = scan.nextInt();
		System.out.print("Pw �Է� : ");
		int input_Pw = scan.nextInt();
		if ((db_Id == input_Id)&&(db_Pw == input_Pw)) {
			System.out.println("�α��� ����");
		}
		else {
			System.out.println("�α��� ����");
		}
		scan.close();
	}
}
