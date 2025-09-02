package Homework;

import java.util.Scanner;

public class no4 {
	 public static void main(String[] args) {
			int n = new Scanner(System.in).nextInt();
			int k = new Scanner(System.in).nextInt();
			int[] divisor;
			divisor = new int[n];
			int count = 0;
			
			for(int i = 1; i<=n; i++) { // 약수 출력 후, 배열에 집어넣기 
				if(n % i == 0) {	
					divisor[count] = i;
					count++;
				}
				
			} // end for
				if(divisor.length >= k) { // k번째로 작은 수 출력 
					System.out.println(divisor[k-1]);
				}
				else {
					System.out.println(0);
				
			}
	 }
}
