package bookshelf;

//import java.util.ArrayList;

public class BookTest {

	public static void main(String[] args) {
		
		BookShelf book = new BookShelf();
		  // Queue book = new BookShelf();
		System.out.println("�Է�");
		book.inQueue("�ξ����1");
		book.inQueue("�ξ����2");
		book.inQueue("�ξ����3");
		book.inQueue("�ξ����4");
		book.inQueueInfo();
		System.out.println("���");
		//System.out.println(book.deQueue());
		book.deQueueInfo();
	}

}
