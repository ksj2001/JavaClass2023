package stringInputOutputStream;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {

	public static void main(String[] args) {
		// FileWriter ��Ʈ���� ������ �������� ������ �ڵ� �������ش�.
		// ���� ������ ����ϴ� ��Ʈ���̴�.
		try(FileWriter fw = new FileWriter("output4.txt")){
			fw.write("A");
			char[] cr = {'b','c','d','e','f'};
			fw.write(cr);
			fw.write("�ڹ� ���α׷�");
			fw.write(cr, 2, 3);
		} catch(IOException ioe) {
			System.out.println(ioe);
		} System.out.println("end");
	}

}
