package chapter_04_Prob04;

public class Car {
	String color;
	static int carNum = 0;
	static int redCarNum = 0;
	// int redCarNum = 0;
	
	public Car(String color) {
		this.color = color;
		carNum++;
		if(color.equalsIgnoreCase("red"))
			redCarNum++;
	}
	
	public static int getNumOfCar() {
		return carNum;
	}
	
	public static int getNumOfRedCar() {
		return redCarNum;
	}
	
	/*
	public int getNumOfRedCar() {
		return redCarNum;
	}
	*/
}
