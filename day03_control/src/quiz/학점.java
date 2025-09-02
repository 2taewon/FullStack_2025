package quiz;

import java.util.Scanner;

public class 학점 {

	public static void main(String[] args) {
		char grade = ' ';
		int jumsu;
		
		do {
		System.out.println("jumsu input =");
		jumsu = new Scanner(System.in).nextInt();
		}while(jumsu <0 || jumsu >100);
		
		if(jumsu<100 && jumsu>=90) {
			System.out.println("A 입니다.");
		}
		else if(jumsu<90 && jumsu>=80) {
			System.out.println("B 입니다.");
		}
		else if(jumsu<80 && jumsu>=70) {
			System.out.println("c 입니다.");
		}
		else if(jumsu<70 && jumsu>=60) {
			System.out.println("D 입니다.");
		}
		else{
			System.out.println("F 입니다.");
		}
		
//	System.out.println("당신의" + jumsu + "점 -->" + grade + "학점입니다.");
	}
}
//package quiz;
//
//import java.util.Scanner;
//
//public class 학점 {
//
//	public static void main(String[] args) {
//		System.out.println("jumsu input =");
//		int jumsu = new Scanner(System.in).nextInt();
//		char grade;
//		grade = switch (jumsu/10) { //개선된 switch, ex) grade ='A';
//		case 10,9 ->'A';
//		case 8 -> 'B';
//		case 7 ->'C'; 
//		case 6 ->'D';
//		default ->'F';
//		};
//	System.out.println("당신의" + jumsu + "점 -->" + grade + "학점입니다.");
//	}
//}

//switch (jumsu/10) {
//case 10 :
//case 9 :
//	System.out.println("A학점 입니다.");break;
//case 8 : 
//	System.out.println("B학점 입니다.");break;
//case 7 : 
//	System.out.println("C학점 입니다.");break;
//case 6 : 
//	System.out.println("D학점 입니다.");break;
//default : 
//	System.out.println("F학점 입니다.");
//}

/*package quiz;

import java.util.Scanner;

public class 학점 {

	public static void main(String[] args) {
		System.out.println("jumsu input =");
		int jumsu = new Scanner(System.in).nextInt();
		
		if(jumsu<100 && jumsu>=90) {
			System.out.println("A 입니다.");
		}
		else if(jumsu<90 && jumsu>=80) {
			System.out.println("B 입니다.");
		}
		else if(jumsu<80 && jumsu>=70) {
			System.out.println("c 입니다.");
		}
		else if(jumsu<70 && jumsu>=60) {
			System.out.println("D 입니다.");
		}
		else{
			System.out.println("F 입니다.");
		}
		

	}

}
// if - A, B, C, D, F학점
*/