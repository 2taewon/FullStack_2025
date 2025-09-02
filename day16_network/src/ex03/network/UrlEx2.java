package ex03.network;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;





public class UrlEx2 {
	public static void main(String[] args) throws MalformedURLException, IOException {
		
		URL url = new URL("https://www.google.com/search?q=kim+yuna&oq=kim&gs_lcrp=EgZjaHJvbWUqDAgAECMYJxiABBiKBTIMCAAQIxgnGIAEGIoFMgwIARAuGEMYgAQYigUyBggCEEUYOTINCAMQABiDARixAxiABDIQCAQQLhivARjHARixAxiABDIHCAUQABiABDIHCAYQABiABDIKCAcQABixAxiABDIHCAgQABiABDIPCAkQLhgUGIcCGLEDGIAE0gEJODE3OGowajE1qAIIsAIB8QVC92Rx4Xma3g&sourceid=chrome&ie=UTF-8");
		
//		https://www.google.com/
//			https://www.google.com/search?sca_esv=563a49081b992b59&sxsrf=AHTn8zq1UmpNjZB1eQ9pVNnBnD7j71jF1w:1744340630500&
//				q=kim+yuna
//				&source=lnms&fbs=ABzOT_CZsxZeNKUEEOfuRMhc2yCI6hbTw9MNVwGCzBkHjFwaK53DgNHTMxn53_XGiUHS2MuRVDP60KUbqm2OQomhT296nGa4fQJJhSaMTG9Ts4-x4qAoAwc4-XPsQOGPU0vVhuvVJVPzFxw7Ka5K6adnndN6ZhbZ8IAWYbyALULjh8W-OlHEJk48HvqNw3CqUUcXvBEM3jfxdM9Furw0hNgcJu837IpVqg&sa=X&ved=2ahUKEwinw5ed_86MAxWWiK8BHV8-ETEQ0pQJegQIDhAB&biw=1707&bih=940&dpr=1.5
	
				//Url 이 가지고 있는 함수들 사용
		System.out.println("프로토콜 : " + url.getProtocol());
		System.out.println("호스트와 포트 : " + url.getAuthority());
		System.out.println("호스트 : " + url.getHost());
		System.out.println("포트 : " + url.getPort());
		System.out.println("경로 : " + url.getPath());
		System.out.println("질의 : " + url.getQuery());
		System.out.println("파일명 : " + url.getFile());
		System.out.println("참조 : " + url.getRef());
	}
}
