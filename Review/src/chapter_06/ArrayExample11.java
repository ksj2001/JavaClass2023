package chapter_06;
import java.util.*;
public class ArrayExample11 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] hakbuns = {1001,1002,1003,1004,1005};
		int[] scores = {87,11,45,98,23};
		int hakbun1 = 0; // �Է��� �й� 1
		int hakbun2 = 0; // �Է��� �й� 2
		int index1 = -1; // �й�1�� �ε���
		int index2 = -1; // �й�2�� �ε���
		int temp = 0; // �ӽð�
		
		// ����) �й� 2���� �Է¹޾� ���� ��ü�ϱ�
		System.out.print("�й�1 �Է� : ");
		hakbun1 = scan.nextInt();
		System.out.print("�й�2 �Է� : ");
		hakbun2 = scan.nextInt();
		
		// �Է��� �й��� ���� �ε����� ����
		for(int i=0 ; i<5 ; i++) { 
			if(hakbuns[i]==hakbun1) {
				index1 = i;  // ��ġ�ϴ� �й��� �ε����� �ε���1�� ����
			}
		}
		for(int i=0 ; i<5 ; i++) {
			if(hakbuns[i]==hakbun2) {
				index2 = i; // ��ġ�ϴ� �й��� �ε����� �ε���2�� ����
			}
		}
		
		// �� �ε��������� ���� ��ü�ϱ�
		temp = scores[index1];
		scores[index1] = scores[index2];
		scores[index2] = temp;
		
		// ��ü�� ���� ���
		for(int i=0 ; i<5 ; i++) {
			System.out.print(scores[i]+" ");
		}
		
		scan.close();
	}
}
