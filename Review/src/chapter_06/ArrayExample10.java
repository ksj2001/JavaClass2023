package chapter_06;
import java.util.*;
public class ArrayExample10 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arr = {10,20,30,40,50};
		int index1 = -1; // �ε���1
		int index2 = -1; // �ε���2
		int value1 = 0; // ��1
		int value2 = 0; // ��2
		
		// ����1) �ε��� 2���� �Է¹޾� �� ��ü�ϱ�
		System.out.print("�ε���1 �Է� : ");
		index1 = scan.nextInt();
		System.out.print("�ε���2 �Է� : ");
		index2 = scan.nextInt();
		
		int temp = 0; // �ӽð� ����
		temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
		
		for(int i=0 ; i<5 ; i++) {
			System.out.print(arr[i]+" ");
		}
		
		System.out.println();
		
		// ����2) �� 2���� �Է¹޾� �� ��ü�ϱ�
		System.out.print("��1 �Է� : ");
		value1 = scan.nextInt();
		System.out.print("��2 �Է� : ");
		value2 = scan.nextInt();
		
		for(int i=0 ; i<5 ; i++) { 
			if(arr[i]==value1) {
				index1 = i;  // ��ġ�ϴ� ���� �ε����� �ε���1�� ����
			}
		}
		
		for(int i=0 ; i<5 ; i++) {
			if(arr[i]==value2) {
				index2 = i; // ��ġ�ϴ� ���� �ε����� �ε���2�� ����
			}
		}
		
		temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
		
		for(int i=0 ; i<5 ; i++) {
			System.out.print(arr[i]+" ");
		}
		
		scan.close();
	}
}
