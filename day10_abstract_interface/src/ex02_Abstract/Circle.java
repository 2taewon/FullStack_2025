package ex02_Abstract;

public class Circle extends Shape {

	double r = 7.0;
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

}
