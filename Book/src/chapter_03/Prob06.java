package chapter_03;

import java.util.*;

public class Prob06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String c = ""; // ö��
		String y = ""; // ����
		
		System.out.print("ö�� : ");
		c = scan.next();
		System.out.print("���� : ");
		y = scan.next();
		
		if(c.equals(y))
			System.out.println("���º�!");
		else if(c.equals("r") && y.equals("s") ||
				c.equals("p") && y.equals("r") || c.equals("p") && y.equals("r"))
				System.out.println("ö��, ��!");
		else if(y.equals("r") && c.equals("s") ||
				y.equals("p") && c.equals("r") || y.equals("p") && c.equals("r"))
				System.out.println("����, ��!");
		else
			System.out.println("�Է� ����");
		
		scan.close();	
	}

}
