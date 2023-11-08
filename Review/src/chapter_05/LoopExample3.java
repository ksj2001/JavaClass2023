package chapter_05;
import java.util.*;
public class LoopExample3 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		int num1 = 0; // 게임에 사용되는 숫자1
		int num2 = 0; // 게임에 사용되는 숫자2
		int score = 0; // 성적 값
		int i = 0; // 반복문에 사용되는 값
		
		while(i<5) { // 5번 반복
			num1 = ran.nextInt(9)+1; // 랜덤 숫자1 생성
			num2 = ran.nextInt(9)+1; // 랜덤 숫자2 생성
			System.out.print(num1+" X "+num2+" = ");
			int ans = scan.nextInt(); // 정답 입력
			if(ans == num1 * num2) {
				score += 20; // 정답을 맞출때마다 20점씩 추가
			}
			i++; // 1씩 누적
		}
		
		System.out.println("성적 = "+score+"점"); // 게임 종료 후 성적 출력
		scan.close();
	}
}
