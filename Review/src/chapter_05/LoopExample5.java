package chapter_05;
import java.util.*;
public class LoopExample5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		int score = 100; // 점수 (100점부터 시작)
		int num = ran.nextInt(100)+1; // 랜덤숫자 1 ~ 100
		int ans = 0; // 입력하는 답
		
		System.out.println(num); // 랜덤숫자 값 출력 (테스트용)
		
		while(true) {
			System.out.print("1 ~ 100까지의 정수 중 하나 입력 : ");
			ans = scan.nextInt();
			if(num==ans) { // 정답 입력
				System.out.println("정답!");
				break;
			}
			else if(num>ans) { // 입력한 답이 랜덤숫자 num보다 작으면
				System.out.println("up");
				score -= 5; // 5점 감점
			}
			else { // 입력한 답이 랜덤숫자 num보다 크면
				System.out.println("down");
				score -= 5; // 5점 감점
			}
		}
		
		System.out.println("점수 : "+score+"점"); // 게임 종료 후 점수 출력
		
		scan.close();
	}

}
