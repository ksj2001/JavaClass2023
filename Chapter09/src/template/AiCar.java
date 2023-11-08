package template;

public class AiCar extends Car{

	@Override
	public void drive() {
		System.out.println("자율주행 합니다.");
		System.out.println("자동차가 스스로 방향을 전환합니다.");
	}

	@Override
	public void stop() {
		System.out.println("자동차가 스스로 멈춤니다.");
	}

	@Override
	public void wiper() {
		System.out.println("비나 눈의 양에따라 자동으로 조작합니다.");	
	}

	@Override
	public void washCar() {
		System.out.println("자동으로 세차가 됩니다.");
	}
}
