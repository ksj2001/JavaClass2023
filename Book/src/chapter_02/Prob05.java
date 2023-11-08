package chapter_02;

import java.util.*;

public class Prob05 {

	public static void main(String[] args) {
		Random ran = new Random();
		char c = (char)(97+ran.nextInt(26));
		System.out.println(c);
		
		c = (char)(c+((int)'A'-(int)'a'));
		System.out.println(c);
	}

}
