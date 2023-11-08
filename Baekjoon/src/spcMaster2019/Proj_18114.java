package spcMaster2019;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Proj_18114 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int combCheck = 0; // ������ �����ϴ� ������ ������ �����ϴ� Ű�� (�⺻ : 0)
		String input1 = scan.nextLine(); // ù ��° �� �Է�
		StringTokenizer st1 = new StringTokenizer(input1);
		int num = Integer.parseInt(st1.nextToken().trim()); // ������ ����
		int standardWeight = Integer.parseInt(st1.nextToken().trim()); // �����ϴ� ����
		String input2 = scan.nextLine(); // �� ��° �� �Է�
		int[] weightArr = new int[num]; // ���ǵ��� ���Է� �̷���� �迭
		StringTokenizer st2 = new StringTokenizer(input2);
		for(int i=0;i<num;i++) {
			weightArr[i] = Integer.parseInt(st2.nextToken().trim());
		}
		for(int i=0;i<num;i++) {
			for(int j=0;j<num;j++) {
				for(int k=0;k<num;k++) {
					if(weightArr[i]==standardWeight) { // ���� �� ���� ��
						combCheck = 1;
					}
					else if(weightArr[i]!=weightArr[j]) { // �ߺ� ����ó��
						if(weightArr[i]+weightArr[j]==standardWeight) { // ���� �� ���� ��
							combCheck = 1;
						}
					}
					else if((weightArr[i]!=weightArr[j])&&(weightArr[j]!=weightArr[k])&&(weightArr[i]!=weightArr[k])) { // �ߺ� ����ó��
						if(weightArr[i]+weightArr[j]+weightArr[k]==standardWeight) { // ���� �� ���� ��
							combCheck = 1;
						}
					}
				}
			}
		}
		System.out.println(combCheck);
		scan.close();
	}
}
