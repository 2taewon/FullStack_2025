package Quiz;

import java.util.Scanner;

public class no1 {
	public static void main(String[] args) {
		//String str = " "; 임의적인 문자열 입력 받아서 대문자 → 소문자 
		//소문자 → 대문자 출력하는 프로그램 작성
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		char[] ch = str.toCharArray();
		for(int i = 0; i<ch.length; i++) {
			if(Character.isLowerCase(ch[i])) {
				ch[i] = Character.toUpperCase(ch[i]);
				
			}
			else if(Character.isUpperCase(ch[i])) {
				ch[i] = Character.toLowerCase(ch[i]);
				 
			}
		}
		for(int i = 0; i <ch.length; i++) {
			System.out.print(ch[i]);
		}
		
	}
}
