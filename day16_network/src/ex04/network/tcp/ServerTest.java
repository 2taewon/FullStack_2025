package ex04.network.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerTest { //socket 2개 필요 
	public static void main(String[] args) {
		ServerSocket ss = null; 
		Socket s = null;
		System.out.println("---서버 시작---");
		while(true) {
		try {
			ss = new ServerSocket(9000); // 0 ~ 1024 포트 넘버는 예약 되어 있음.
			s = ss.accept(); // client socket, 응답대기 
			// I       /       O
			InputStream is = s.getInputStream(); // read
			OutputStream os = s.getOutputStream(); // write
			
			byte[] arr = new byte[100];
			is.read(arr);
			System.out.println(new String(arr));
			
			System.out.println("보낼 문자열 입력 : ");
			String message = new Scanner(System.in).nextLine();
			os.write(message.getBytes());
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				s.close(); ss.close();
			} catch (IOException e) {
				e.printStackTrace();
				}
			}
		}
	}
	
}
