package byteInputOutputStream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest {

	public static void main(String[] args) {
		// FileOutputStream�� ���� �ȿ� �ڷḦ ����Ѵ�. �ٸ�, file�� �������� ���� ��� ���� �����Ѵ�.
		// write() �޼��带 �̿��Ͽ� ����Ѵ�.
		// FileOutputStream�� ������ �������̵� �ȴ�.
		// file�� �������̵� ���� �������� FileOutputStream("output.txt",true)�� �Է��ؾ� �Ѵ�.
		try(FileOutputStream fos = new FileOutputStream("output.txt",true)){
			fos.write(65);
			fos.write(66);
			fos.write(67);
		} catch(IOException ioe) {
			System.out.println(ioe);
		} System.out.println("end");
	}

}
