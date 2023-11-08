package chapter_02;

import java.util.*;

public class Prob07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = 0;
		
		System.out.print("정수 입력 : ");
		num = scan.nextInt();
		
		if(num % 4 == 0 && num % 5 == 0)
			System.out.println(true);
		else
			System.out.println(false);
		
		if(num % 4 == 0 || num % 5 == 0)
			System.out.println(true);
		else
			System.out.println(false);
		
		if((num % 4 == 0 || num % 5 == 0) && !(num % 4 == 0 && num % 5 == 0))
			System.out.println(true);
		else
			System.out.println(false);
		
		scan.close();
	}

}
