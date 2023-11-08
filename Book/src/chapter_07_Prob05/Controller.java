package chapter_07_Prob05;

public abstract class Controller {
	protected boolean power;
	
	public boolean isPower() {
		return power;
	}

	public void setPower(boolean power) {
		this.power = power;
	}

	public abstract String getName(); 
	
	final public void show() {
		System.out.print(getName()+"�� ");
		if(power==true) System.out.println("�������ϴ�.");
		else System.out.println("�������ϴ�.");
	}
}
