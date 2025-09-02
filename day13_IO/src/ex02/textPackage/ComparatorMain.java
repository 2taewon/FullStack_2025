package ex02.textPackage;

import java.util.TreeSet;

public class ComparatorMain {
	public static void main(String[] args) {
//		TreeSet set1 = new TreeSet(); //오름차순 정렬
		TreeSet set2 = new TreeSet(new UserDesending()); // 사용자가 만든 내림차순 클래스 객체 전달
		
		int[] score = { 98, 63, 75, 26, 100, 64, 85, 100, 75};
		
		for (int i = 0; i < score.length; i++) {
			set2.add(score[i]);
		}
		
		System.out.println(set2);
	}
}

// 