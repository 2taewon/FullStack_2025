package ex03.Abstract;

public class Rect extends Shape {
	int y = 10;
	@Override
	public double calc(double x) {
		result = y * x;
		return result;
	}

	@Override
	public void show(String name) {
		calc(5.5);
		System.out.println(result + "크기의" + name + " 이 그러졌습니다. ");
	}

}
