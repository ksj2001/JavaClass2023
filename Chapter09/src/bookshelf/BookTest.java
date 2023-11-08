package bookshelf;

//import java.util.ArrayList;

public class BookTest {

	public static void main(String[] args) {
		
		BookShelf book = new BookShelf();
		  // Queue book = new BookShelf();
		System.out.println("입력");
		book.inQueue("인어공주1");
		book.inQueue("인어공주2");
		book.inQueue("인어공주3");
		book.inQueue("인어공주4");
		book.inQueueInfo();
		System.out.println("출력");
		//System.out.println(book.deQueue());
		book.deQueueInfo();
	}

}
