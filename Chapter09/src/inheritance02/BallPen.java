package inheritance02;

public class BallPen extends ShapPencil{
	protected String color;
	
	public BallPen() {}
	public BallPen(int residual, int thickness, String color) {
		//super.residual = residual;
		//super.thickness = thickness;
		super(residual,thickness);
		this.color = color;
		name = "BallPen";
	}
	
	@Override
	public void printProperty() {
		System.out.println();
		super.printProperty();
		System.out.print(", »ö»ó:"+color);
	}

}
