package chapter_02;

import java.util.*;

public class Prob03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int rad = 0; // ������� �ظ� ������
		int h = 0; // ������� ����
		double vol = 0.0; // ������� ���� 
		
		System.out.print("������� �ظ� ��������? ");
		rad = scan.nextInt();
		System.out.print("������� ���̴�? ");
		h = scan.nextInt();
		
		vol = Math.pow(rad, 2) * h * 3.14;
		
		System.out.println("������� ���Ǵ� "+vol);
		
		scan.close();
	}

}
