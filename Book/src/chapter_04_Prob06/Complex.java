package chapter_04_Prob06;

public class Complex {
	// ��� ����
	double r = 0.0; // �Ǽ� �κ�
	double i = 0.0; // ��� �κ�
	
	// ������
	public Complex(double r) {
		this.r = r;
	}
	
	public Complex(double r, double i) {
		this.r = r;
		this.i = i;
	}
	
	// �޼���
	public void print() {
		System.out.println(r+" + "+i+"i");
	}
}
