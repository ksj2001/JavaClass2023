package chapter_06_Prob01;

public class Circle {
	protected int radius;

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public Circle() {}
	public Circle(int radius) {
		this.radius = radius;
	}
	
	public void show() {
		System.out.println("반지름이 "+radius+"인 원이다.");
	}
}

