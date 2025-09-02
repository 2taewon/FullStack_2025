package Homework;

import java.util.Arrays;
import java.util.Scanner;

public class N_2798 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int[][] arr = new int[a][2];
		for(int i = 0; i<a; i++) {
			 arr[i][0] = sc.nextInt();
			 arr[i][1] = sc.nextInt();
		}
		
		Arrays.sort(arr,(o1, o2)->{
		return o1[0]>o2[0] ? o1[0] - o2[0] : o1[1] - o2[1];
		
		});
		
		
		for(int j = 0; j<arr.length; j++) {	
		System.out.println(arr[j][0] +" "+ arr[j][1]);
		
		}
	}
}
