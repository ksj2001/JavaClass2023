package if_test;
import java.util.*;

public class Example1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("=== �Ե����� ===");
		int bulgogi = 8700;
		System.out.println("1.�Ұ�� ���� : "+bulgogi+"��");
		int shrimp = 6200;
		System.out.println("2.���� ���� : "+shrimp+"��");
		int coke = 1500;
		System.out.println("3.�ݶ� : "+coke+"��");
		System.out.print("�޴��� �����ϼ��� : ");
		int menu = scan.nextInt();
		switch(menu) {
		case 1:
			menu = bulgogi;
			break;
		case 2:
			menu = shrimp;
			break;
		case 3:
			menu = coke;
			break;
		}
		System.out.print("������ �Է��ϼ��� : ");
		int cash = scan.nextInt();
		int change = 0;
		if (cash<menu) {
			System.out.println("������ �����մϴ�.");
		}
		else {
			change = cash - menu;
		}
		System.out.println("�ܵ� : "+change);
		scan.close();
	}
}
