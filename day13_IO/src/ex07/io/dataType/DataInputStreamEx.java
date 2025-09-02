package ex07.io.dataType;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DataInputStreamEx {
	public static void main(String[] args) throws FileNotFoundException, IOException{
		File file = new File("test.txt");
		FileInputStream fos = new FileInputStream(file); // 예외발생
		DataInputStream dis = new DataInputStream(fos);
		
		System.out.println(dis.readBoolean());
		System.out.println(dis.readChar());
		System.out.println(dis.readShort());
		System.out.println(dis.readInt());
		System.out.println(dis.readLong());
		System.out.println(dis.readFloat());
		System.out.println(dis.readDouble());
	}
}
