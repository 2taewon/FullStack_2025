package ex02.method;

public class MethodEx2 {
	
	public static String name(int x, String irum) {
		System.out.println("x = " + x);
		return irum; 
	}
//	public static double value(int x, int y, double d) {
//		return x+y+d;
//	}
	
	public static String display(int x, String name) {
		for(int i = 0; i <= x; i ++) {
			System.out.print(name + "\t");
		}
		System.out.println();
		return name;
	}
	public static double value(double x, double y, double d) {
		return x+y+d;
	}
	
	public static void main(String[] args) {
		System.out.print(display(30, "&"));
		System.out.print(display(20, "&"));

		String trangle = display(15, "◆");
		System.out.print(trangle);
//		System.out.println(value(1,2, 12.34));
		
		String str = name(10, "tw");
		System.out.println(str);
		
//		System.out.println(name(23));
//		int num = name(33);
//		System.out.println(num);
	}
}
