//package quiz;
//
//import java.util.Scanner;
//
//public class ScoreScanner {
//	static String name;
//	static int kor, eng, com, tot;
//	
//	public static void input() {
//	Scanner sc = new Scanner(System.in);
//	while(true) {
//		do {
//		System.out.print("kor:");
//		kor = sc.nextInt();
//		}while(kor<0||kor>100);
//		do {
//		System.out.print("eng:");
//		eng = sc.nextInt();
//		}while(eng<0||eng>100);
//		do {
//		System.out.print("com:");
//		com = sc.nextInt();
//		}while(com<0||com>100);
//		
//	}
//}
//	public static int input() {
//		
//		return kor;
//	}
//	
//	public static void output() {
//
//	}
//	public static char grade() {
//		char grade =' ';
//		double avg = 0;
//		avg = tot/3.;
//		switch ((int)avg / 10) {
//		case 10 :
//		case 9 :grade = 'A';break;
//		case 8 :grade = 'B';break;
//		case 7 :grade = 'C';break;
//		case 6 :grade = 'D';break;
//		default : grade ='F';
//	}
//		return grade;
//}	
//	public static double total_avg(int kor, int eng, int com) {
//		return kor + eng + com;
//	}
//	
//	
//	public static void main(String[] args) {
//		
//		
//		System.out.print(System.out.print("kor :" + kor +"\t eng :" + eng + " com :" +com + "\ntot :" + total_avg()));
//		}
//	}
//
//
