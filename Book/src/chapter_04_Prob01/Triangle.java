package chapter_04_Prob01;

public class Triangle {
	//멤버 변수
	double base = 0.0; // 밑변
	double height = 0.0; // 높이
	double area = 0.0; // 넓이
	
	//생성자
	public Triangle(double base, double height) {
		this.base = base;
		this.height = height;
	}
	
	//메서드
	public double findArea() {
		area = base * height * 0.5;
		return area;
	}
}
