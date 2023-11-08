package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsExceptionTest {
	// throws : ����ó���� �Լ��� ȣ���ϴ� ������ �̷�� ����ó��
	public Class loadclass(String filename, String classname) throws FileNotFoundException, ClassNotFoundException {
		FileInputStream files = new FileInputStream(filename);
		Class c = Class.forName(classname);
		return c;
	}
	
	public static void main(String[] args) {
		ThrowsExceptionTest te = new ThrowsExceptionTest();
		
		try {
		    te.loadclass("a.txt", "java.lang.String");		
		} catch(FileNotFoundException e) {
			System.out.println(e);
		} catch(ClassNotFoundException e) {
			System.out.println(e);
		} catch(Exception e) {
			System.out.println(e);
		} finally {
			System.out.println("finally");
		}

	}

}
