package chapter_06;

import java.util.Scanner;

public class ArrayExample05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] hakbuns = {1001,1002,1003,1004,1005};
		int[] scores = {87,11,45,98,23};
		
		// ����) �й��� �Է¹޾� ���� ���
		//      ��, ���� �й� �Է� �� ����ó��
		
		System.out.print("�й� �Է� : ");
		int hakbun = scan.nextInt();
		int index = -1; // �ε��� �� �ʱ�ȭ
		
		for(int i = 0; i < 5 ; i++) {
			if(hakbuns[i]==hakbun)
				index = i; // �ε��� �� ����
		}
		
		if(index==-1) { // �ε��� ���� �������� �ʾҴٸ� (���� �й� �Է�)
			System.out.println("�ش��й��� �������� �ʽ��ϴ�.");
		}
		
		else {
			System.out.println("���� : "+scores[index]+"��"); // �ε��� ������ ���� ���
		}
		
		scan.close();
	}

}
