package test;

import java.util.Scanner;

public class WhileTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = 0;
		
		while(true) {
			System.out.print("값 입력: ");
			a = scan.nextInt()-1;
			if(a!=0 && a!=1 && a!=2) {
				System.out.println("다시 입력");
			}
			else {
				if(a==0) {a=100;}
				else if(a==1) {a=200;}
				else {a=300;}
				break;
			}
		}
		
		System.out.println(a);

	}

}
