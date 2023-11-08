package chapter_03;

import java.util.*;

public class Prob01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int age = 0;
		
		System.out.println("나이를 입력하세요 : ");
		age = scan.nextInt();
		
		if(age>=19)
			System.out.println("성년");
		else
			System.out.println("미성년");
		
		scan.close();
	}

}
