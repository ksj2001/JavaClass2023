package file;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;

public class FileTest {

	public static void main(String[] args) throws IOException{
		// File Ŭ������ �̿��Ͽ� ������ Ž���� �����
		// File Ŭ������ �����Ѵٰ� �ٷ� ��������� �ʴ´�.
		// File Ŭ������ �а� ���� ���(�����)�� �������� �ʴ´�.
		File dir = new File("D:/temp/image");
		File file1 = new File("D:/temp/file1.txt");
		File file2 = new File("D:/temp/file2.txt");
		File file3 = new File("D:/temp/file3.txt");
		
		if(dir.exists() == false) {dir.mkdirs();} // mkdirs�� ��� ������ �������ش�. (mkdir�� ���� �ϳ��� ����)
		if(file1.exists() == false) {file1.createNewFile();} // ������ ����
		if(file2.exists() == false) {file2.createNewFile();}
		if(file3.exists() == false) {file3.createNewFile();}
		
		// ���ϰ� ������ �迭�� �ֱ�
		File file = new File("D:/temp");
		File[] fileArray = file.listFiles(); // listFiles�� temp ������ �ִ� ��� ���ϵ��� ����־��ش�.
		
		System.out.println("�ð�\t\t\t����\t\tũ��\t�̸�");
		System.out.println("---------------------------------------------------------");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm");
		for(File f : fileArray) {
			System.out.print(sdf.format(new Date(f.lastModified())));
			if(f.isDirectory()) { // isDirectory�� ������ �����ϸ� true, �ƴϸ� false�� ��ȯ
				System.out.print("\t<DIR>\t\t\t"+f.getName());
			}
			else {
				System.out.print("\t\t\t"+f.length()+"\t"+f.getName());
			}
			System.out.println();
		}
	}

}
