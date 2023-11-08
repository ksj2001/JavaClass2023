package loop;
import java.util.*;
public class LoopExample3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		int num1 = 0; // 랜덤 생성 숫자1
		int num2 = 0; // 랜덤 생성 숫자2
		int ans = 0; // 입력한 답
		int score = 0; // 성적
		for(int i=0;i<5;i++) {
			num1 = ran.nextInt(9)+1;
			num2 = ran.nextInt(9)+1;
			System.out.print(num1+" X "+num2+" = ");
			ans = scan.nextInt();
			if(num1*num2==ans) {
				score += 20;
			}
		}
		System.out.println("성적 = "+score+"점");
		scan.close();
	}
}
