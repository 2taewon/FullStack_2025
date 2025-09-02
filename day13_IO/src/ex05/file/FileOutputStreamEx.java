package ex05.file;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

public class FileOutputStreamEx {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		OutputStream os = null;
		
		try {
			os = new FileOutputStream("C:\\app\\yuna.txt"); // 상대 경로
			while(true) {
				System.out.println("문자열 입력 요망 : ");
				String str = sc.nextLine() +"\r\n";
				
				if(str.toUpperCase().equals("EXIT\r\n")) {//EXIT만 썻을 때는 절대로 안끝남. \r과 \n을 추가로 넣어줘야 인식됨. 
					System.out.println(str.length() + "byte만큼 썼습니다.");
					break;
				}
			os.write(str.getBytes()); //예외 발생, 읽어들인 문자 str 길이(getBytes() 만큼 써주세요.
			System.out.println(str); // 화면 출력
			}//end while 
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try { os.close(); } catch(IOException e) {e.printStackTrace();}
		}
	}
}
