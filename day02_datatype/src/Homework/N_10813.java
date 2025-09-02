package Homework;

import java.util.Scanner;

public class N_10813 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b,temp;
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] arr = new int[N];
		
		for(int i = 0; i<N; i++) {
			arr[i] = i+1;
		}
		
		for(int j = 0; j <M; j++) {
			a = sc.nextInt();
			b = sc.nextInt();
			temp = arr[a-1];
			arr[a-1] = arr[b-1];
			arr[b-1] = temp;
		}
		for (int k = 0; k < arr.length; k++) {
			System.out.print(arr[k] + " ");
		}
	}
}
