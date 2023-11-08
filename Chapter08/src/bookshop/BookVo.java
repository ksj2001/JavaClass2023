package bookshop;
import java.util.*;
import java.text.*;
public class BookVo {
	private String booktitle = "";
	private String author = "";
	private String publisher = "";
	private Date date;
	private int price = 0;
	
	public BookVo() {}
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
	
	/*
	@Override // 재정의
	public String toString() {
		SimpleDateFormat sd = new SimpleDateFormat("yyyy.MM.dd(E)");
		DecimalFormat d = new DecimalFormat("#,###원");
		return String.format("%s %s %s %s %s",booktitle,author,publisher,sd.format(date),d.format(price));
	}
	*/
	
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
}
