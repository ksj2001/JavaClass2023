package bookshop_re;

import java.util.*;
import java.text.*;

public class BookArrayList {
	//BookVo 클래스를 ArrayList에 저장될 데이터 타입으로 작성
	ArrayList<BookVo> booklist = new ArrayList<>();
	
	//toString() 오버라이드 출력
	@Override
	public String toString() {
		String str = ""; // String값으로 return하기 위한 변수 생성
		DecimalFormat df = new DecimalFormat("#,###원");
		int total = 0; // 합계
		System.out.println("============================================");
		System.out.println("도서명\t저자\t출판사\t출판일\t가격");
		System.out.println("============================================");
		for(int i=0;i<booklist.size();i++) {
			System.out.println(booklist.get(i).toString());
			total += booklist.get(i).getPrice();
		}
		System.out.println("============================================");
		System.out.println("합계 : "+df.format(total));
		System.out.println("============================================");
		return str;
	}
	
	public void aaa() {
		System.out.println("----------------------");
	}
	
	//ArrayList add(추가) 작성
	public void addBook(BookVo vo) {
		booklist.add(vo);
	}
}
