package chapter_03;

public class Prob08 {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			printStar(i);
			System.out.println();
		}
	}
	
	public static void printStar(int n) {
		for(int i=1;i<=n;i++) {
			System.out.print("*");
		}
	}
}
