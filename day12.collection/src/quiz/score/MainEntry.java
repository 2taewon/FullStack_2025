package quiz.score;

import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ScoreManage s = new ScoreManage();
		int select = 0;
		
		while(true) {
		System.out.println("====성적 처리====");
		System.out.println(" 번호를 선택하세요.");
		System.out.println("1. 추가, 2. 삭제, 3.리스트 출력 \n 4. 수정 0. 프로그램 종료");
		select = sc.nextInt();
		switch(select) {
		case 0 : System.out.println("프로그램을 종료합니다."); System.exit(0); 
		case 1 : s.input(); break;
//		case 2 : s.del(); break;
		case 3 : s.disp(); break;
//		case 4 : s.set(); break;
			}
		}	
		
		
	}
}
