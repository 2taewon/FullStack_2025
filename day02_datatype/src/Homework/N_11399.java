package Homework;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class N_11399 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc = new Scanner(System.in);
		//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int sum = 0; int temp = 0;
		int N = sc.nextInt();
		int[] arr = new int[N];
		
		for(int i = 0; i<N; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		for(int j = 0; j<arr.length; j++) {
			
			sum += arr[j];
			temp += sum;
		}
		System.out.println(sum);
	}
}
