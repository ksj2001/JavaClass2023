package chapter_02;

import java.util.*;

public class Prob04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int time = 0;
		int h = 0; // �ð�
		int m = 0; // ��
		int s = 0; // ��
		
		System.out.print("�� ���� ������ �Է��ϼ��� : ");
		time = scan.nextInt();
		
		h = time / (int)Math.pow(60, 2);
		m = time % (int)Math.pow(60, 2) / 60;
		s = time % (int)Math.pow(60, 2) % 60;
		
		System.out.printf("%d�ð� %d�� %d��",h,m,s);
		
		scan.close();
	}

}
