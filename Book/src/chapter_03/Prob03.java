package chapter_03;

import java.util.*;

public class Prob03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = 0; // 입력한 양의 정수
		int evenSum = 0; // 입력한 양의 정수 중에서 짝수의 합
		
		do {
			System.out.println("양의 정수를 입력하세요 : ");
			num = scan.nextInt();
			
			if(num % 2 == 0)
				evenSum += num;
		} while(num > 0);
		
		System.out.println("입력한 양의 정수 중에서 짝수의 합은 "+evenSum);
		
		scan.close();
	}

}
