package ex05.inheritance;

public class Circle extends Point {
	private int r;
	
	public Circle() {
		super(22);
		this.r = r;
	}
	public Circle(int r) {
		super(5,7); //반드시 첫줄에 위치 
		this.r = r;
		System.out.println("Circle 매개변수 1개 constructor");
	}
	public Circle(int x, int y) {
		x = y = 999;
		System.out.println("Circle 매개변수 2개 constructor");
	}
	//output method 
	public void disp() {
		System.out.println(r);
	}
}
