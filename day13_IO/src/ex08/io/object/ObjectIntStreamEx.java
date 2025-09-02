package ex08.io.object;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;

public class ObjectIntStreamEx {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		InputStream is = new FileInputStream("gold,");
		ObjectInputStream ois= new ObjectInputStream(is);
		
		Grade dto = (Grade)ois.readObject();
		System.out.println("result output = " + dto);
		ois.close();
	}
}
