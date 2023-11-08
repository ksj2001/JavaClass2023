package bookshop;
import java.util.*;
import java.text.*;
public class BookArrayList {
	ArrayList<BookVo> bookarraylist = new ArrayList<>();
	
	@Override
	public String toString() {
		String str = "";
		int total = 0;
		DecimalFormat d = new DecimalFormat("#,###원");
		SimpleDateFormat sd = new SimpleDateFormat("yyyy.MM.dd(E)");
		System.out.println("=================================================");
		System.out.println("도서명\t저자\t출판사\t출판일\t가격");
		System.out.println("=================================================");
		for(int i=0;i<bookarraylist.size();i++) {
			System.out.print(bookarraylist.get(i).getBooktitle()+"\t");
			System.out.print(bookarraylist.get(i).getAuthor()+"\t");
			System.out.print(bookarraylist.get(i).getPublisher()+"\t");
			System.out.print(sd.format(bookarraylist.get(i).getDate())+"\t");
			System.out.println(d.format(bookarraylist.get(i).getPrice()));
			total += bookarraylist.get(i).getPrice();
		}
		System.out.println("=================================================");
		System.out.println("합계 : "+d.format(total));
		System.out.println("=================================================");
		return str;
	}
	
	public void addList(BookVo vo) {
		bookarraylist.add(vo);
	}
}
