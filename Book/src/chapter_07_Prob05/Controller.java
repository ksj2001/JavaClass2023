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
		System.out.print(getName()+"가 ");
		if(power==true) System.out.println("켜졌습니다.");
		else System.out.println("꺼졌습니다.");
	}
}
