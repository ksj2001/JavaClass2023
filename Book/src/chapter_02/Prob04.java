package chapter_02;

import java.util.*;

public class Prob04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int time = 0;
		int h = 0; // 시간
		int m = 0; // 분
		int s = 0; // 초
		
		System.out.print("초 단위 정수를 입력하세요 : ");
		time = scan.nextInt();
		
		h = time / (int)Math.pow(60, 2);
		m = time % (int)Math.pow(60, 2) / 60;
		s = time % (int)Math.pow(60, 2) % 60;
		
		System.out.printf("%d시간 %d분 %d초",h,m,s);
		
		scan.close();
	}

}
