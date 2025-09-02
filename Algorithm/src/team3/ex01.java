package team3;

import java.util.ArrayDeque;
import java.util.Scanner;
import java.util.TreeSet;

public class ex01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] str = sc.nextLine().split(" ");
		TreeSet ts = new TreeSet();
		for(int i = 0; i<str.length; i++) {
			ts.add(Integer.parseInt(str[i]));
		}
		
		System.out.print(ts.first() + " " +ts.last());
	}
}
