package ex03.IO;

import java.io.IOException;
import java.io.InputStream;

public class MainEntry {

	public static void main(String[] args) throws IOException{ //예외처리 위임 -JVM
		InputStream is = System.in; //표준입력
		
		try {
			System.out.println("단일 문자 입력 : ");
			int su = is.read()-48; //예외발생
//			System.out.println((char)su);
			System.out.println(su); // int로 되어있어서 문자를 입력받으면 아스키 코드가 출력됨. 
			is.read();// 자바는 char형이 다른 언어와 달리 2 바이트이기때문에
			is.read();// 한 번으로는 화이트 스페이스를 잡을 수 없다.
			int su2 = is.read()-48;
			
			System.out.println(su + su2); 
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
