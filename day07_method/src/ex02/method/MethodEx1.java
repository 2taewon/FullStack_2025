package ex02.method;

import java.util.Scanner;

// 3) 매개변수 없고, 리턴타입 있는 경우
//	public returnType methodName() { return value; } 
//  value 타입과 returnType 중 returnType이 우선 순위를 가진다.
public class MethodEx1 {

	// 3) 매개변수 없고, 리턴타입 있는 경우 
	
	public static int show() { // 
		return 999;
	}
	public static void name() {
		System.out.println("tw");
	}
	public static void main(String[] args) {
		System.out.println(show());
		
		int su = show(); // 이거도 가능
		System.out.println(su);
	}
	// max() 만들어서 큰 값을 리턴하는 함수 만들기 
	public static int max() {
		System.out.println("x, y = ");
		int x = new Scanner(System.in).nextInt();
		int y = new Scanner(System.in).nextInt();
		
		int max = (x > y)? x:y;
		return max;
	}
}
