package Homework;

import java.util.ArrayList;
import java.util.Scanner;

public class N_9506 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList list = new ArrayList();
		int n;
		int sum = 0;
		int listsum = 0;
		while((n = sc.nextInt()) != -1) {
			int temp = n;
			for(int i = 1; i<n; i++) {
				if(n%i == 0) {
					list.add(i);
				}
			}
			for(int x = 0; x <list.size(); x++) {
				listsum += (Integer)list.get(x);
			}
			if(listsum == temp) {
			System.out.print(temp + " = " + list.get(0));
			for(int j = 1; j<list.size();j++) {
				System.out.print(" + " + list.get(j));
				}
				System.out.println();
			}
			else {
				System.out.println(temp + " is NOT perfect.");
			}
			list.clear();
			listsum = 0;
		} //end while
	}
}
