package abstracttest;

public abstract class Computer {
	
	public abstract void display(); // �߻� �޼���� body�� ����.
	public abstract void typing();
	
	public void turnOn() {
		System.out.println("��ǻ�͸� �մϴ�.");
	}
	public void turnOff() {
		System.out.println("��ǻ�͸� ���ϴ�.");
	}
	
}
