package chapter_05;

public class LoopExample2 {

	public static void main(String[] args) {
		// ����1) 1~5������ �� ���
		int total = 0;
		int a = 1;
		while (a <= 5) {
			total += a;
			a++; // 1�� �߰���Ű�� ����
		}
		System.out.println(total);

		// ����2) 1~10���� �ݺ��� 3�̸� 7�̻� ���
		int sum = 0; // ����2�� �´� ������ ��
		int count = 0; // ����2�� �´� ������ ����
		int b = 1;
		while (b <= 10) {
			if(b<3 || b>=7) { // 3�̸� 7�̻�
				System.out.print(b+" "); // 3�̸� 7�̻� ���
				sum += b; // ����2�� �´� ������ �� ���ϱ�
				count += 1; // ����2�� �´� ������ ���� ���ϱ�
				// b++; �� ���⿡ ���� b���� 1,2,3,3,3... ó�� �ݺ��Ǽ� ���ѷ����� �ɸ�
			}
			b++;
		}
		System.out.println();
		System.out.println(sum); // ����3) ����2�� �´� ������ �� ���
		System.out.println(count); // ����4) ����2�� �´� ������ ���� ���
	}
}
