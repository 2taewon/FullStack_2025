package ex02.network;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class GetAllByNameEx2 {
	public static void main(String[] args) throws UnknownHostException { //예외위임
		InetAddress address = InetAddress.getLocalHost(); //예외발생
		System.out.println("로컬 호스트 이름 : " + address.getHostName());
		System.out.println("로컬 호스트 IP주소 : " + address.getHostAddress());
		
		address = InetAddress.getByName("www.sw.or.kr");
		System.out.println("로컬 호스트 이름 : " + address.getHostName());
		System.out.println("로컬 호스트 IP주소 : " + address.getHostAddress());
		
		byte[] addr = new byte[4]; // 192.168.230.19
		addr[0] = (byte)192;
		addr[1] = (byte)168;
		addr[2] = (byte)230;
		addr[3] = (byte)19;
		
		address = InetAddress.getByAddress(addr); // 주소 값을 던져줌.
		System.out.println("로컬 호스트 이름 : " + address.getHostName());
		System.out.println("로컬 호스트 이름 : " + address.getCanonicalHostName());
		System.out.println("로컬 호스트 IP주소 : " + address.getHostAddress());	
		
//		InetAddress[] arr = InetAddress.getAllByName("www.naver.com");
		InetAddress[] arr = InetAddress.getAllByName("www.google.com");
		for(InetAddress item : arr) {
			System.out.println("로컬 호스트 이름 : " + item.getHostName());
			System.out.println("로컬 호스트 IP주소 : " + item.getHostAddress());		
		}

	}
}