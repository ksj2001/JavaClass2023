package chapter_05;
import java.util.*;
public class LoopExample4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = 0;
		
		while(num != -100) {
			System.out.print("숫자 입력 : ");
			num = scan.nextInt();
		}
		
		System.out.println("프로그램 종료");
		
		scan.close();
	}
}
