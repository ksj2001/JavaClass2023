package chapter_03;

import java.util.*;

public class Prob06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String c = ""; // Ã¶¼ö
		String y = ""; // ¿µÈñ
		
		System.out.print("Ã¶¼ö : ");
		c = scan.next();
		System.out.print("¿µÈñ : ");
		y = scan.next();
		
		if(c.equals(y))
			System.out.println("¹«½ÂºÎ!");
		else if(c.equals("r") && y.equals("s") ||
				c.equals("p") && y.equals("r") || c.equals("p") && y.equals("r"))
				System.out.println("Ã¶¼ö, ½Â!");
		else if(y.equals("r") && c.equals("s") ||
				y.equals("p") && c.equals("r") || y.equals("p") && c.equals("r"))
				System.out.println("¿µÈñ, ½Â!");
		else
			System.out.println("ÀÔ·Â ¿À·ù");
		
		scan.close();	
	}

}
