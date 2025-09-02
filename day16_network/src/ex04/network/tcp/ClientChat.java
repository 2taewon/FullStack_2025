package ex04.network.tcp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.net.Socket;

public class ClientChat {
	public static void main(String[] args) throws IOException {
		int port = 8000;
		String ip,str;
		
		PrintStream ps = new PrintStream(System.out);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	ps.print("접속할 서버 ip ==> "); ip = br.readLine();
	ps.print("전송할 메세지 ==>"); str = br.readLine();
	
	byte[] buffer = str.getBytes("utf-8"); // ->bytes object타입
	String message = new String(buffer, "utf-8");
	
	Socket client = new Socket(ip, port);
	
	OutputStream os = client.getOutputStream();
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os));
	bw.write(message,0,message.length());
	bw.flush();
	
	bw.close();
	client.close();
	ps.println(ip + "에 메세지 전송 성공 !");
	ps.close();
	}
}
