package byteInputOutputStream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest02 {

	public static void main(String[] args) {
		// output2.txt에 A부터 Z까지를 출력시켜라.
		// byte 배열을 이용하여 작성
		// 파일이 보이지 않을 때에는 F5 키를 입력해서 refresh한다.
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
