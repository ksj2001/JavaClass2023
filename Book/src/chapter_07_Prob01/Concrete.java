package chapter_07_Prob01;

public class Concrete extends Abstract{
	private int j;

	public int getJ() {
		return j;
	}

	public void setJ(int j) {
		this.j = j;
	}
	
	public Concrete(int i, int j) {
		super.i = i;
		this.j = j;
	}

	@Override
	public void show() {
		System.out.println("i = "+super.i+", j = "+j);
	}
		
}

