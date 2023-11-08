package subInputOutputStream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStreamTest {

	public static void main(String[] args) {
		try(FileOutputStream fos = new FileOutputStream("data.txt");
			DataOutputStream dos = new DataOutputStream(fos)){
			dos.write(1000);
			dos.writeInt(10);
			dos.writeChar('A');
			dos.writeUTF("Hello! Java");
		} catch(IOException ioe) {
			System.out.println(ioe);
		} System.out.println("end");
		
		
		try(FileInputStream fis = new FileInputStream("data.txt");
				DataInputStream dis = new DataInputStream(fis)){
				System.out.println(dis.read());
				System.out.println(dis.readInt());
				System.out.println(dis.readChar());
				System.out.println(dis.readUTF());
			} catch(IOException ioe) {
				System.out.println(ioe);
			} System.out.println("end");
	}

}
