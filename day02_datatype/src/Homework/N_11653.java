package Homework;

import java.util.ArrayList;
import java.util.Scanner;

public class N_11653 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int sum = 0;
		int temp = N;
		for(int i = 2; i <= temp; i++) {
			if(N % i == 0) {
				sum = N / i;
				list.add(i);
				while(sum%i ==0) {
					sum /=  i;
					list.add(i);
				}
				N = sum;
			}
		}
		
		for(int j = 0; j < list.size(); j++) {
			
			System.out.println(list.get(j));
		}
	}
}
