package generic;
import java.util.*;
// <T extends 클래스명> : 불필요한 클래스는 연결하지 않는 제한을 거는 방식이다.
public class ThreeDPrinter<T extends Material> {
	
	ArrayList<T> list = new ArrayList<>();
	private T material;

	public T getMaterial() {
		return material;
	}

	public void setMaterial(T material) {
		this.material = material;
		//material.doPrint();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return list.toString();
	}
	
	public void print() {
		material.doPrint();
	}
	
	public void add(T printer) {
		list.add(printer);
	}
}
