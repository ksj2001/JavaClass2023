package chapter_02;

import java.util.*;

public class Prob03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int rad = 0; // 원기둥의 밑면 반지름
		int h = 0; // 원기둥의 높이
		double vol = 0.0; // 원기둥의 부피 
		
		System.out.print("원기둥의 밑면 반지름은? ");
		rad = scan.nextInt();
		System.out.print("원기둥의 높이는? ");
		h = scan.nextInt();
		
		vol = Math.pow(rad, 2) * h * 3.14;
		
		System.out.println("원기둥의 부피는 "+vol);
		
		scan.close();
	}

}
