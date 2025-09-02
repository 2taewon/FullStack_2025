package ex06.string;

public class MainEntry {
	public static void main(String[] args) {
		int x = 99;
		String str = "abc";
		System.out.println("str : " + str);
		
		char data[] = {'a', 'b', 'c'};
		str = new String(data);
		System.out.println("str : " + str);
		
		String msg = "cedfghij";
		System.out.println("Korea" + msg);
		System.out.println(msg);
		
		msg = msg.concat("korea"); // 문자열 결합 
		System.out.println(msg);
		
		String str2 = "abcdef".substring(1); // 지정한 값부터 뒤까지 전부 출력
		System.out.println(str2);
		
		str2 = "abcdefghi1245dsag".substring(2, 5); // 2는 포함, 5는 미포함.
		System.out.println(str2);
	}
}
