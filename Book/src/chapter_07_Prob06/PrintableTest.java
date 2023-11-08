package chapter_07_Prob06;

public class PrintableTest {
	public static void main(String[] args) {
		Printable p = new B4();
		Call c = new Call();
		c.invoke(p);
	}
}
