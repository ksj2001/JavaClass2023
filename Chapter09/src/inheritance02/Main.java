package inheritance02;

public class Main {

	public static void main(String[] args) {
		ShapPencil sp = new ShapPencil(10,1);
		BallPen bp = new BallPen(25,2,"black");
		FunctionPen fp = new FunctionPen(15,2,"blue");
		
		sp.printProperty();
		bp.printProperty();
		fp.printProperty();
	}

}
