package Homework;

import java.util.Scanner;

public class N_1110 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int cnt = 0;		
		int sum = N;
		int A = N % 10;
		
		while(true) {
			if(sum < 10) {
			sum = (A*10)+(((sum/10) + (sum%10)) % 10);
			}
			else if(sum >=10) {
			sum = ((A%10)*10)+(((sum/10) + (sum%10)) % 10);
			}
			A= sum % 10;
			cnt++;
			if(N == sum) {
				break;
			}
		}
		System.out.println(cnt);
	}
		

}
