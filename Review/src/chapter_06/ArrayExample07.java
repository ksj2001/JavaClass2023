package chapter_06;
import java.util.*;
public class ArrayExample07 {
	public static void main(String[] args) {
		Random ran = new Random();
		int[] answer = {1,3,4,2,5}; // 정답지
		int[] hgdwer = new int[5]; // 1~5 사이의 랜덤 숫자 5개
		for(int i=0 ; i<5 ; i++) {
			hgdwer[i] = ran.nextInt(5)+1; // 랜덤 숫자 설정
		}
		String[] errata = new String[5]; // 정오표
		int score = 0; // 성적
		
		for(int i=0; i<5 ; i++) {
			if(answer[i] == hgdwer[i]) { // 정답지와 일치
				errata[i] = "O"; // 정오표 : O
				score += 20; // 정답 하나당 성적 20점 추가
			}
			else { // 정답지와 불일치
				errata[i] = "X";
			}
		}
		
		System.out.println("answer = {"+answer[0]+", "+answer[1]+", "+answer[2]+", "+answer[3]
				+", "+answer[4]+"}");
		System.out.println("hgdwer = {"+hgdwer[0]+", "+hgdwer[1]+", "+hgdwer[2]+", "+hgdwer[3]
				+", "+hgdwer[4]+"}");
		System.out.println("정오표 = {"+errata[0]+", "+errata[1]+", "+errata[2]+", "+errata[3]
				+", "+errata[4]+"}");
		System.out.println("성적 = "+score+"점");
	}
}
