package Homework;

import java.util.Scanner;

public class no7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("string : ");
		String str = sc.nextLine();
		char[] ch = str.toCharArray();
		for(int i = 0; i < ch.length; i++) {
			if(65<=ch[i] && ch[i]<= 77 ) {
				ch[i] += 13;
			}
			else if(78<=ch[i] && ch[i]<=90) {
				ch[i] -= 13;
			}
			else if(97<=ch[i] && ch[i]<= 109) {
				ch[i] += 13;
			}
			else if(110<=ch[i] && ch[i]<=122) {
				ch[i] -= 13;
			}
			else continue;
		}
		String result = String.valueOf(ch);
		System.out.println(result);
	}
}
