package chapter_05;
import java.util.*;
public class LoopExample3 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		int num1 = 0; // ���ӿ� ���Ǵ� ����1
		int num2 = 0; // ���ӿ� ���Ǵ� ����2
		int score = 0; // ���� ��
		int i = 0; // �ݺ����� ���Ǵ� ��
		
		while(i<5) { // 5�� �ݺ�
			num1 = ran.nextInt(9)+1; // ���� ����1 ����
			num2 = ran.nextInt(9)+1; // ���� ����2 ����
			System.out.print(num1+" X "+num2+" = ");
			int ans = scan.nextInt(); // ���� �Է�
			if(ans == num1 * num2) {
				score += 20; // ������ ���⶧���� 20���� �߰�
			}
			i++; // 1�� ����
		}
		
		System.out.println("���� = "+score+"��"); // ���� ���� �� ���� ���
		scan.close();
	}
}
