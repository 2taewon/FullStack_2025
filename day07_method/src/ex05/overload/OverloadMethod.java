package ex05.overload;

public class OverloadMethod {
	
	public static void line() {
		System.out.println("-----------------------");
	}
	
	public static void line(String str) {
		System.out.println(str);
	}
	public static void line(int x, int y, String str) {
		if(x > y) {
			int temp = x;
			x = y; 
			y = temp;
		}
		for(int i = x; i <= y;i++) {
			System.out.print(str);
		}
	}
	public static void main(String[] args) {
		line(3, 5, "k");
		line();
		line(5, 3, "KOSA2");
		line("*");
		line(10, "$");
	}
	public static void line(int n, String string) {
		for(int i = 1; i <n; i++) {
			System.out.print(string);
		}
	}
	public static void plus(int x) {
		System.out.println(x + 100);
	}
	public static void plus(double x, double y) {
		System.out.println(x + y);
	}
	public static void plus(String x) {
		System.out.println(x + 100);
	}
}
