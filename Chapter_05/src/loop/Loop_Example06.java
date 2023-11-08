package loop;
import java.util.*;
public class Loop_Example06 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		int score = 100;
		int ans = ran.nextInt(50)+1;
		boolean run = true;
		while(run) {
			System.out.print("정수를 입력하세요: ");
			int input = scan.nextInt();
			if(ans==input) {
				System.out.println("Bingo!");
				run = false;
			}
			else if(ans<input){
				System.out.println("Down!");
				score -= 5;				
			}
			else {
				System.out.println("Up!");
				score -= 5;
			}
		}
		System.out.println(score);
		scan.close();
	}
}
