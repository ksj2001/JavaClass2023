package chapter_03;

import java.util.*;

public class Prob02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int rank = 0;
		
		System.out.println("����� �Է��ϼ��� : ");
		rank = scan.nextInt();
		
		switch(rank) {
		case 1:
			System.out.println("���� ���߽��ϴ�.");
			break;
		case 2: case 3:
			System.out.println("���߽��ϴ�.");
			break;
		case 4: case 5: case 6:
			System.out.println("�����Դϴ�.");
			break;
		default:
			System.out.println("����ؾ߰ڽ��ϴ�.");
			break;
		}
		
		scan.close();
	}
}
