package chapter_06;
import java.util.*;
public class Multi_ArrayExample07 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int[][] arr = new int[3][3];
		arr[0][0] = 10;
		arr[0][1] = 20;
		arr[0][2] = 30;
		arr[1][0] = 40;
		arr[1][1] = 50;
		arr[1][2] = 60;
		arr[2][0] = 70;
		arr[2][1] = 80;
		arr[2][2] = 90;
		int index1 = 0; // ��ü�� �� 1
		int index2 = 0; // ��ü�� �� 2
		int line1 = -1; // 1������ ��
		int row1 = -1; // 1������ ��
		int line2 = -1; // 2������ ��
		int row2 = -1; // 2������ ��
		int temp = 0; // �ӽð�
		
		// �迭 ���
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[0].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		// ��ü�� �� 1�� �ε��� ã��
		System.out.println("��ü�� �� 1 : ");
		index1 = scan.nextInt();
		/*
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				if(index1 == arr[i][j])
				line1 = i;
				row1 = j;
			}
		}
		*/
		
		// ��ü�� �� 2�� �ε��� ã��
		System.out.println("��ü�� �� 2 : ");
		index2 = scan.nextInt();
		/*
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				if(index2 == arr[i][j])
				line2 = i;
				row2 = j;
			}
			System.out.println();
		}
		*/
		
		// �׽�Ʈ
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				if(index1==arr[i][j]) {
					line1 = i;
					row1 = j;
				}
				else if(index2==arr[i][j]) {
					line2 = i;
					row2 = j;
				}
			}
		}
		
		System.out.println(line1);
		System.out.println(row1);
		System.out.println(line2);
		System.out.println(row2);
		
		// �� �ٲٱ�
		temp = arr[line1][row1];
		arr[line1][row1] = arr[line2][row2];
		arr[line2][row2] = temp;
		
		// ���� �ٲ� �迭 ���
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[0].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println(line1);
		System.out.println(row1);
		System.out.println(line2);
		System.out.println(row2);
		
		scan.close();
		
		//
		// �𸣰ڴ�~~!!!!
		//
	}

}
