package chapter_04;
import java.util.*;
// 반복문으로 응용 (Bingo가 나올 때까지 반복)
public class Scannerexample1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int me = 0;
		int com = 8;
		while(me!=com) {
			System.out.println("숫자를 맞춰보세요! (1부터 15까지의 자연수 중 하나 입력)");
			System.out.print("숫자 입력 : ");
			me = scan.nextInt();
			
			if(me<1 || me>15) {
				System.out.println("범위 안에 있는 숫자를 입력해주세요.");
				System.out.println();
			}
			else if(me==com) {
				break;
			}
			else if(me<com) {
				System.out.println("Up");
				System.out.println();
			}
			else {
				System.out.println("Down");
				System.out.println();
			}
			
		}
		System.out.println("Bingo!");
		scan.close();
	}
}
