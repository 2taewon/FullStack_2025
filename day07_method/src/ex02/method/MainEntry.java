package ex02.method;

// 1)매개변수 없고, 리턴타입 없는 경우
// public returnType methodName(){}
public class MainEntry {
	// 2) 매개변수 있고, 리턴타입 없는 경우
	public static void plus(int x,int y, String msg) {
		System.out.println("hap = " + x + y);
		int sum = x + y;
		System.out.println("sum = " +sum);
		System.out.println(msg);
		System.out.println(x + ","+ y +","+ msg);
	}
	public static void abs (int a) {
		if(a < 0) {
			a = -a;
		}
	}
	public static void main(String[] args) { // 시작점(진입점)
		plus(1, 2, "hello");
		line();
		abs(-2);
		System.out.println("start main"); 
		line();
		info();
		line();
		System.out.println("end main");
	}
	public static void info() {
		System.out.println("tw");
		System.out.println("010-1234-5678");
		System.out.println("seoul");
	}
	public static void line() {
		System.out.println("----------------");
	}
}
