package chapter_04_Prob06;

public class Complex {
	// 멤버 변수
	double r = 0.0; // 실수 부분
	double i = 0.0; // 허수 부분
	
	// 생성자
	public Complex(double r) {
		this.r = r;
	}
	
	public Complex(double r, double i) {
		this.r = r;
		this.i = i;
	}
	
	// 메서드
	public void print() {
		System.out.println(r+" + "+i+"i");
	}
}
