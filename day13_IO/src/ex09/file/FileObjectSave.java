package ex09.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;

public class FileObjectSave {
	public static void main(String[] args) throws IOException {
		String name = null;
		String id = null;
		String pwd = null;
		boolean gender = false;
		int age = 0;
		String phone = null;
		String temp = null;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ObjectOutputStream oos = null;
		File f = new File("members.txt");
		
		try {
			FileOutputStream fos = new FileOutputStream(f,true); // append mode, 그냥 f는 덮어쓰기 (f,true) 는 데이터가 계속 쌓임.
			oos = new ObjectOutputStream(fos);
			
			System.out.println("-------------회원 정보 입력 하기--------------");
			System.out.println("name >> "); name = br.readLine();
			System.out.println("ID >> "); id = br.readLine();
			System.out.println("PassWord >> "); pwd = br.readLine();
			System.out.println("gender(m,f) >> "); temp = br.readLine();
			if(temp.toLowerCase().equals("m")) gender = true;
			else gender = false;
			System.out.println("age >> "); age = Integer.parseInt(br.readLine());
			System.out.println("phone number >> "); phone = br.readLine();
			
			oos.writeObject(name);
			oos.writeObject(id);
			oos.writeObject(pwd);
			oos.writeObject(gender);
			oos.writeObject(age);
			oos.writeObject(phone);
			
			System.out.println("members.txt save");
		
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			oos.close();
		}
	}
}
