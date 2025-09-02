package Homework;

import java.util.Scanner;

public class N_1292 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A,B;
		int cnt = 0,sum = 0, n_cnt = 1;
		A = sc.nextInt();
		B = sc.nextInt();
		
		int[] arr = new int[1000];
		
		for(int i = 0; i<arr.length; i++) {
			if(cnt == n_cnt) {
				cnt = 1;
				arr[i] = ++n_cnt;
				continue;
			}
			cnt++;
			arr[i] = n_cnt;
		}
		for(int j = 0; j<20;j++) {
			System.out.println(arr[j]);
		}
		while(A<=B) {
			sum += arr[A-1];
			A++;
		}
		System.out.println(sum);
	}
}
