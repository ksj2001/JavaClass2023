package chapter_02;

import java.util.*;

public class Prob02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = 0;
		
		System.out.print("������ �Է��ϼ��� : ");
		num = scan.nextInt();
		System.out.println(num+"�� ������ "+(int)Math.pow(num, 2));
		
		scan.close();
	}

}
