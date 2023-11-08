package inheritance02;

public class FunctionPen extends BallPen{
	public FunctionPen() {}
	public FunctionPen(int residual, int thickness, String color) {
		super.residual = residual;
		super.thickness = thickness;
		//super(residual,thickness);
		this.color = color;
		name = "FunctionPen";
	}
	
	@Override
	public void printProperty() {
		super.printProperty();
	}
}
