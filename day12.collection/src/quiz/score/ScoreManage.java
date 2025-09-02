package quiz.score;

import java.util.ArrayList;
import java.util.Scanner;

public class ScoreManage extends Score {
	int select;
	Scanner sc = new Scanner(System.in);
	ArrayList list = new ArrayList<>();
	
	public ScoreManage() {
		input();
	}
	
	
	public void input() {
		
//		Score s =list.add(n);
		System.out.println("이름 : ");
		String name = sc.next();
		System.out.println("국어 : ");
		int kor = sc.nextInt();
		System.out.println("영어 : ");
		int eng = sc.nextInt();
		System.out.println("전산 : ");		
		int com = sc.nextInt();
	}
	
	public int total() {
		return kor+eng+com;
	}
	public double avg() {
		return total()/3.;
	}
	public char gr(double x) {
		switch((int)x/10) {
		case 10: 
		case 9 : grade = 'A';break;
		case 8 : grade = 'B';break;
		case 7 : grade = 'C';break;
		case 6 : grade = 'D';break;
		default : grade = 'F';
		}
		return grade;
	}
	public void set() {
		
	}
	public void del(int i) {
		list.remove(i);
	}
	public void disp() {
		System.out.println("이름 : " + name);
		System.out.println("국어 : "+ kor + "영어 : " + eng + "전산 : "+ com);
		System.out.printf("총점 : "+ total()+ "평균 : %.2d "+ "학점 : "+ gr(avg())+"학점" , avg());
	}
	
}
