package chapter_03;

import java.util.*;

public class Prob02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int rank = 0;
		
		System.out.println("등수를 입력하세요 : ");
		rank = scan.nextInt();
		
		switch(rank) {
		case 1:
			System.out.println("아주 잘했습니다.");
			break;
		case 2: case 3:
			System.out.println("잘했습니다.");
			break;
		case 4: case 5: case 6:
			System.out.println("보통입니다.");
			break;
		default:
			System.out.println("노력해야겠습니다.");
			break;
		}
		
		scan.close();
	}
}
