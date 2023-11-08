package object;

class Book {
	String title;
	String author;
	
	public Book() {}
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	// 최상위 클래스 Object 클래스의 toString 메서드 재정의
	@Override
	public String toString() {
		return "책이름 : "+title+", 저자 : "+author;
	}
	
	
	
	}



public class ToStringTest {

	public static void main(String[] args) {
		Book book = new Book("자바의정석","남궁성");
		System.out.println(book);
		
		// String 클래스는 object 클래스에 toString 메서드가 이미 재정의되어있다.
		String str = new String("abc");
		String str2 = new String("Abc");
		
		System.out.println(str == str2);
		System.out.println(str.equals(str2));
		System.out.println(str.equalsIgnoreCase(str2));
	}

}
