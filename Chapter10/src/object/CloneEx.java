package object;

class Point {
	int x;
	int y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public String toString() {
		return "X : " + x + ", Y : " + y;
	}
}

class Circle implements Cloneable{
	Point point;
	private int radius;

	public Circle(int x, int y, int radius) {
		point = new Point(x, y);
		this.radius = radius;
	}

	public String toString() {
		return "원점은 :" + this.point + "이고, 반지름은 :" + this.radius + "입니다.";
	}

	@Override
	protected Circle clone() throws CloneNotSupportedException {
		return (Circle) super.clone();
	}
}

public class CloneEx {

	public static void main(String[] args) throws CloneNotSupportedException {
         Circle circle1 = new Circle(10,20,5);
         Circle circle2 = (Circle)circle1.clone();
         System.out.println(circle1);
         System.out.println(circle2);
	}

}
