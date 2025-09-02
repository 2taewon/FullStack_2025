package quiz;

import java.util.Scanner;

public class Quiz_월의마지막일수 {

	public static void main(String[] args) {
		String msg = "";
		boolean flag = false;
		System.out.println("input month : ");
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();
		
		switch(month) {
		case 1 : case 3: case 5: case 7: case 8:
		case 10:
		case 12:
			System.out.println(month +"월의 마지막 날은 31일 입니다.");
			
		case 4: case 6: case 9: case 11:
			System.out.println(month +"월의 마지막 날은 30일 입니다.");
			break;
		case 2:
			System.out.println("year : ");
			int year = sc.nextInt();
			
			if(year % 4 == 0 && year % 100 !=0 || year % 400 == 0) {
				flag = true;
			}
			
			msg = (flag == true) ? year +"년도"+ month + "월의 마지막 날은 29일 입니다." 
												: year +"년도"+ month + "월의 마지막 날은 28일 입니다.";
			System.out.println(msg);
		default:
			System.out.println("잘못 입력하셨습니다. 1~12월 까지 사이 숫자만 넣으세요.");
		}
	}

}
