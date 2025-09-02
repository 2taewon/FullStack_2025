package ex03.Abstract;

public class Triangle extends Shape{
	int y = 100;
	@Override
	public double calc(double x) {
		result = y * x /2;
		return result;
	}

	@Override
	public void show(String name) {
		calc(5.5);
		System.out.println(result + "크기의" + name + " 이 그러졌습니다. ");
	}
}
