package byteInputOutputStream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest02 {

	public static void main(String[] args) {
		// AutoCloseable 인터페이스로 자바 8이상 부터는 try() 괄호 안에 인스턴스를 진행하면 close를 작성하지 않아도 된다.
		try(FileInputStream fis = new FileInputStream("input2.txt")) {
			
			// 바이트를 배열로 묶어서 출력
			byte[] bt = new byte[10];
			int i = 0; // input2.txt의 데이터를 읽어들인 개수를 반환
			while((i = fis.read(bt)) != -1) {
				// 버퍼를 통째로 출력 - 맨 마지막에 남는 자료들까지 출력된다.
//				for(byte b : bt) {
//					System.out.print((char)b);
//				}
				// 읽어들인 개수만큼만 출력
				for(int j=0;j<i;j++) {
					System.out.print((char)bt[j]);
				} System.out.println(" "+i+"byte 읽음");
			}
			
		} catch(IOException ioe) {
			System.out.println(ioe);
		}
	
	
	}

}
