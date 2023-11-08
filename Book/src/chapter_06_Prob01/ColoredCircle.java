package chapter_06_Prob01;

public class ColoredCircle extends Circle{
	protected String color;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public ColoredCircle() {}
	public ColoredCircle(int radius, String color) {
		super.radius = radius;
		this.color = color;
	}
	
	@Override
	public void show() {
		System.out.println("반지름이 "+radius+"인 "+color+" 원이다.");
	}
}

