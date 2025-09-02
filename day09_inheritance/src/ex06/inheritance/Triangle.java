package ex06.inheritance;

import java.util.Scanner;

public class Triangle extends Shape {
	public Triangle() {
		super(3,4);
		Scanner sc = new Scanner(System.in);
		System.out.println("밑변 = ");
		this.w = sc.nextInt();
		System.out.println("높이 = ");
		this.h = sc.nextInt();
	}

	@Override
	public double calc() {
		this.result = (w * h / 2);
		return result;
	}

	@Override
	public void show() {
		System.out.println("밑변 = " + w + "\n삼각형 높이 = " + h + " \n삼각형 넓이 = "+ calc());
	}
	
}
