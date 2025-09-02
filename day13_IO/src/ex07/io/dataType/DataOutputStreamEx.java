package ex07.io.dataType;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStreamEx {
	
	public static void main(String[] args) throws IOException{
		File file = new File("test.txt");
		FileOutputStream fos = new FileOutputStream(file); // 예외발생
		DataOutputStream dos = new DataOutputStream(fos);
		
		dos.writeBoolean(true);
		dos.writeChar(65);
		dos.writeShort(100);
		dos.writeInt(5000);
		dos.writeLong(888888);
		dos.writeFloat(12.45f);
		dos.writeDouble(14.24);
		dos.flush(); // 버퍼지우기
		
		System.out.println("test.txt 파일에"+ dos.size() + "byte save");
	}
	
}
