package ex04.network.tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerChat {
	public static void main(String[] args) throws IOException {
		int port = 8000;
		ServerSocket server = new ServerSocket(port);
		Socket client = null;
		System.out.println("==서버 시작==");
		
		while(true) {
			client = server.accept(); //
			InputStream is = client.getInputStream(); // 네트워크 통해서 읽기 
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			PrintStream ps = new PrintStream(System.out);
			
			ps.print(client.getInetAddress().getHostAddress());
			String str = br.readLine();
			byte[] buffer = str.getBytes("utf-8"); // or "euc-kr"
			String message = new String(buffer, "utf-8");
			
			ps.println("       :   에서 수신 메세지 ===> " + message);
			br.close();
			client.close();
		
		} // end while 
	}
}
