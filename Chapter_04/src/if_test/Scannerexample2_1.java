package if_test;
import java.util.*;
public class Scannerexample2_1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		int com = ran.nextInt(3);
		//0부터 n-1까지 난수가 발생한다.
		System.out.println(com);
		System.out.println("가위(0), 바위(1), 보(2) 중에서 하나를 입력해 줘.");
		int me = scan.nextInt();
		if (me == com) {
			System.out.println("비겼다.");
		}
		else if ((me == 0 && com == 2)||(me == 2 && com == 1)||(me == 1 && com == 0)) {
			System.out.println("내가 이겼다.");
		}
		else if ((me == 0 && com == 1)||(me == 2 && com == 0)||(me == 1 && com == 2)) {
			System.out.println("내가 졌다.");
		}
		else {
			System.out.println("잘못 입력했어.");
		}
		scan.close();
	}
}
