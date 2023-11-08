package bookshop;
import java.util.*;
import java.text.*;

public class BookArrayList {
	ArrayList<BookVo> booklist = new ArrayList<>();
	
	@Override
	public String toString() {
		String str = "";
		int total = 0;
		DecimalFormat d = new DecimalFormat("#,###��");
		System.out.println("=====================================================");
		System.out.println("������\t����\t���ǻ�\t\t������\t\t����");
		System.out.println("=====================================================");
		for(int i=0;i<booklist.size();i++) {
			System.out.println(booklist.get(i).toString());
			total += booklist.get(i).getPrice();
		}
		System.out.println("=====================================================");
		System.out.println("�հ� : "+d.format(total));
		System.out.println("=====================================================");
		return str;
	}
	
	public void addBook(BookVo vo) {
		booklist.add(vo);
	}
}
