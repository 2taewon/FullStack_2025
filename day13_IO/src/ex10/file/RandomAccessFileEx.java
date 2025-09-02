package ex10.file;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileEx {
	public static void main(String[] args) throws FileNotFoundException , IOException{
		
		RandomAccessFile raf = new RandomAccessFile("saweon.txt", "rw"); //sawon.txt 파일이 없다면 생성하면서 기재하고, 있으면 기존 파일에 기재한다.
		
		for(int i = 0; i<=100; i++) {
			raf.seek(i * 100);
			String str = "hello " + i ;
			raf.writeUTF(str);
//			raf.writeUTF((String)i);
		}
		
		for(int i = 0; i<=100; i++) {
			raf.seek(99);
//			System.out.println(raf.readUTF());
		}
		System.out.println("String print success");
	}
}
