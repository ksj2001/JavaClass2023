package template;

public class MainClass {

	public static void main(String[] args) {
		Car c1 = new ManualCar();
		Car c2 = new AiCar();
		
		c1.run();
		System.out.println();
		c2.run();
	}

}
