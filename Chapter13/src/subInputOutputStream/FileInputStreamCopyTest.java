package subInputOutputStream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamCopyTest {

	public static void main(String[] args) {
		// 파일을 복사하는 방법은 FileInputStream으로 read하고, FileOutputStream으로 write하는 것이다.
		long millisecond = 0; // System.currentTimeMillis 메서드를 이용하여 1970년 1월 1일 이후부터
		//현재까지의 시간을 long 타입으로 return 받는다. (millisecond는 1/1000으로 한다.)
		long len = 0; // 바이트 수
		int i = 0;
		try(FileInputStream fis = new FileInputStream("KScreenPen.exe");
				FileOutputStream fos = new FileOutputStream("KCopy.exe");
				BufferedInputStream bis = new BufferedInputStream(fis);
				BufferedOutputStream bos = new BufferedOutputStream(fos)){
			
			millisecond = System.currentTimeMillis();
			while((i = bis.read()) != -1) {
				bos.write(i);
				len++;
			}
			millisecond = (System.currentTimeMillis() - millisecond) / 1000;
			
		}catch(IOException ioe) {
			System.out.println(ioe);
		}
		System.out.println("byte 크기 : "+len);
		System.out.println("복사 실행 시간 : "+millisecond+"초");
	}

}
