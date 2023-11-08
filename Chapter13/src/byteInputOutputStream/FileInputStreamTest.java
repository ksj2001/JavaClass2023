package byteInputOutputStream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest {

	public static void main(String[] args) {
		// FileNotFoundException�� IOException�� ���� Ŭ�����̹Ƿ� IOException�� ó���ص� FileNotFoundException�� �˾Ƽ� ���´�.
		// FileInputStream�� ����Ʈ ��Ʈ���̴�. (�� ����Ʈ�� �о����)
		// ����Ʈ ��Ʈ���� �ѱ��� ����� �� ����.
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("input.txt");// FileInputStream�� input.txt ������ �о���̴� stream
//			System.out.println(fis.read()); // read �޼��� : �ڷᰡ �������� ������ -1�� return�޴´�.
//			System.out.println(fis.read());
//			System.out.println(fis.read());
			int i = 0;
			while((i = fis.read()) != -1) {
				System.out.println((char)i);
			}
			fis.close(); // �ݵ�� close ����� �Ѵ�. ���� ������ ���ѷ��� ������ �ý����� ���� ���� �ִ�.
			
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
