package chapter_06;

import java.util.*;

public class ArrayExample02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String name[] = {"ȫ�浿","������","���޷�","�����","�ֵ���"};
		int score[] = new int[5];
		int total = 0; // ����
		
		for(int i=0 ; i<5 ; i++) {
			System.out.print(name[i]+"�� ������ �Է��ϼ��� ");
			score[i] = scan.nextInt(); 
			total += score[i];
		}
		
		for(int i=0 ; i<5 ; i++) {
			System.out.println(name[i]+"�� ���� : "+score[i]); 
		}
		System.out.println("------------------------------");
		System.out.println("���� : "+total/5);
		
		scan.close();
	}
}
