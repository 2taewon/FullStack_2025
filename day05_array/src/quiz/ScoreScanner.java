package quiz;

import java.util.Arrays;
import java.util.Scanner;

public class ScoreScanner {

	public static void main(String[] args) {
		// kor, eng, com, name 입력 받아서 --> tot, avg 구하는 프로그램 작성
		Scanner sc = new Scanner(System.in);
		String name = "";
		double avg = 0;
		int kor =0, eng=0, com=0, tot =0;
		int cnt = 0;
		int num;
		System.out.println("몇명 입력 ? : ");
		num = sc.nextInt();
		// char grade =' ', yn =' ';
		String str[] = new String[num];
		int [][] subject = new int[num][4];
		double dou[] = new double[num];
		char ch[] = new char[num];
		int [] sukcha = new int[num];

		
		while(cnt < num) {
		System.out.println("이름을 입력하세요 : ");
		name = sc.next();
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
		subject[cnt][0] = kor;
		subject[cnt][1] = eng;
		subject[cnt][2] = com;
		subject[cnt][3] = tot;
			str[cnt] = name;
			dou[cnt] = avg;
		switch ((int)avg / 10) {
		case 10 :
		case 9 :ch[cnt] = 'A';break;
		case 8 :ch[cnt] = 'B';break;
		case 7 :ch[cnt] = 'C';break;
		case 6 :ch[cnt] = 'D';break;
		default : ch[cnt] = 'F';
			}
		cnt++;
		}
		for(int A = 0; A <num; A++) {
			for(int B = 0; B<num; B++) {
				while(A<=B) {
				if(subject[A][3] > subject[B][3]) {
					sukcha[B]++;
					break;
				}
				else if(subject[A][3] < subject[B][3]) {
					sukcha[A]++;
					break;
				}
				else if(subject[A][3] == subject[B][3]) {
					break;
				}
				} //end while
			}
		}
	
		for(int x = 0; x <num; x++) {
				System.out.println(str[x] + "님의 성적처리 *****");
				System.out.print("kor :" + subject[x][0] +"\t eng :" + subject[x][1] + " com :" +subject[x][2] + "\ntot :" + subject[x][3]);
				System.out.printf(" avg :%.2f grade :%c 석차 : %d등 \n",dou[x], ch[x], sukcha[x]+1);
				//System.out.println("sb["+x+"]["+y+"]"+"="+subject[x][y]+"\t");				
		}
		
	}

}
//		System.out.println(name + "님의 성적처리 *****");
//		System.out.print("kor :" + kor +"\t eng :" + eng + " com :" +com + "\ntot :" + tot);
//		System.out.printf(" avg :%.2f, %c \n",avg, grade );
//		System.out.println("계속 입력 하실건가요? (y/n) ");
//		yn = sc.next().charAt(0);
//		if(yn == 'n' || yn == 'N') {
//			System.out.println("이용해 주셔서 감사합니다.");
//			break;
//		}
