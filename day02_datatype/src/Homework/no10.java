package Homework;

import java.util.Scanner;

public class no10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		if(x > 0 && y > 0) n=1;
		else if(x < 0 && y > 0) n=2;
		else if(x < 0 && y < 0) n=3;
		else if(x > 0 && y < 0) n=4;
		
		System.out.println(n);
	}
}
