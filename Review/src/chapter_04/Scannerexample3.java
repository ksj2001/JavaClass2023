package chapter_04;
import java.util.*;
// 응용 : A x B = ? 에서 A와 B는 1~9 사이의 자연수 중에서 임의의 값으로 지정됨
public class Scannerexample3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int num1 = ran.nextInt(9)+1;
		int num2 = ran.nextInt(9)+1;
		System.out.println(num1+" x "+num2+" = ?");
		int ans = scan.nextInt();
		
		if(num1*num2 == ans) {
			System.out.println("정답!");
		}
		else {
			System.out.println("땡!");
		}
		scan.close();
	}
}
