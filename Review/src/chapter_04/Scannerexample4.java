package chapter_04;
import java.util.*;
public class Scannerexample4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int id = 0;
		int pw = 0;
		int inputId = 0;
		int inputPw = 0;
		
		System.out.println("=== ȸ������ ===");
		System.out.print("������ Id�� �Է��ϼ��� : ");
		id = scan.nextInt();
		System.out.print("������ Pw�� �Է��ϼ��� : ");
		pw = scan.nextInt();
		System.out.println("������ �����մϴ�.");
		
		System.out.println("=== �α��� ===");
		System.out.print("ID �Է� : ");
		inputId = scan.nextInt();
		System.out.print("PW �Է� : ");
		inputPw = scan.nextInt();
		
		if(id==inputId && pw==inputPw) {
			System.out.println("�α��� ����");
		}
		else {
			System.out.println("�α��� ����");
		}
		scan.close();
	}
}
