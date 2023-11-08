package bookshelf;
import java.util.*;
public class Shelf {
	// 멤버변수
	protected ArrayList<String> shelf;
	//생성자
	public Shelf() { 
		shelf = new ArrayList<String>();
	}
	
	public ArrayList<String> getShelf() { 
		return shelf;
	}
	public int getCount() { 
		return shelf.size();
	}
}
