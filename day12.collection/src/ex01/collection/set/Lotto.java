package ex01.collection.set;

import java.util.Scanner;
import java.util.TreeSet;

public class Lotto {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TreeSet set = new TreeSet<>();
		TreeSet M_set = new TreeSet<>();
		int cnt = 0;
//		for(int i = 0; i<6; i++) {
		
		while(set.size() < 6) {
			set.add((int)(Math.random() * 45)+1);
		}
		for(int i = 0; M_set.size()<6; i++) {
			int n = sc.nextInt();
			M_set.add(n);
		}
		for(int i = 0; i<6; i++) {
			for(int j = 0; j <6; j++) {
			if(set == M_set) {
				cnt++;
				}
			}
		}
		System.out.println("이번 정답 번호 6개 : " + set);
		System.out.println("내가 적은 번호 6개 : " + M_set);
		System.out.println("총 "+cnt+"개 맞았습니다.");
//		(Math.random() + 45);
	}
}
