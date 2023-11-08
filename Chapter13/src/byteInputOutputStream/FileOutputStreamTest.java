package byteInputOutputStream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest {

	public static void main(String[] args) {
		// FileOutputStream은 파일 안에 자료를 출력한다. 다만, file이 존재하지 않을 경우 새로 생성한다.
		// write() 메서드를 이용하여 출력한다.
		// FileOutputStream은 파일이 오버라이드 된다.
		// file을 오버라이드 하지 않으려면 FileOutputStream("output.txt",true)를 입력해야 한다.
		try(FileOutputStream fos = new FileOutputStream("output.txt",true)){
			fos.write(65);
			fos.write(66);
			fos.write(67);
		} catch(IOException ioe) {
			System.out.println(ioe);
		} System.out.println("end");
	}

}
