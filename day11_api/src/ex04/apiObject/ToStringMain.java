package ex04.apiObject;

class Rectangle {
	int x,y;
	public void disp() {
		System.out.println(x + "," + y);
	}
	public String toString() {
		return x + ", 777" + y;
	}
}

public class ToStringMain{
	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		r.disp();
	}
}
