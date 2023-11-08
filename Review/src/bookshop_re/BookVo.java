package bookshop_re;

import java.util.*;
import java.text.*;

public class BookVo {
	//멤버변수 지정
	private String booktitle;
	private String author;
	private String publisher;
	private Date date;
	private int price;
	
	public String getBooktitle() {
		return booktitle;
	}
	public void setBooktitle(String booktitle) {
		this.booktitle = booktitle;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	//생성자
	public BookVo() {} // BookVo 클래스를 상속받는 클래스가 있을 수도 있으므로 기본 생성자는 남겨둔다.
	public BookVo(String booktitle, String author, String publisher, Date date, int price) {
		this.booktitle = booktitle;
		this.author = author;
		this.publisher = publisher;
		date.setYear(date.getYear()-1900);
		date.setMonth(date.getMonth()-1);
		date.setDate(date.getDate());
		this.date = date;
		this.price = price;
	}
	
	//toString 오버라이드
	@Override // 재정의
	public String toString() {
		DecimalFormat df = new DecimalFormat("#,###원");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd(E)");
		return String.format("%s %s %s %s %s", booktitle,author,publisher,sdf.format(date),df.format(price));
	}
	
}
