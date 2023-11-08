package chapter_02;

public class Prob01 {

	public static void main(String[] args) {
		for(int i=0;i<6;i++) {
			for(int j=0;j<5-i;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<1+2*i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
