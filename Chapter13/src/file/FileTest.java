package file;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;

public class FileTest {

	public static void main(String[] args) throws IOException{
		// File 클래스를 이용하여 윈도우 탐색기 만들기
		// File 클래스는 생성한다고 바로 만들어지지 않는다.
		// File 클래스는 읽고 쓰는 기능(입출력)이 존재하지 않는다.
		File dir = new File("D:/temp/image");
		File file1 = new File("D:/temp/file1.txt");
		File file2 = new File("D:/temp/file2.txt");
		File file3 = new File("D:/temp/file3.txt");
		
		if(dir.exists() == false) {dir.mkdirs();} // mkdirs는 모든 폴더를 생성해준다. (mkdir는 폴더 하나만 생성)
		if(file1.exists() == false) {file1.createNewFile();} // 파일을 생성
		if(file2.exists() == false) {file2.createNewFile();}
		if(file3.exists() == false) {file3.createNewFile();}
		
		// 파일과 폴더를 배열에 넣기
		File file = new File("D:/temp");
		File[] fileArray = file.listFiles(); // listFiles가 temp 폴더에 있는 모든 파일들을 집어넣어준다.
		
		System.out.println("시간\t\t\t형태\t\t크기\t이름");
		System.out.println("---------------------------------------------------------");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm");
		for(File f : fileArray) {
			System.out.print(sdf.format(new Date(f.lastModified())));
			if(f.isDirectory()) { // isDirectory는 폴더가 존재하면 true, 아니면 false를 반환
				System.out.print("\t<DIR>\t\t\t"+f.getName());
			}
			else {
				System.out.print("\t\t\t"+f.length()+"\t"+f.getName());
			}
			System.out.println();
		}
	}

}
