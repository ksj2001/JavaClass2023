package classpart12;

public class Card {
	public static int width = 150;// public 접근제어자는 외부, 내부 상관없이 모두 사용가능
	public static int height = 300;
	
	int number;
	String shape;
	
	public void info() {
		System.out.println(width);
		System.out.println(height);
	}
}
