package chapter_04;
import java.util.*;
// ���� : A x B = ? ���� A�� B�� 1~9 ������ �ڿ��� �߿��� ������ ������ ������
public class Scannerexample3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int num1 = ran.nextInt(9)+1;
		int num2 = ran.nextInt(9)+1;
		System.out.println(num1+" x "+num2+" = ?");
		int ans = scan.nextInt();
		
		if(num1*num2 == ans) {
			System.out.println("����!");
		}
		else {
			System.out.println("��!");
		}
		scan.close();
	}
}
