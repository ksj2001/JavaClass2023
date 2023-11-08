package byteInputOutputStream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest03 {

	public static void main(String[] args) {
		byte[] bt = new byte[26];
		byte data = 65;
		for(int i=0;i<bt.length;i++) {
			bt[i] = data++;
		}
		try(FileOutputStream fos = new FileOutputStream("output3.txt")){
			fos.write(bt, 2, 10);
		} catch(IOException ioe) {
			System.out.println(ioe);
		} System.out.println("end");
	}

}
