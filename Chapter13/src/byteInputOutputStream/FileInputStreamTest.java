package byteInputOutputStream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest {

	public static void main(String[] args) {
		// FileNotFoundException은 IOException의 하위 클래스이므로 IOException만 처리해도 FileNotFoundException은 알아서 나온다.
		// FileInputStream은 바이트 스트림이다. (한 바이트씩 읽어들임)
		// 바이트 스트림은 한글을 출력할 수 없다.
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("input.txt");// FileInputStream은 input.txt 파일을 읽어들이는 stream
//			System.out.println(fis.read()); // read 메서드 : 자료가 존재하지 않으면 -1을 return받는다.
//			System.out.println(fis.read());
//			System.out.println(fis.read());
			int i = 0;
			while((i = fis.read()) != -1) {
				System.out.println((char)i);
			}
			fis.close(); // 반드시 close 해줘야 한다. 하지 않으면 무한루프 때문에 시스템이 멈출 수도 있다.
			
		} catch(IOException ioe) {
			System.out.println(ioe);
		} 
//		finally {
//			try {
//				fis.close();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}

	}

}
