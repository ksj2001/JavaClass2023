package if_test;
import java.util.*;
public class Scannerexample2_1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		int com = ran.nextInt(3);
		//0���� n-1���� ������ �߻��Ѵ�.
		System.out.println(com);
		System.out.println("����(0), ����(1), ��(2) �߿��� �ϳ��� �Է��� ��.");
		int me = scan.nextInt();
		if (me == com) {
			System.out.println("����.");
		}
		else if ((me == 0 && com == 2)||(me == 2 && com == 1)||(me == 1 && com == 0)) {
			System.out.println("���� �̰��.");
		}
		else if ((me == 0 && com == 1)||(me == 2 && com == 0)||(me == 1 && com == 2)) {
			System.out.println("���� ����.");
		}
		else {
			System.out.println("�߸� �Է��߾�.");
		}
		scan.close();
	}
}
