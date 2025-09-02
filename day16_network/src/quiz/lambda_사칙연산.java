package quiz;

import java.util.Scanner;
import java.util.function.BiFunction;

interface num {
	void number(int x, int y);
}

class Calc {
	Scanner sc = new Scanner(System.in);
	public void input(num n) {
		n.number(sc.nextInt(), sc.nextInt());
	}
}

public class lambda_사칙연산 {
	public static void main(String[] args) {
		Calc c = new Calc();
		
		/*
		int a = 3; int b = 5;
		//BiFunction Interface는 Java에서 함수형 프로그래밍을 구현하기 위해 java 1.8버전부터 나옴
		BiFunction<Integer, Integer, Integer>plus = (x,y) -> x + y;
		int resultPlus = plus.apply(a, b);
		System.out.println("덧셈 결과 : " + resultPlus);*/
		
		c.input(new num() {

			@Override
			public void number(int x, int y) {
				System.out.println(x + "+" + y + " = " + (x+y));
				System.out.println(x + "-" + y + " = " + (x-y));
			}
			
		});
	}
}
