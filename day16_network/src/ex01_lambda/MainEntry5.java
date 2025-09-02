package ex01_lambda;


@FunctionalInterface
interface Message {
	void something(int x,int y); // parameter o
}

interface Talk {
	void something (String x, String y);
}

class Person {
	public void greeting(Message msg) {
		msg.something(3,6);

	}
	public void greeting(Talk msg) {
		msg.something("Hello","소녀");
	}
}

public class MainEntry5 {
	public static void main(String[] args) {
		Person p = new Person();
		
		p.greeting(new Message() { // 일반적인 형태 
			@Override
			public void something(int x, int y) {
				System.out.println("return type, parameter o 안녕");
				System.out.println("x = " + x + ", y = " + y);
				
			}	
		});
//		public int sum ( int x, int y ) { return x + y; }
//		(x, y) -> { x + y;} // 여기서 return 생략 가능
		
		
		char ch = 'K';
		
		System.out.println("----------------------------------");
//		p.greeting((x, y) -> { //에러 발생, 타입에 대해서 애매해서 타입을 정확히 써줘야함
//		p.greeting(	(int x, int y) -> { //lambda 형태, 자료형 안써도 됨, 매개변수 2개 이상일 때는 괄호 필수
			p.greeting(	(String x, String y) -> { //lambda 형태, 자료형 안써도 됨, 매개변수 2개 이상일 때는 괄호 필수
			System.out.println("lambda 안녕");
			System.out.println("x = " + x + ", y = " + y);
//			ch = 'P'; // lambda 함수 안에서는 값 변경 할 수 없음. 
			System.out.println(ch);
			
			num = 500; // Static 변수값은 변경 가능. 
			System.out.println(num);
		});
	}
	static int num = 30; 
}
