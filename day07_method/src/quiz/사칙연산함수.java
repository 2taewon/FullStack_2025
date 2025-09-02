package quiz;

import java.util.Scanner;

public class 사칙연산함수 {

	static Scanner sc = new Scanner(System.in);
	static int choice;
	public static void main(String[] args) {
		// x, y 입력 받아서 add(),sub(), mul(), div() 만들기 1,2 return타입 x 3,4 return 타입 o
		// div() 예외처리
		int x,y;
		//do {
		 System.out.println("x : ");
		 x = sc.nextInt();
		 System.out.println("y : ");
		 y = sc.nextInt();
		//}while(choice > 5 || choice < 1);
		cal(x,y);
	}
	
	public static void add(double x, double y) {
		System.out.println("add : " + (x+y));
	}
	public static void sub(double x, double y) {
		System.out.println("sub : " + (x-y));
	}
	
	public static double mul(double x, double y) {
		return x * y;
	}
	public static String div(double x, double y) {
		String str = "0으로 나눌 수 없습니다.";
		return (y == 0 ) ? str : Double.toString(x / y);
	}
	public static void outputmul(double x, double y) {
		System.out.println("mul : " + mul(x,y));
	}
	public static void outputdiv(double x, double y) {
		System.out.println("div : " + div(x,y));
	}
	public static void cal(double x, double y) {
		System.out.println("원하시는 번호를 입력하세요. 1: add, 2: sub 3: mul, 4: div 5: exit");
		do {
			choice = sc.nextInt();
		}while(choice > 5 || choice < 1);
			
		switch(choice) {
		case 1 : add(x,y);break;
		case 2 : sub(x,y);break;
		case 3 : outputmul(x,y);break;
		case 4 : outputdiv(x,y);break;
		case 5 : System.out.println("시스템을 종료합니다."); System.exit(0);
		default : System.out.println("값을 다시 입력해주세요");
		}
		
	}
}
