package inheritance01;

public class ColorTV extends TV {
	protected int color;
	
	public ColorTV() {}
	public ColorTV(int size,int color) {
		super.size = size;
		this.color = color;
	}
	
	public void printProperty() {
		System.out.print(size+"인치 "+color+"컬러");
	}
}
