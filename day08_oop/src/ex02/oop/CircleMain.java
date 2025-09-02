package ex02.oop;

class Circle {
	private double x,y,r;
	
	public Circle() { //생성자 함수 - 디폴트 생성
		x = y = 100;
	}
	public Circle(int x) { 
		this.x = x;
		y = 50;
		r = 7;
	}
	public Circle(int x, int y) { //생성자 함수 - 디폴트 생성
		this.x = x;
		y = 50;
		r = 7;
	}
	public double getX() {
		return x;
	}
	public void setX(int xx) {
		x = xx;
	}
	public double getY() {
		 return y;
	}
	public void setY(int yy) {
		y = yy;
	}
	public double getR() {
		 return r;
	}
	public void setR(int rr) {
		r = rr;
	}
	public double cal(double r) { 
		return Math.PI * (2 * r); 
	}
	public void display() {
		System.out.println("x 의 값은" + x +"\ny의 값은" + y + "\n원의 지름은 " + cal(r) );
	}
}


public class CircleMain {

	public static void main(String[] args) {
		Circle cir = new Circle();
		
		Circle c2 = new Circle(1,2);
		c2.display();
		cir.setX(2);
		cir.setY(3);
		cir.setR(5);
		cir.cal(3);
		cir.display();
	}

}
