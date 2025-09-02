//package ex01_lambda;
//
//interface Message {
//	int something(int x,int y); // int return type>=2, parameter o
//}
//
//class Person {
//	public void greeting(Message msg) {
//		int su = msg.something(3,6 );
//		System.out.println("Message interface something " + su );
//	}
//}
//
//public class MainEntry4 {
//	public static void main(String[] args) {
//		Person p = new Person();
//		
//		p.greeting(new Message() { // 일반적인 형태 
//			@Override
//			public int something(int x, int y) {
//				System.out.println("return type, parameter o 안녕");
//				System.out.println("x = " + x + ", y = " + y);
//				return x+y;
//				
//			}	
//		});
////		public int sum ( int x, int y ) { return x + y; }
////		(x, y) -> { x + y;} // 여기서 return 생략 가능ㅡ
//		System.out.println("----------------------------------");
////		p.greeting((x) -> { //lambda 형태
//		p.greeting(	(x, y) -> { //lambda 형태, 자료형 안써도 됨, 매개변수 2개 이상일 때는 괄호 필수
//			System.out.println("lambda 안녕");
//			System.out.println("x = " + x + ", y = " + y);
//			return x + y;
//		});
//	}
//}
