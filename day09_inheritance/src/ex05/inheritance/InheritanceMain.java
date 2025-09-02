package ex05.inheritance;

public class InheritanceMain {
	public static void main(String[] args) {
		Circle c = new Circle();
		c.disp();
		
		Circle c2 = new Circle(55);
		c2.disp();
		
		Rectangle rect = new Rectangle();
		rect.disp();
	}
}
