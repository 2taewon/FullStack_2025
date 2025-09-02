package Homework;

import java.util.Arrays;
import java.util.Scanner;

public class N_1427 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String N;
		char[] arr = (N = sc.next()).toCharArray();

		
		Arrays.sort(arr);
		for(int i = arr.length - 1; i >= 0; i--) {
		System.out.print(arr[i]);
		}
	}
}
