package abstracttest;

public class MainTest {

	public static void main(String[] args) {
		// Computer c1 = new Computer(); 추상클래스는 인스턴스화 할 수 없다.
		Computer c1 = new Desktop();
		c1.display();
		c1.typing();
		
		Computer c2 = new MyNoteBook();
		NoteBook n2 = new MyNoteBook();
		c2.display();
		n2.display();
	}

}
