package chapter_04_Prob04;

public class CarTest {
	public static void main(String[] args) {
		Car c1 = new Car("red");
		Car c2 = new Car("blue");
		Car c3 = new Car("RED");
		
		System.out.printf("�ڵ��� �� : %d, ������ �ڵ��� �� : %d",
							Car.getNumOfCar(), Car.getNumOfRedCar());
	}
}
