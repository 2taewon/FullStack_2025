package ex06.fileCopy;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BinaryCopy {
	public static void main(String[] args) {
		File src = new File("C:\\Windows\\explorer.exe");// 여기 있는 파일 데이터를 
		File dist = new File("C:\\workspace\\explorer.copy"); // 여기로 복사
	
		FileInputStream fis = null;
		FileOutputStream fos = null;
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		int cnt; 
		
		try {
			fis = new FileInputStream(src); //파일 입력 바이트 스트림 연결
			fos = new FileOutputStream(dist); //파일 출력 바이트 스트림 연결
			bis = new BufferedInputStream(fis); //버퍼 입력 스트림 연결
			bos = new BufferedOutputStream(fos);
			
			while((cnt = bis.read()) != -1) { //더 이상 읽을 것이 없다면 -1 출력
				bos.write((char)cnt);
			}
			System.out.println("파일 복사 성공");
			bis.close();
			bos.close();
			fis.close();
			fos.close();
			
		} catch (Exception e) {
			System.out.println("파일 복사 오류");
		}
	}
}
