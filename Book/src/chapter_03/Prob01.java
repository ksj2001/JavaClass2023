package chapter_03;

import java.util.*;

public class Prob01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int age = 0;
		
		System.out.println("���̸� �Է��ϼ��� : ");
		age = scan.nextInt();
		
		if(age>=19)
			System.out.println("����");
		else
			System.out.println("�̼���");
		
		scan.close();
	}

}
