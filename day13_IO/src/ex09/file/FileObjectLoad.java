package ex09.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class FileObjectLoad {
	public static void main(String[] args) {
		String name = null;
		String id = null;
		String pwd = null;
		boolean gender = false;
		int age = 0;
		String phone = null;
		String temp = null;
		
		File f = new File("members.txt");
		FileInputStream fis = null;
		ObjectInputStream bis = null;
		
		try {
			fis = new FileInputStream(f);
			bis = new ObjectInputStream(fis);
			
			name = (String)bis.readObject();
			id = (String)bis.readObject();
			pwd = (String)bis.readObject();
			gender = (Boolean)bis.readObject();
			age = (Integer)bis.readObject();
			phone = (String)bis.readObject();
			
			System.out.println("\t\t\t >> 회원 정보 << \n");
			System.out.println("이름 \t 아이디 \t\t 비밀번호 \t 성별 \t 나이 \t 전화번호 ");
			System.out.println();
			System.out.print(name + "\t" + id + "\t" + pwd +"\t");
			if(gender == true) System.out.print("남자");
			else System.out.print("여자");
			System.out.println("\t" + age + "\t" + phone);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
