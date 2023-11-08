package byteInputOutputStream;

import java.io.IOException;

public class SystemTest {

	public static void main(String[] args) {
		System.out.println("여러 문자를 입력하고 엔터 쳐주세요");
		int i = 0;
		try {
			while((i = System.in.read()) != '\n') {
				System.out.print((char)i+" ");
			}
		} catch(IOException e) {
			System.out.println(e);
		}
		System.out.println("end");
	}

}
