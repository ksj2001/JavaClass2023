package abstracttest;

public class Desktop extends Computer{

	@Override
	public void display() {
		System.out.println("desktop display");
	}

	@Override
	public void typing() {
		System.out.println("desktop typing");
	}
 
}
