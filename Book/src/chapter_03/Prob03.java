package chapter_03;

import java.util.*;

public class Prob03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = 0; // �Է��� ���� ����
		int evenSum = 0; // �Է��� ���� ���� �߿��� ¦���� ��
		
		do {
			System.out.println("���� ������ �Է��ϼ��� : ");
			num = scan.nextInt();
			
			if(num % 2 == 0)
				evenSum += num;
		} while(num > 0);
		
		System.out.println("�Է��� ���� ���� �߿��� ¦���� ���� "+evenSum);
		
		scan.close();
	}

}
