package if_test;
import java.util.*;
public class Scannerexample3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("����1 �Է� : ");
		int num1 = scan.nextInt();
		System.out.print("����2 �Է� : ");
		int num2 = scan.nextInt();
		System.out.print("���� �Է� : ");
		int ans = scan.nextInt();
		if (num1*num2==ans) {
			System.out.println("����!");
		}
		else {
			System.out.println("��!");
		}
		scan.close();
	}
}
