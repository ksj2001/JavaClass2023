package chapter_04_Prob05;

public class Line {
	// 멤버 변수
	private int length;

	// 접근자와 설정자
	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	// 생성자
	public Line(int length) {
		this.length = length;
	}

	// 메서드
	public boolean isSameLine(Line l) {
		System.out.println(l.length);
		System.out.println(length);
		if (l.length == length)
			return true;
		else
			return false;
	}
}
