package ex02.IF;

import java.util.Scanner;

public class Quiz_사칙연산 {
	public static void main(String[] args) {
		System.out.println("x, y, op");
		String strop = new Scanner(System.in).nextLine();
		char op = strop.charAt(0);
		int x, y, add, sub, mul, div;
		
		try {
		x = new Scanner(System.in).nextInt();
		y = new Scanner(System.in).nextInt();
		add = x + y;
		sub = x - y;
		mul = x * y;
		div = x / y;
		
		if(op == '+') {
			System.out.println(x + strop + y +"=" + add);
		}
		else if(op == '-') {
			System.out.println(x + strop + y +"=" + sub);
		}
		else if(op == '*') {
			System.out.println(x + strop + y +"=" + mul);
		}
		else if(op == '/') {
			System.out.println(x + strop + y +"=" + div);
		}
	}catch(Exception e) {
		System.out.println("0으로 나눌 수 없습니다.");
		}
	}
	
}
