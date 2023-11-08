package if_test;
import java.util.*;
public class Scannerexample1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자를 입력하세요: ");
		int me = scan.nextInt();
		int com = 8;
		if (me < com) {
			System.out.println("Up!");
		}
		else if (me == com) {
			System.out.println("Bingo!");
		}
		else if (me > com) {
			System.out.println("Down!");
		}
		scan.close();
	}
}
