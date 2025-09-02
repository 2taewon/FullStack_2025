package ex01.collection.set;

import java.util.TreeSet;

public class TreeSetEx {
	public static void main(String[] args) {
		TreeSet set = new TreeSet<>();
		
		int[] score = { 90, 23, 45, 51, 75, 90, 67, 88, 100 , 100};
		
		for(int i = 0; i<score.length; i++) {
//			set.add(score[i]);
			set.add(new Integer(score[i]));
		}
		System.out.println(set);
		System.out.println("50보다 작은 값 : " + set.headSet(50));
		System.err.println(set);
		System.out.println("50보다 큰 값 : " + set.tailSet(50));
	}
}
