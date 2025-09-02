package ex02.network;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class MainEntry {
	public static void main(String[] args) {
		String host = "127.0.0.1"; // "192.186.230.19"
		
		try {
			InetAddress[] address = InetAddress.getAllByName(host);
			for(InetAddress item : address)
				System.out.println(item.getCanonicalHostName()); // 그냥 뽑으면 /가 붙어서나옴.
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} 
	}
}
