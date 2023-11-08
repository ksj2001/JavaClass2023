package variable;

public class Exercise3 {
	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		int temp = 0;
		temp = x;
		System.out.println("temp= "+temp+", x= "+x);
		x = y;
		System.out.println("x= "+x+", y= "+y);
		y = temp;
		System.out.println("x= "+x+", y= "+y);
	}
}
