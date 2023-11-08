package bookshop_re;
//********************
import java.util.*;
//********************
public class BookMain {

	public static void main(String[] args) {
		BookArrayList book = new BookArrayList();
		// book.addBook("자바","홍길동","코리아출판사",Date(2010,05,06),35000);
		book.addBook(new BookVo("자바","홍길동","코리아출판사",new Date(2010,05,06),35000));
		book.addBook(new BookVo("자바","김길동","코리아출판사",new Date(2011,07,10),45000));
		book.addBook(new BookVo("자바","박길동","코리아출판사",new Date(2015,8,12),25000));
		book.addBook(new BookVo("자바","최길동","코리아출판사",new Date(2009,10,8),15000));
		book.addBook(new BookVo("자바","오길동","코리아출판사",new Date(2018,11,25),55000));
		System.out.println(book);
	}
}
