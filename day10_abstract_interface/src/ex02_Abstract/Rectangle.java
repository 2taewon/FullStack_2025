package ex02_Abstract;

public class Rectangle extends Shape {

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
