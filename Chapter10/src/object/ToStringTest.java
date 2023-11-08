package object;

class Book {
	String title;
	String author;
	
	public Book() {}
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	// �ֻ��� Ŭ���� Object Ŭ������ toString �޼��� ������
	@Override
	public String toString() {
		return "å�̸� : "+title+", ���� : "+author;
	}
	
	
	
	}



public class ToStringTest {

	public static void main(String[] args) {
		Book book = new Book("�ڹ�������","���ü�");
		System.out.println(book);
		
		// String Ŭ������ object Ŭ������ toString �޼��尡 �̹� �����ǵǾ��ִ�.
		String str = new String("abc");
		String str2 = new String("Abc");
		
		System.out.println(str == str2);
		System.out.println(str.equals(str2));
		System.out.println(str.equalsIgnoreCase(str2));
	}

}
