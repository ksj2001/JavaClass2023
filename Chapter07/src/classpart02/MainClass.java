package classpart02;

public class MainClass {

	public static void main(String[] args) {
		Bicycle by = new Bicycle();
		Grandeur gd = new Grandeur();
		
		by.color = "blue";
		by.price = 150000;
		by.BicycleInfo();
		System.out.println();
		gd.color = "red";
		gd.gear = "manual";
		gd.price = 30000000;
		gd.run();
		gd.stop();
		gd.grandeurInfo();
		}

}
