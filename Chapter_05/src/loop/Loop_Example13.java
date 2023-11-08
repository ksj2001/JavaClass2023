package loop;
public class Loop_Example13 {
	public static void main(String[] args) {
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=7;j++) {
				if(3+i >= j && 5-i <= j) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}