package chapter_02;

import java.util.*;

public class Prob08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = 0; 
		int digitSum = 0; // 각 자릿수의 합
		
		System.out.print("0~999 사이의 숫자를 입력하세요 : ");
		num = scan.nextInt();
		
		if(num<0 || num>999)
			System.out.println("범위 초과");
		else {
			digitSum = (num / 100) + (num % 100 / 10) + (num % 100 % 10); 
			System.out.println("각 자릿수의 합 = "+digitSum);
		}
		
		scan.close();
	}

}
