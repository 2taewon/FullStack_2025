package ex05.overload;

public class MainEntry {

	public static void plus(int x, int y) {
		System.out.println(x+y);
	}
	public static void plus(int x, int y, int z) {
		System.out.println(x+y);
	}
	public static void main(String[] args) {
		plus(1,2);
	}

}
