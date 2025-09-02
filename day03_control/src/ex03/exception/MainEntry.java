package ex03.exception;

import java.util.Scanner;

public class MainEntry {

	public static void main(String[] args) {
		System.out.println("x, y =");
		int x,y,result;

		try {
			x = new Scanner(System.in).nextInt();
			y = new Scanner(System.in).nextInt();
			
			result = x/y; //에러 발생 할 수 있다.
			
			System.out.println(result);
		} catch (ArithmeticException e) {
//			System.out.println("0으로 나눌 수 없습니다."); //user message
//			System.out.println(e.getMessage());
//			e.printStackTrace();
//		}catch (InputMismatchException e) {
//			System.out.println("0으로 나눌 수 없습니다."); //user message
//			System.out.println(e.getMessage());
//			e.printStackTrace();
		}catch (Exception e) {
//			System.out.println("0으로 나눌 수 없습니다."); //user message
//			System.out.println(e.getMessage());
//			e.printStackTrace();
		}

	}
}

/*
package ex03.exception;

import java.util.Scanner;

public class MainEntry {

	public static void main(String[] args) {
		System.out.println("x, y =");
		int x,y,result;

		x = new Scanner(System.in).nextInt();
		y = new Scanner(System.in).nextInt();
		
		result = x/y; //에러 발생 할 수 있다.
		
		System.out.println(result);
		}

}
*/