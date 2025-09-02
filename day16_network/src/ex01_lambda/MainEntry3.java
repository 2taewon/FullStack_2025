//package ex01_lambda;
//
//interface Message {
//	int something(int x); // int return type, parameter o
//}
//
//class Person {
//	public void greeting(Message msg) {
//		int su = msg.something(30);
//		System.out.println("Message interface something " + su );
//	}
//}
//
//public class MainEntry3 {
//	public static void main(String[] args) {
//		Person p = new Person();
//		
//		p.greeting(new Message() { // 일반적인 형태 
//			@Override
//			public int something(int x) {
//				System.out.println("return type, parameter o 안녕");
//				System.out.println("수고많았습니다");
//				return 100;
//				
//			}	
//		});
////		public int sum ( int x, int y ) { return x + y; }
////		(x, y) -> { x + y;} // 여기서 return 생략 가능ㅡ
//		System.out.println("----------------------------------");
////		p.greeting((x) -> { //lambda 형태
//		p.greeting(x -> { //lambda 형태, 자료형 안써도 됨, 괄호 안써도 됨
//			System.out.println("lambda 안녕");
//			System.out.println("lambda ㅎ");
//			return 20;
//		});
//	}
//}
