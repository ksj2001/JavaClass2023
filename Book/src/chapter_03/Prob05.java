package chapter_03;

public class Prob05 {

	public static void main(String[] args) {
		for(int i=3;i<=20;i++) {
			for(int a=1;a<=i;a++) {
				for(int b=1;b<=i-a;b++) {
					int c = i-a-b;
					
					if((int)Math.pow(a,2)+(int)Math.pow(b,2)==(int)Math.pow(c,2))
						System.out.println("("+a+","+b+","+c+")");
				}
			}
		}
	}

}
