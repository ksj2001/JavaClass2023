package classpart08;

public class MainClass {
	public static void main(String[] args) {
		ClassEx0 c = new ClassEx0();
		c.num1 = 50;
		c.num2 = 10;
		System.out.println(c.sum(c.num1,c.num2));
		System.out.println(c.sub(c.num1,c.num2));
		System.out.println(c.mul(c.num1,c.num2));
		System.out.println(c.div(c.num1,c.num2));
	}
}
