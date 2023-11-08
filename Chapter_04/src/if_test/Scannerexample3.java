package if_test;
import java.util.*;
public class Scannerexample3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자1 입력 : ");
		int num1 = scan.nextInt();
		System.out.print("숫자2 입력 : ");
		int num2 = scan.nextInt();
		System.out.print("정답 입력 : ");
		int ans = scan.nextInt();
		if (num1*num2==ans) {
			System.out.println("정답!");
		}
		else {
			System.out.println("땡!");
		}
		scan.close();
	}
}
