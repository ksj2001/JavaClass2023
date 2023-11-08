package generic;

public class ThreeDPrinterTest {

	public static void main(String[] args) {
		ThreeDPrinter<Material> materialPrinter = new ThreeDPrinter<>();
		//plasticPrinter.setMaterial(new Material());
		Material print = materialPrinter.getMaterial();
		//System.out.println(print);
		
		ThreeDPrinter<Powder> powderPrinter = new ThreeDPrinter<>();
		powderPrinter.setMaterial(new Powder());
		Powder print2 = powderPrinter.getMaterial();
		
		powderPrinter.add(new Powder());
		
		materialPrinter.add(new Plastic());
		materialPrinter.add(new Powder());
		System.out.println(powderPrinter);
		System.out.println(materialPrinter);
		
		/*
		ThreeDPrinter<Water> waterPrinter = new ThreeDPrinter<>();
		waterPrinter.setMaterial(new Water());
		Water print2 = waterPrinter.getMaterial();
		System.out.println(print2);
		*/
	}

}
