package ex01.oop;

public class Point {
	private int x,y;
	
	public Point() {
		this(100,100);
		x = 1;
	}
	public Point(int x) {
		this.x = 4;
	}
	public Point(int x, int y) {
		this.x = x; this.y = y;
	}
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void disp() {
		System.out.println(x +","+ y);
	}
}
