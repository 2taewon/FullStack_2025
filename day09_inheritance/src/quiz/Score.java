package quiz;

import java.util.Scanner;

public class Score {
	private int kor,eng,com,cnt,n;
	private char grade;
	private String name;
	
	public Score() {
		kor = eng = com = 0;
		grade = ' ';
		Scanner sc = new Scanner(System.in);
		//System.out.println("몇명 :");
		//n = sc.nextInt();
		//while(cnt < n) {
		System.out.println("이름 : ");
		name = sc.next();
		System.out.println("국어 : ");
		kor = sc.nextInt();
		System.out.println("영어 : ");
		eng = sc.nextInt();
		System.out.println("전산 : ");
		com = sc.nextInt();
		//cnt++;
		//}
	}
	public int total() {
		return kor + eng + com;
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
	public void disp() {
		System.out.println(name +"님의 점수");
		System.out.println("국어 : " + kor +"\t 영어 : "+ eng +"\t 전산 : " + com);
		System.out.println("총점 : " + total() +"\t 평균 : "+ avg() +"\t 학점 : " + gr(avg()));
		System.out.println("----------------------------------------------------------------");
	}
	// get/set
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getCom() {
		return com;
	}
	public void setCom(int com) {
		this.com = com;
	}
	public char getGrade() {
		return grade;
	}
	public void setGrade(char grade) {
		this.grade = grade;
	}
	
}
