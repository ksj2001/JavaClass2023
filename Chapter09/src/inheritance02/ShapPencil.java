package inheritance02;

public class ShapPencil {
	protected int residual;
	protected int thickness;
	protected String name;
	
	public ShapPencil() {}
	public ShapPencil(int residual, int thickness) {
		this.residual = residual;
		this.thickness = thickness;
		name = "ShapPencil";
	}
	
	public void printProperty() {
		System.out.print(name+": ¿‹ø©∑Æ :"+residual+", ∆Ê±Ω±‚ :"+thickness);
	}
}
