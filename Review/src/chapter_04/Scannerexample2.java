package chapter_04;
import java.util.*;
public class Scannerexample2 {
	public static void main(String[] args) {
		System.out.println("���� ���� ��! (����[0],����[1],��[2])");
		Scanner scan = new Scanner(System.in);
		int me = scan.nextInt();
		int com = 1;
		
		if(me<0 || me>2) {
			System.out.println("�Է°� ���� (0~2 ������ ���ڸ� �Է� ����)");
		}
		else if(me==com) {
			System.out.println("���� ������ �´�!"); // ���: com
			System.out.println("����.");
		}
		else if(me>com) {
			System.out.println("���� ������ �´�!");
			System.out.println("���� �̰��."); // ��: me
		}
		else {
			System.out.println("���� ������ �´�!");
			System.out.println("���� ����.");
		}
		scan.close();
	}
}
