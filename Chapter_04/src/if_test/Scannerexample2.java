package if_test;
import java.util.*;
public class Scannerexample2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("가위(0), 바위(1), 보(2) 중에서 하나를 입력해 줘.");
		int me = scan.nextInt();
		int com = 1;
		if (me == com) {
			System.out.println("비겼다.");
		}
		else if (me == 2) {
			System.out.println("내가 이겼다.");
		}
		else if (me == 0) {
			System.out.println("내가 졌다.");
		}
		else {
			System.out.println("잘못 입력했어.");
		}
		scan.close();
	}
}
