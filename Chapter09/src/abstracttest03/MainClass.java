package abstracttest03;

public class MainClass {

	public static void main(String[] args) {
		Converter c1 = new Km2Mile();
		c1.run();
		System.out.println();
		Converter c2 = new Won2Dollar();
		c2.run();
	}
}
