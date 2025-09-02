package Programmers;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

//두 개 뽑아서 더하기
public class N_68644 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int num;
		int a =1;
		int no = sc.nextInt();
		int[] arr = new int[no];
		TreeSet ts = new TreeSet();
		
		for(int i = 0; i<arr.length; i++) {
			num = sc.nextInt();
			arr[i] = num;
		}
		
		for(int j = 0; j < arr.length; j++) {
			for(int k = a++; k < arr.length; k++) {
				sum = arr[j] + arr[k]; 
				ts.add(sum);
			}
			
		}
		System.out.println(ts);
	}
}
