package ex02_Abstract;

public abstract class Shape {
	protected double result = 0;
	
	public abstract double calc();
	public abstract void draw();
	
	public void show() {
		System.out.println("Super class Shape Call ~");
	}
}
