package chapter_04_Prob05;

public class Line {
	// ��� ����
	private int length;

	// �����ڿ� ������
	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	// ������
	public Line(int length) {
		this.length = length;
	}

	// �޼���
	public boolean isSameLine(Line l) {
		System.out.println(l.length);
		System.out.println(length);
		if (l.length == length)
			return true;
		else
			return false;
	}
}
