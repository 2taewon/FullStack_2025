package ex10.file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileReaderEx {
	public static void main(String[] args) throws IOException {
		
		int i = 0;
		String file;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("읽어 올 파일 이름 입력 요망(파일명.확장자) : ");
		file = br.readLine();
		
		System.out.println(file + "문서의 내용은...........");
		FileReader fr = new FileReader(file);
		BufferedReader reader = new BufferedReader(fr);
		
		while((i = reader.read()) != -1 ) { // 더 이상 읽어올 요소가 없으면 -1을 반환
			System.out.println((char)i + ' ');
			if(fr.equals("\n"))System.out.println();
		}
		fr.close();
	}
}
