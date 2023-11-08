package byteInputOutputStream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest02 {

	public static void main(String[] args) {
		// AutoCloseable �������̽��� �ڹ� 8�̻� ���ʹ� try() ��ȣ �ȿ� �ν��Ͻ��� �����ϸ� close�� �ۼ����� �ʾƵ� �ȴ�.
		try(FileInputStream fis = new FileInputStream("input2.txt")) {
			
			// ����Ʈ�� �迭�� ��� ���
			byte[] bt = new byte[10];
			int i = 0; // input2.txt�� �����͸� �о���� ������ ��ȯ
			while((i = fis.read(bt)) != -1) {
				// ���۸� ��°�� ��� - �� �������� ���� �ڷ����� ��µȴ�.
//				for(byte b : bt) {
//					System.out.print((char)b);
//				}
				// �о���� ������ŭ�� ���
				for(int j=0;j<i;j++) {
					System.out.print((char)bt[j]);
				} System.out.println(" "+i+"byte ����");
			}
			
		} catch(IOException ioe) {
			System.out.println(ioe);
		}
	
	
	}

}
