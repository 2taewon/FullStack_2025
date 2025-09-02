/*package ex01_lambda;

interface Message {
	void something(); // void, parameter x 
}

class Person {
	public void greeting(Message msg) {
		msg.something();
	}
}

public class MainEntry {
	public static void main(String[] args) {
		Person p = new Person();
		
		p.greeting(new Message() {
			@Override
			public void something() {
				System.out.println("안녕하세요.");
				System.out.println("한주 동안 수고 많으셨어요.");
			}	
		});
//		public int sum ( int x, int y ) { return x + y; }
//		(x, y) -> { x + y;} // 여기서 return 생략 가능ㅡ
		System.out.println("----------------------------------");
		p.greeting(() -> {
			System.out.println("lambda 안녕");
			System.out.println("lambda ㅎ");
		});
	}
}*/
