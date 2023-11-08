package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsExceptionTest {
	// throws : 예외처리를 함수를 호출하는 곳으로 미루는 예외처리
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
