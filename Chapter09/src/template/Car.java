package template;

public abstract class Car {
	// ���� ������ ���� �޸��ų� ���ߴ� ����� �ٸ��� ������ // ���� Ŭ�������� ��ü������ �����ؾ� �ϹǷ� �߻� �޼���� �ۼ��Ѵ�.
	public abstract void drive();
	public abstract void stop();
	public abstract void wiper();
	//�� �޼���� �����ڵ尡 �������� ������ ���� Ŭ�������� �ʿ信 ���� �����ϴ� �޼��带 ���´´�.
	public void washCar() {}
	public void startCar() { System.out.println("�õ��� �մϴ�.");
	}
	public void turnOff() { System.out.println("�õ��� ���ϴ�.");
	}
	
	//���ø� �޼���� �Ϸ��� �۾����� ������� �����س��´�.
	//���ø� �޼���� final Ű���带 ����Ѵ�.
	//���ø� �޼���� ��ӵ��� �ʴ´�.
	//final�� ������� �޼���� �����ǵ��� �ʴ´�.
	final public void run() {
		startCar();
		drive();
		wiper();
		stop();
		washCar(); // turnOff();
	}
}
