package classpart02;

public class Grandeur {
	//멤버 변수
	public String color;
	public String gear;
	public int price;
	//생성자
	public Grandeur() {
	System.out.println("Grandeur constructor");
	}
	//메서드
	public void run() {
	System.out.println("-- run --");
	}
	public void stop() {
		System.out.println("-- stop --");
	}
	public void grandeurInfo() {
		System.out.println("그랜저의 color는 "+color);
		System.out.println("그랜저의 gear는 "+gear);
		System.out.println("그랜저의 price는 "+price);
	}
	
}
