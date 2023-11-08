package byteInputOutputStream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest02 {

	public static void main(String[] args) {
		// output2.txt�� A���� Z������ ��½��Ѷ�.
		// byte �迭�� �̿��Ͽ� �ۼ�
		// ������ ������ ���� ������ F5 Ű�� �Է��ؼ� refresh�Ѵ�.
		byte[] bt = new byte[26];
		byte data = 65;
		for(int i=0;i<bt.length;i++) {
			bt[i] = data++;
		}
		try(FileOutputStream fos = new FileOutputStream("output2.txt")){
			fos.write(bt);
		} catch(IOException ioe) {
			System.out.println(ioe);
		}
		System.out.println("end");
	}

}
