package chapter_04;
import java.util.*;
public class Ifexample5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int bul = 8700; // �Ұ����� ����
		int sae = 6200; // ������� ����
		int col = 1500; // �ݶ� ����
		
		
		System.out.println("=== �Ե����� ===");
		System.out.println("1.�Ұ�� ���� : 8700��");
		System.out.println("2.���� ���� : 6200��");
		System.out.println("3.�ݶ� : 1500��");
		
		System.out.print("�޴��� �����ϼ��� : ");
		int menu = scan.nextInt(); // �޴� ��ȣ �Է�
		if(menu!=1 && menu!=2 && menu!=3) { // 1,2,3�� �ƴ� �޴���ȣ�� �Է����� ���
			System.out.println("��ȿ���� ���� �޴��Դϴ�.");
			scan.close();
			return; // ���α׷� ����
		}
		else if(menu==1) {
			menu = bul; // �޴��� = �Ұ����� ����
		}
		else if(menu==2) {
			menu = sae; // �޴��� = ������� ����
		}
		else {
			menu = col; // �޴��� = �ݶ� ����
		}
		
		System.out.print("������ �����ϼ��� : ");
		int cash = scan.nextInt(); // ������ ����
		if(cash<menu) { // ������ ���ݺ��� ��Ű���� �޴����� ��θ�
			System.out.println("������ �����մϴ�.");
			scan.close();
			return; // ���α׷� ����
		}
		else {
			int change = cash-menu; // �ܵ�
			System.out.println("�ܵ� : "+change+"��");
		}
		
		scan.close();
	}
}
