package if_test;
import java.util.*;
public class Scannerexample2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("����(0), ����(1), ��(2) �߿��� �ϳ��� �Է��� ��.");
		int me = scan.nextInt();
		int com = 1;
		if (me == com) {
			System.out.println("����.");
		}
		else if (me == 2) {
			System.out.println("���� �̰��.");
		}
		else if (me == 0) {
			System.out.println("���� ����.");
		}
		else {
			System.out.println("�߸� �Է��߾�.");
		}
		scan.close();
	}
}
