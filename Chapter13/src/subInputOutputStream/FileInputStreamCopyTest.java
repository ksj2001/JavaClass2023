package subInputOutputStream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamCopyTest {

	public static void main(String[] args) {
		// ������ �����ϴ� ����� FileInputStream���� read�ϰ�, FileOutputStream���� write�ϴ� ���̴�.
		long millisecond = 0; // System.currentTimeMillis �޼��带 �̿��Ͽ� 1970�� 1�� 1�� ���ĺ���
		//��������� �ð��� long Ÿ������ return �޴´�. (millisecond�� 1/1000���� �Ѵ�.)
		long len = 0; // ����Ʈ ��
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
		System.out.println("byte ũ�� : "+len);
		System.out.println("���� ���� �ð� : "+millisecond+"��");
	}

}
