package chapter_04_Prob01;

public class Triangle {
	//��� ����
	double base = 0.0; // �غ�
	double height = 0.0; // ����
	double area = 0.0; // ����
	
	//������
	public Triangle(double base, double height) {
		this.base = base;
		this.height = height;
	}
	
	//�޼���
	public double findArea() {
		area = base * height * 0.5;
		return area;
	}
}
