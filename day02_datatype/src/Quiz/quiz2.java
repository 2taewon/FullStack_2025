package Quiz;

import java.util.Scanner;

public class quiz2 {
	public static void main(String[] args) {
		System.out.print("x 값 : ");
		int x = new Scanner(System.in).nextInt();
		System.out.print("부호 : ");
		String str = new Scanner(System.in).next();
		System.out.print("y 값 : ");
		int y = new Scanner(System.in).nextInt();
		char ch = str.charAt(0);
		int add,sub,mul,div;
		add = x + y;
		sub = x - y;
		mul = x * y;
		div = x / y;
		
		switch(ch) {
		case '+': System.out.println(x + "+" + y + "="+add); break;
		case '-': System.out.println(x + "-" + y + "="+sub); break;
		case '*': System.out.println(x + "*" + y + "="+mul); break;
		case '/': System.out.println(x + "/" + y + "="+div); break;
		}	
	}
}
