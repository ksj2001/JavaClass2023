package loop;
import java.util.*;
public class Loop_Example05 {
	public static void main(String[] args) {
		// ���ѷ����� ���������� �ڵ�
		Scanner scan = new Scanner(System.in);
		boolean run = true;
		while(run) {
			System.out.println("exit: -100");
			int num = scan.nextInt();
			if(num == -100) {
				System.out.println("���α׷� ����");
				run = false;
			}
		}
		scan.close();
	}

}
