package ex03.Switch;

import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
		System.out.println("city? (s,d,b,j) =");
		String ch = new Scanner(System.in).next();
		
		switch(ch) { //long 형을 제외한 정수형,문자형 올 수 있다. 실수형 x;
		case "s" : { //값-숫자,'문자',"문자열"
			System.out.print("서울");
			break;
			}
		case "d" : {
			System.out.print("대구");
			break;
			}
		case "b" : {
			System.out.print("부산");
			break;
			}
		case "j" : {
			System.out.println("제주");
			break;
			}
		default : //생략가능함 - 에러처리 메세지 넣으면 좋음
			System.out.println("잘못 선택하셨습니다. s,d,b,j 중에 선택하세요");
			System.exit(0); //프로그램 강제종료 ->에러처리 뜰 때 그 밑에 있는 sysout이 뜰 수 있기에 얘외 처리 필요
		}
		System.out.println("을(를) 선택하셨습니다.");
	}
}
