package stringInputOutputStream;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {

	public static void main(String[] args) {
		// FileReaderStream은 문자 단위 스트림으로 한글을 읽을 수 있다.
		int i = 0;
		try(FileReader fr = new FileReader("input3.txt")) {
			while((i = fr.read()) != -1){
				System.out.print((char)i);
			}
		} catch(IOException ioe) {
			System.out.println(ioe);
		} System.out.println("end");

	}

}
