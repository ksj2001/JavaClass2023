package abstracttest;

public abstract class Computer {
	
	public abstract void display(); // 추상 메서드는 body가 없다.
	public abstract void typing();
	
	public void turnOn() {
		System.out.println("컴퓨터를 켭니다.");
	}
	public void turnOff() {
		System.out.println("컴퓨터를 끕니다.");
	}
	
}
