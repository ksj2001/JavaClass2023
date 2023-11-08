package generic;
import java.util.*;
// <T extends Ŭ������> : ���ʿ��� Ŭ������ �������� �ʴ� ������ �Ŵ� ����̴�.
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
