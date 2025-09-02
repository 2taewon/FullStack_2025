package ex06.inheritance;

import java.util.Scanner;

public class Circle extends Shape {
	public Circle() {
		super(2,3);
		Scanner sc = new Scanner(System.in);
		System.out.println("반지름 값은 = ");
		this.w = sc.nextInt(); // 상속으로 인해 w 쓰는게 가능해짐.
		
	}

	@Override
	public double calc() {
		this.result = (w * w *Math.PI);
		return result;
	}

	@Override
	public void show() {
		System.out.println("반지름 = " + w + " 원의 넓이 = "+calc());
		super.show();
	}
	
}
