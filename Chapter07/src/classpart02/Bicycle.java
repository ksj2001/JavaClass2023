package classpart02;

public class Bicycle {
	//멤버 변수 = 속성
	String color;
	int price;
	
	//생성자 : 생성자의 이름은 클래스명과 같아야 한다.
	public Bicycle() {
		System.out.println("Bicycle1");
	}
	//매개변수가 존재하는 생성자
	public Bicycle(String c, int p) {
		color = c;
		price = p;
	}
	
	public void BicycleInfo() {
		System.out.println("BicycleColor: "+color);
		System.out.println("BicyclePrice: "+price);
	}
}
