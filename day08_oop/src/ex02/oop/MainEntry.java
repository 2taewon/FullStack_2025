package ex02.oop;

class Point { //extends Object { // object class 상속 받고 있었음.
	
	int x, y; //멤버변수 - 접근지정자 : private < default < protected < public 
	
	//멤버 함수 
	public int getX() {
		return x; 
	}
	public void setX(int xx) {
		x = xx;
	}
	public int getY() {
		return y; 
	}
	public void setY(int yy) {
		y = yy; 
	}
	public void setData(int xx, int yy) {
		x = xx;
		y = yy;
		
	}
	public void display() {
		System.out.println(getX() + "," + getY());
	}
}

public class MainEntry {
	public static void main(String[] args) {
		Point pt = new Point();
		
		pt.x = 500;
		pt.y = 1000;
		pt.setX(100);
		pt.setY(200);
		pt.display();
//		System.out.println(pt.getX());
//		System.out.println(pt);
	}
}
