package chapter_06;
import java.util.*;
public class ArrayExample07 {
	public static void main(String[] args) {
		Random ran = new Random();
		int[] answer = {1,3,4,2,5}; // ������
		int[] hgdwer = new int[5]; // 1~5 ������ ���� ���� 5��
		for(int i=0 ; i<5 ; i++) {
			hgdwer[i] = ran.nextInt(5)+1; // ���� ���� ����
		}
		String[] errata = new String[5]; // ����ǥ
		int score = 0; // ����
		
		for(int i=0; i<5 ; i++) {
			if(answer[i] == hgdwer[i]) { // �������� ��ġ
				errata[i] = "O"; // ����ǥ : O
				score += 20; // ���� �ϳ��� ���� 20�� �߰�
			}
			else { // �������� ����ġ
				errata[i] = "X";
			}
		}
		
		System.out.println("answer = {"+answer[0]+", "+answer[1]+", "+answer[2]+", "+answer[3]
				+", "+answer[4]+"}");
		System.out.println("hgdwer = {"+hgdwer[0]+", "+hgdwer[1]+", "+hgdwer[2]+", "+hgdwer[3]
				+", "+hgdwer[4]+"}");
		System.out.println("����ǥ = {"+errata[0]+", "+errata[1]+", "+errata[2]+", "+errata[3]
				+", "+errata[4]+"}");
		System.out.println("���� = "+score+"��");
	}
}
