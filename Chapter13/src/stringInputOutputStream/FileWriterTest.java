package stringInputOutputStream;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {

	public static void main(String[] args) {
		// FileWriter 스트림은 파일이 존재하지 않으면 자동 생성해준다.
		// 문자 단위로 출력하는 스트림이다.
		try(FileWriter fw = new FileWriter("output4.txt")){
			fw.write("A");
			char[] cr = {'b','c','d','e','f'};
			fw.write(cr);
			fw.write("자바 프로그램");
			fw.write(cr, 2, 3);
		} catch(IOException ioe) {
			System.out.println(ioe);
		} System.out.println("end");
	}

}
