package array;
import java.util.*;
public class ArrayExample07 {
	public static void main(String[] args) {
		Random ran = new Random();
		int[] answer = {1,2,4,2,5};
		int[] hgdwer = new int[5];
		int score = 0;
		System.out.print("answer = { "); // 배열 answer
		for(int i=0;i<5;i++) {
			System.out.print(answer[i]+" ");
		}
		System.out.println("}");
		System.out.print("hgdwer = { "); // 배열 hgdwer
		for(int i=0;i<5;i++) {
			hgdwer[i] = ran.nextInt(5)+1;
			System.out.print(hgdwer[i]+" ");
		}
		System.out.println("}");
		System.out.print("정오표 = { "); // 배열 정오표
		for(int i=0;i<5;i++) {
			if(answer[i]==hgdwer[i]) {
				System.out.print("O ");
				score += 20;
			}
			else {
				System.out.print("X ");
			}
		}
		System.out.println("}");
		System.out.println(score); // 성적
	}
}
