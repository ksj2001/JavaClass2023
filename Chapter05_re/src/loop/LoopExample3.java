package loop;
import java.util.*;
public class LoopExample3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		int num1 = 0; // ���� ���� ����1
		int num2 = 0; // ���� ���� ����2
		int ans = 0; // �Է��� ��
		int score = 0; // ����
		for(int i=0;i<5;i++) {
			num1 = ran.nextInt(9)+1;
			num2 = ran.nextInt(9)+1;
			System.out.print(num1+" X "+num2+" = ");
			ans = scan.nextInt();
			if(num1*num2==ans) {
				score += 20;
			}
		}
		System.out.println("���� = "+score+"��");
		scan.close();
	}
}
