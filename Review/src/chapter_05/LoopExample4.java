package chapter_05;
import java.util.*;
public class LoopExample4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = 0;
		
		while(num != -100) {
			System.out.print("���� �Է� : ");
			num = scan.nextInt();
		}
		
		System.out.println("���α׷� ����");
		
		scan.close();
	}
}
