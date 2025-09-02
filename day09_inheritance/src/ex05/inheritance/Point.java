package ex05.inheritance;

public class Point { // Super Class
	int x, y;
	//constructor method
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public Point() {
		x = y = 10;
		System.out.println("Point class constructor");
	}
	public Point(int x) {
		this (x,9);
	}
	//getter / setter
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
	//output method
	public void disp() {
		System.out.println(x + "," + y );
	}
}
