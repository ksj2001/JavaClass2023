package chapter_02;

import java.util.*;

public class Prob09 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int major = 0; // ���� �̼� ����
		int ge = 0; // ���� �̼� ����
		int normal = 0; // �Ϲ� �̼� ����

		System.out.print("���� �̼� ���� : ");
		major = scan.nextInt();
		System.out.print("���� �̼� ���� : ");
		ge = scan.nextInt();
		System.out.print("�Ϲ� �̼� ���� : ");
		normal = scan.nextInt();

		if (major + ge + normal >= 140 && major >= 70 && ((ge >= 30 && normal >= 30) || (ge + normal >= 80)))
			System.out.println("���� ����");
		else
			System.out.println("���� �Ұ�");
		
		scan.close();
	}

}
