package template;

public abstract class Car {
	// 차의 종류에 따라 달리거나 멈추는 기능이 다르기 때문에 // 하위 클래스에서 구체적으로 구현해야 하므로 추상 메서드로 작성한다.
	public abstract void drive();
	public abstract void stop();
	public abstract void wiper();
	//훅 메서드로 구현코드가 존재하진 않지만 하위 클래스에서 필요에 의해 구현하는 메서드를 일컫는다.
	public void washCar() {}
	public void startCar() { System.out.println("시동을 켭니다.");
	}
	public void turnOff() { System.out.println("시동을 끕니다.");
	}
	
	//템플릿 메서드는 일련의 작업들을 순서대로 정의해놓는다.
	//템플릿 메서드는 final 키워드를 사용한다.
	//템플릿 메서드는 상속되지 않는다.
	//final로 만들어진 메서드는 재정의되지 않는다.
	final public void run() {
		startCar();
		drive();
		wiper();
		stop();
		washCar(); // turnOff();
	}
}
