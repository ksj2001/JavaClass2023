package chapter_02;

import java.util.*;

public class Prob08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = 0; 
		int digitSum = 0; // �� �ڸ����� ��
		
		System.out.print("0~999 ������ ���ڸ� �Է��ϼ��� : ");
		num = scan.nextInt();
		
		if(num<0 || num>999)
			System.out.println("���� �ʰ�");
		else {
			digitSum = (num / 100) + (num % 100 / 10) + (num % 100 % 10); 
			System.out.println("�� �ڸ����� �� = "+digitSum);
		}
		
		scan.close();
	}

}
