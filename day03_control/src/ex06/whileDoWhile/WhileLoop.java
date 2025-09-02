package ex06.whileDoWhile;

import java.util.Scanner;

public class WhileLoop {
	public static void main(String[] args) {
		int su;
		char grade = ' ', yn =' ';
		Scanner sc = new Scanner(System.in);
		
		while(true) { //무한 루프
			do {
				System.out.println("당신의 su 점수 입력 요망:");
				su =sc.nextInt();
			}while(su<0||su>101);
			
			System.out.println("\n당신의 점수" + su + "\n");
			//탈출 구문
			
			System.out.println("계속 입력 하실래요?(y/n) ");
			yn = sc.next().charAt(0);
			if(yn == 'n' || yn == 'N') break;
		}// end while
		
	}
}
