package chapter_03;

import java.util.*;

public class Prob07 {

	public static void main(String[] args) {
		String c = input("ö��");
		String y = input("����");
		whosWin(c, y);
		
	}
	
	private static String input(String s) {
		Scanner scan = new Scanner(System.in);
		System.out.print(s+" : ");
		String input = scan.next();
		return input;
	}
	
	private static void whosWin(String s1, String s2) {
		if(s1.equals(s2))
			System.out.println("���º�!");
		else if(s1.equals("r") && s2.equals("s") ||
				s1.equals("p") && s2.equals("r") || s1.equals("p") && s2.equals("r"))
				System.out.println("ö��, ��!");
		else if(s2.equals("r") && s1.equals("s") ||
				s2.equals("p") && s1.equals("r") || s2.equals("p") && s1.equals("r"))
				System.out.println("����, ��!");
		else
			System.out.println("�Է� ����");
		return;
	}

}
