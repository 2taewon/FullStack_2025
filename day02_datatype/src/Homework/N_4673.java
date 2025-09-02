package Homework;

import java.util.Scanner;
import java.util.TreeSet;

public class N_4673 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = 0;
		int sum = 0;
		TreeSet ts = new TreeSet();
		//N = sc.nextInt();
		for(int i = 1; i< 10000; i++) {
			sum = i + i / 10 + i % 10;
				ts.add(sum);
				
//				i = sum;
				
		}
		for(Object j : ts) {
			System.out.print(j + ", ");}
	}
}


/* 생성자
 *	(N + N / 10 + N % 10) = d(n)
 *
 */