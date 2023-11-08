package subInputOutputStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderTest {

	public static void main(String[] args) {
		// InputStreamReader ��Ʈ���� ���� ��Ʈ������ �ݵ�� ��� ��Ʈ���� �������� �Ű������� �޾ƾ� �Ѵ�.
		// ������ ���ڷ� ��ȯ�Ͽ� �о���̴� ��Ʈ���̴�.
		// FileInputStream���� �ۼ��� ������ �ѱ� �����͸� �о�� �� �ִ�.
		
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
