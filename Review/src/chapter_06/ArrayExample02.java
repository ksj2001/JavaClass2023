package chapter_06;

import java.util.*;

public class ArrayExample02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String name[] = {"홍길동","개나리","진달래","김백합","최동훈"};
		int score[] = new int[5];
		int total = 0; // 총점
		
		for(int i=0 ; i<5 ; i++) {
			System.out.print(name[i]+"의 성적을 입력하세요 ");
			score[i] = scan.nextInt(); 
			total += score[i];
		}
		
		for(int i=0 ; i<5 ; i++) {
			System.out.println(name[i]+"의 점수 : "+score[i]); 
		}
		System.out.println("------------------------------");
		System.out.println("평점 : "+total/5);
		
		scan.close();
	}
}
