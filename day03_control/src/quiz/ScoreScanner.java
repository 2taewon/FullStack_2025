package quiz;

import java.util.Scanner;

public class ScoreScanner {

	public static void main(String[] args) {
		// kor, eng, com, name 입력 받아서 --> tot, avg 구하는 프로그램 작성
		Scanner sc = new Scanner(System.in);
		String name = "tw";
		double avg = 0;
		int kor =0, eng=0, com=0, tot =0;
		char grade =' ', yn =' ';
		
		while(true) {
		do {
		System.out.print("kor:");
		kor = sc.nextInt();
		}while(kor<0||kor>100);
		do {
		System.out.print("eng:");
		eng = sc.nextInt();
		}while(eng<0||eng>100);
		do {
		System.out.print("com:");
		com = sc.nextInt();
		}while(com<0||com>100);
		tot = kor + eng + com;
		avg = tot / 3.;
		
		switch ((int)avg / 10) {
		case 10 :
		case 9 :System.out.println("A학점");break;
		case 8 :System.out.println("B학점");break;
		case 7 :System.out.println("C학점");break;
		case 6 :System.out.println("D학점");break;
		default : System.out.println("F학점");
		}
		System.out.println(name + "님의 성적처리 *****");
		System.out.print("kor :" + kor +"\t eng :" + eng + " com :" +com + "\ntot :" + tot);
		System.out.printf(" avg :%.2f, %c \n",avg, grade );
		System.out.println("계속 입력 하실건가요? (y/n) ");
		yn = sc.next().charAt(0);
		if(yn == 'n' || yn == 'N') {
			System.out.println("이용해 주셔서 감사합니다.");
			break;
		}
		}
	}

}
