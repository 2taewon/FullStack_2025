package Homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class N_1181 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TreeSet ts = new TreeSet();
		int N = sc.nextInt();
		
		for(int i = 0; i<N; i++) {
			String str = sc.next();
			ts.add(str);
		}
		
		ArrayList<String> al = new ArrayList(ts);
		Collections.sort(al, new lengthCompare());
		
		for(String s : al)
			System.out.println(s);
	}
}

class lengthCompare implements Comparator<String> {
	@Override
	public int compare(String s1, String s2) {
		if (s1.length() > s2.length()) return 1;
		else if (s1.length() < s2.length()) return -1;
		else return 0;
	}
}
