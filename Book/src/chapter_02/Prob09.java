package chapter_02;

import java.util.*;

public class Prob09 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int major = 0; // 전공 이수 학점
		int ge = 0; // 교양 이수 학점
		int normal = 0; // 일반 이수 학점

		System.out.print("전공 이수 학점 : ");
		major = scan.nextInt();
		System.out.print("교양 이수 학점 : ");
		ge = scan.nextInt();
		System.out.print("일반 이수 학점 : ");
		normal = scan.nextInt();

		if (major + ge + normal >= 140 && major >= 70 && ((ge >= 30 && normal >= 30) || (ge + normal >= 80)))
			System.out.println("졸업 가능");
		else
			System.out.println("졸업 불가");
		
		scan.close();
	}

}
