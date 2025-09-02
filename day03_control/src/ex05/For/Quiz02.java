//3번문제 
package ex05.For;

import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		//구구단 전체출력
		for(int i = 1; i<=5; i++) {
			for(int j = 1; j<=5-i; j++) {
				System.out.print("");
			}
			for(int j = 1; j<=2*i-1; j++) {
			System.out.print("*");
		}
			System.out.println();
	}
		System.out.println();
}
}
////2번문제 
//package ex05.For;
//
//import java.util.Scanner;
//
//public class Quiz02 {
//	public static void main(String[] args) {
//		//구구단 전체출력
//		for(int i = 5; i>=1; i--) {
//			
//			for(int j = 1; j<i+1; j++) {
//				System.out.print("*");
//			}
//			System.out.println("");
//		}
//	}
//}

////1번문제 
//package ex05.For;
//
//import java.util.Scanner;
//
//public class Quiz02 {
//	public static void main(String[] args) {
//		//구구단 전체출력
//		for(int i = 1; i<=5; i++) {
//			
//			for(int j = 1; j<i+1; j++) {
//				System.out.print("*");
//			}
//			System.out.println("");
//		}
//	}
//}

//package ex05.For;
//
//import java.util.Scanner;
//
//public class Quiz02 {
//	public static void main(String[] args) {
//		//구구단 전체출력
//		for(int i = 1; i<=9; i++) {
//			for(int j = 1; j<=9; j++) {
//				System.out.println(i + "x" + j + "=" + i*j);
//			}
//		}
//	}
//}

//package ex05.For;
//
//import java.util.Scanner;
//
//public class Quiz02 {
//	public static void main(String[] args) {
//		System.out.println("원하는 단을 입력해주세요 : ");
//		int dan = new Scanner(System.in).nextInt();
//		
//		for(int i = 1; i<=9; i++) {
//			System.out.println(dan + "x" + i + "=" + dan*i);
//			}
//		}
//	}
