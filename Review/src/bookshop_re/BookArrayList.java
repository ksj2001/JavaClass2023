package bookshop_re;

import java.util.*;
import java.text.*;

public class BookArrayList {
	//BookVo Ŭ������ ArrayList�� ����� ������ Ÿ������ �ۼ�
	ArrayList<BookVo> booklist = new ArrayList<>();
	
	//toString() �������̵� ���
	@Override
	public String toString() {
		String str = ""; // String������ return�ϱ� ���� ���� ����
		DecimalFormat df = new DecimalFormat("#,###��");
		int total = 0; // �հ�
		System.out.println("============================================");
		System.out.println("������\t����\t���ǻ�\t������\t����");
		System.out.println("============================================");
		for(int i=0;i<booklist.size();i++) {
			System.out.println(booklist.get(i).toString());
			total += booklist.get(i).getPrice();
		}
		System.out.println("============================================");
		System.out.println("�հ� : "+df.format(total));
		System.out.println("============================================");
		return str;
	}
	
	public void aaa() {
		System.out.println("----------------------");
	}
	
	//ArrayList add(�߰�) �ۼ�
	public void addBook(BookVo vo) {
		booklist.add(vo);
	}
}
