package Homework;

import java.util.Scanner;

public class N_10822 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] str = sc.next().split(",");
		int sum = 0;
		
		for(int i = 0; i<str.length; i++) {
			sum += Integer.parseInt(str[i]);
		}
		System.out.println(sum);
	}
}
