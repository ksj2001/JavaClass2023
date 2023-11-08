package subInputOutputStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderTest {

	public static void main(String[] args) {
		// InputStreamReader 스트림은 보조 스트림으로 반드시 기반 스트림을 생성자의 매개변수로 받아야 한다.
		// 파일을 문자로 변환하여 읽어들이는 스트림이다.
		// FileInputStream으로 작성된 파일의 한글 데이터를 읽어올 수 있다.
		
		try(InputStreamReader isr = new InputStreamReader(new FileInputStream("input4.txt"))){
			int i = 0;
			while((i = isr.read()) != -1) {
				System.out.print((char)i);
			}
			
		} catch(IOException ioe) {
			System.out.println(ioe);
		} System.out.println("end");

	}

}
