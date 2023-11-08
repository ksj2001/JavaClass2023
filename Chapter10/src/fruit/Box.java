package fruit;
import java.util.*;
public class Box<T extends Fruit>{
	ArrayList<T> list = new ArrayList<>();
	
	public void add(T item) {
		list.add(item);
	}

	@Override
	public String toString() {
		return list.toString();
	}

}
