package ex05.inheritance;

public class Rectangle extends Point {
	private int a, b;
	
	public Rectangle() {
		this.a = x;
	}
	public Rectangle(int x) {
		this.x = x;
	}
	public Rectangle(int x, int y) {
		x = 10; y = 15;
		
	}
	public void disp() {
		super.disp(); // point
		System.out.println("사각형 : " + x+","+ y + ",");
	}
}
