package ex06.network.chat;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class TcpMultiChatClient {
	
	
	public static void main(String[] args) {
		if(args.length != 1) {
			System.out.println("USAGE : java TcpMultiChatClient nickName?");
			System.exit(0);
		}
		try {
			String ip = "192.168.230.19"; // " 127.0.0.1" or localhost	
			Socket s = new Socket(ip,7777);
			System.out.println("서버에 연결 되었습니다.");
			
			Thread sender = new Thread(new ClientSender(s, args[0]));
			Thread receiver = new Thread(new ClientReceiver(s));
			
			sender.start();  receiver.start(); //run() 메서드 유도
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	static class ClientSender extends Thread{
		Socket s; 
		DataOutputStream dos;
		String name;
		public ClientSender(Socket s, String name) {
			this.s = s;
			try {
				dos = new DataOutputStream(s.getOutputStream());
				this.name = name;
		}catch(Exception e) { 
			e.printStackTrace();
			}
		}
		@Override
		public void run() {
			Scanner sc = new Scanner(System.in);
			try {
				if(dos!=null) dos.writeUTF(name);
				while(dos != null) {
					dos.writeUTF("[" + name + "]" + sc.nextLine());
				}
			}catch(Exception e) {
				 e.printStackTrace();
			}
		}
		
		
	}//end clients inner class


static class ClientReceiver extends Thread{
	Socket s;
	DataInputStream dis;
	public ClientReceiver(Socket s) {
		this.s = s;
		try {
			dis = new DataInputStream(s.getInputStream());
		}catch(Exception e) { e.printStackTrace();}
	}
	@Override
	public void run() {
		while(dis != null) {
			try {
				System.out.println(dis.readUTF());
			}catch(Exception e) { e.printStackTrace(); }
		}
	}
	
	
	}//end clients inner class
}//outer class end
