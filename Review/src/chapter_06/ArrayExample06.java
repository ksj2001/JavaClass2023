package chapter_06;

public class ArrayExample06 {

	public static void main(String[] args) {
		int[] hakbuns = { 1001, 1002, 1003, 1004, 1005 };
		int[] scores = { 87, 11, 45, 98, 23 };

		// ����) 1���л��� �й��� ���� ���
		int max = 0;
		for(int i=0 ; i<5 ; i++) {
			if(scores[i]>max) 
				max = scores[i];
		}
		
		int index = -1; // �ε��� �� �ʱ�ȭ
		for(int i = 0; i < 5 ; i++) {
			if(scores[i]==max) // �ִ��� ����(1���л��� ����) ã��
				index = i; // 1���л� ������ �ε��� �� ����
		}
		
		System.out.println(hakbuns[index]+"��("+scores[index]+"��)");
	}
}
