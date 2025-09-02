package ex01_Abstract;


abstract class Shape { //abstract class, Super class
	double result = 0;
	
	public abstract double calc(); //abstract method
	public abstract void draw();
	
	public void show() {
		System.out.println("Super class Shape call ~ ");
	}
} //Shape end 


class Circle extends Shape{

	double r = 5.0;
	@Override
	public double calc() { // Sub class
		result = r * r * Math.PI;
		return result;
	}

	@Override
	public void draw() {
	calc();
	System.out.println("원의 넓이 : " + result + " 인 원을 그렸습니다. ");
	}
	
} //Circle end 


// Rect class ---- > Shape 
class Rectangle extends Shape{
	int x = 2; int y = 3; 

	@Override
	public double calc() {
		result = x * y;
		return result;
	}

	@Override
	public void draw() {
		calc();
		System.out.println("사각형의 넓이 : "+ result);
		
	}
	
}

public class MainEntry {
	public static void main(String[] args) {
		Circle c = new Circle();
		c.draw();
		
		Rectangle r = new Rectangle();
		r.draw();
		
		Shape sh = new Circle();
		sh.draw();
		
		sh = new Rectangle();
		sh.draw();
	}
}
