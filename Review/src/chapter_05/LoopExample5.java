package chapter_05;
import java.util.*;
public class LoopExample5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		int score = 100; // ���� (100������ ����)
		int num = ran.nextInt(100)+1; // �������� 1 ~ 100
		int ans = 0; // �Է��ϴ� ��
		
		System.out.println(num); // �������� �� ��� (�׽�Ʈ��)
		
		while(true) {
			System.out.print("1 ~ 100������ ���� �� �ϳ� �Է� : ");
			ans = scan.nextInt();
			if(num==ans) { // ���� �Է�
				System.out.println("����!");
				break;
			}
			else if(num>ans) { // �Է��� ���� �������� num���� ������
				System.out.println("up");
				score -= 5; // 5�� ����
			}
			else { // �Է��� ���� �������� num���� ũ��
				System.out.println("down");
				score -= 5; // 5�� ����
			}
		}
		
		System.out.println("���� : "+score+"��"); // ���� ���� �� ���� ���
		
		scan.close();
	}

}
