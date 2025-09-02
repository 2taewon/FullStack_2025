package Homework;

import java.util.Scanner;

public class no8 { //2884
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int M = sc.nextInt();
		
		if(M < 45) {
			if(H == 0) {
				H = 23; 
				M = M + 15;
				System.out.println(H + " " + M);
				System.exit(0);
			}
			H = H - 1;
			M = M + 15;
		}
		else if(M >= 45) {
			M = M - 45;
		}
		System.out.println(H + " " + M);
	}
}
