package bookshop;
import java.util.*;
public class MainClass {

	public static void main(String[] args) {
		BookArrayList book = new BookArrayList();
		book.addBook(new BookVo("�ڹ�","ȫ�浿","�ڸ������ǻ�",new Date(2010,05,06),35000));
		book.addBook(new BookVo("�ڹ�","��浿","�ڸ������ǻ�",new Date(2011,07,10),45000));
		book.addBook(new BookVo("�ڹ�","�ڱ浿","�ڸ������ǻ�",new Date(2015,8,12),25000));
		book.addBook(new BookVo("�ڹ�","�ֱ浿","�ڸ������ǻ�",new Date(2009,10,8),15000));
		book.addBook(new BookVo("�ڹ�","���浿","�ڸ������ǻ�",new Date(2010,11,25),55000));
		System.out.println(book.toString());
	}

}
