package chapter_04;
import java.util.*;
public class Ifexample7 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int myAcc = 1234;
		int myMoney = 8700;
		int yourAcc = 4321;
		int yourMoney = 12000;
		
		System.out.print("��ü�� ���¹�ȣ�� �Է��ϼ��� : ");
		int transAcc = scan.nextInt(); // ��ü�� ���¹�ȣ
		if(transAcc!=yourAcc) { // ���¹�ȣ ����ġ
			System.out.println("���¹�ȣ�� ��ġ���� �ʽ��ϴ�.");
			scan.close();
			return;
		}	
		
		System.out.print("��ü�ݾ��� �Է��ϼ��� : ");
		int transMoney = scan.nextInt(); // ��ü�� �ݾ�
		if(transMoney>myMoney) { // ��ü�ݾ� > ���� ���ݾ� : ��ü�Ұ�
			System.out.println("��ü�� �� �����ϴ�. (�ܾ׺���)");
			scan.close();
			return;
		}
		
		myMoney -= transMoney;
		yourMoney += transMoney; 
		System.out.println("��ü�� �Ϸ��Ͽ����ϴ�.");
		System.out.println("myMoney = "+myMoney+"��");
		System.out.println("yourMoney = "+yourMoney+"��");
		
		scan.close();
	}
}
