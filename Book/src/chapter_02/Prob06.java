package chapter_02;

import java.util.*;

public class Prob06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double f = 0; // ȭ���µ�
		double c = 0; // �����µ�
		
		System.out.print("ȭ���µ�(��) �Է� : ");
		f = scan.nextInt();
		c = (double)5/9*(f-32);
		
		System.out.println("�����µ�(��) : "+c);
		
		scan.close();
	}

}
