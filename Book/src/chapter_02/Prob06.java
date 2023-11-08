package chapter_02;

import java.util.*;

public class Prob06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double f = 0; // È­¾¾¿Âµµ
		double c = 0; // ¼·¾¾¿Âµµ
		
		System.out.print("È­¾¾¿Âµµ(¢µ) ÀÔ·Â : ");
		f = scan.nextInt();
		c = (double)5/9*(f-32);
		
		System.out.println("¼·¾¾¿Âµµ(¡É) : "+c);
		
		scan.close();
	}

}
