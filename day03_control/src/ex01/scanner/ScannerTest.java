package ex01.scanner;

import java.util.Scanner;

public class ScannerTest {
	public static void main(String[] args) {
		
		System.out.println("x, y, str, str2 = ");
		String str2 = new Scanner(System.in).nextLine();// 공백 인식 
		int x = new Scanner(System.in).nextInt();
//		int y = new Scanner(System.in).nextInt();
		
//		String str = new Scanner(System.in).next();// 공백 인식하지 못함. 
//		String str2 = new Scanner(System.in).nextLine();// 공백 인식 

//		System.out.println(x + "," + y +"," + str);
		System.out.println(x +"," + str2);

	}
}
