package loop;
import java.util.*;
public class Loop_Example07 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int bul = 8700; // �Ұ������� ����
		int sae = 6200; // ��������� ����
		int col = 1500; // �ݶ��� ����
		int num_bul = 0; // �Ұ������� ����
		int num_sae = 0; // ��������� ����
		int num_col = 0; // �ݶ��� ����
		int menu = 0; // �Է¹��� �޴�
		int total = 0; // �� �ݾ�
		int count = 0;
		int cash; // �Է¹��� ����
		System.out.println("=== �Ե����� ===");
		System.out.println("1. �Ұ�� ���� : "+bul+"��");
		System.out.println("2. ���� ���� : "+sae+"��");
		System.out.println("3. �ݶ� : "+col+"��");
		while(count<5) {
			System.out.print("�޴� ���� :");
			menu = scan.nextInt();
			switch(menu) {
			case 1:
				num_bul++;
				total += 8700;
				count++;
				break;
			case 2:
				num_sae++;
				total += 6200;
				count++;
				break;
			case 3:
				num_col++;
				total += 1500;
				count++;
				break;
			}	
		}
		System.out.println("�� �ݾ� = "+total+"��");
		System.out.print("���� �Է� : ");
		cash = scan.nextInt();
		System.out.println();
		System.out.println("=== �Ե����� ������ ===");
		System.out.println("1. �Ұ�� ���� : "+num_bul+"��");
		System.out.println("2. ���� ���� : "+num_sae+"��");
		System.out.println("3. �ݶ� : "+num_col+"��");
		System.out.println("4. �� �ݾ� : "+total+"��");
		System.out.println("5. �ܵ� : "+(cash-total)+"��");
		scan.close();	
	}
}
