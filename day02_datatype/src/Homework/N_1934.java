package Homework;

import java.util.Scanner;

public class N_1934 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int x = 0;
		for(int i = 0; i<T; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int max = a > b ? a : b;
	        int min = a < b ? a : b;
			if(a % b == 0 || b % a == 0) {
				if(a > b) {System.out.println(a); break;}
				else if(b > a) {System.out.println(b); break;}
			}
			
			for(int j = max/2+1; j >= 1; j--) {
	            if ( max%i == 0 && min%i==0 ) {
	                x = i; break;
	            }
	        }
		}
	}
}
