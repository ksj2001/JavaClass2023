package abstracttest;

public class MainTest {

	public static void main(String[] args) {
		// Computer c1 = new Computer(); �߻�Ŭ������ �ν��Ͻ�ȭ �� �� ����.
		Computer c1 = new Desktop();
		c1.display();
		c1.typing();
		
		Computer c2 = new MyNoteBook();
		NoteBook n2 = new MyNoteBook();
		c2.display();
		n2.display();
	}

}
