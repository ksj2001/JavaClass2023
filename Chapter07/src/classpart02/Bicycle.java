package classpart02;

public class Bicycle {
	//��� ���� = �Ӽ�
	String color;
	int price;
	
	//������ : �������� �̸��� Ŭ������� ���ƾ� �Ѵ�.
	public Bicycle() {
		System.out.println("Bicycle1");
	}
	//�Ű������� �����ϴ� ������
	public Bicycle(String c, int p) {
		color = c;
		price = p;
	}
	
	public void BicycleInfo() {
		System.out.println("BicycleColor: "+color);
		System.out.println("BicyclePrice: "+price);
	}
}
