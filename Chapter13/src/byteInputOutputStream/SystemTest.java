package byteInputOutputStream;

import java.io.IOException;

public class SystemTest {

	public static void main(String[] args) {
		System.out.println("���� ���ڸ� �Է��ϰ� ���� ���ּ���");
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
