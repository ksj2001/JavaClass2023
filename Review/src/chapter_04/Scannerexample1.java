package chapter_04;
import java.util.*;
// �ݺ������� ���� (Bingo�� ���� ������ �ݺ�)
public class Scannerexample1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int me = 0;
		int com = 8;
		while(me!=com) {
			System.out.println("���ڸ� ���纸����! (1���� 15������ �ڿ��� �� �ϳ� �Է�)");
			System.out.print("���� �Է� : ");
			me = scan.nextInt();
			
			if(me<1 || me>15) {
				System.out.println("���� �ȿ� �ִ� ���ڸ� �Է����ּ���.");
				System.out.println();
			}
			else if(me==com) {
				break;
			}
			else if(me<com) {
				System.out.println("Up");
				System.out.println();
			}
			else {
				System.out.println("Down");
				System.out.println();
			}
			
		}
		System.out.println("Bingo!");
		scan.close();
	}
}
