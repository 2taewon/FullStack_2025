package team3;

import java.util.Scanner;

public class ex06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		fibonacci(n);
	}
	
	static void fibonacci(int n) {
		int[] arr = new int[n+1];
		arr[0] = 0;
		arr[1] = 1;
		for(int i = 2; i<=n; i++) {
			arr[i] = (arr[i-2] + arr[i-1]) % 1234567;
		}
		System.out.println(arr[n]);
	}
}
