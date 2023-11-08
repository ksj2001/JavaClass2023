package loop;
import java.util.*;
public class Loop_Example05 {
	public static void main(String[] args) {
		// 무한루프를 빠져나가는 코딩
		Scanner scan = new Scanner(System.in);
		boolean run = true;
		while(run) {
			System.out.println("exit: -100");
			int num = scan.nextInt();
			if(num == -100) {
				System.out.println("프로그램 종료");
				run = false;
			}
		}
		scan.close();
	}

}
