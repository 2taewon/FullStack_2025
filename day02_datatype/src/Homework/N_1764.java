package Homework;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class N_1764 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int sum = 0;
		Map<String, Integer> map = new TreeMap<>();
		for(int i = 0; i<N; i++) {
			map.put(sc.next(), 0);
		}
		
		for(int j = 0; j<M; j++) {
			String s = sc.next();
			if(map.containsKey(s)) {
				map.put(s, map.getOrDefault(s, 0)+1);
				sum++;
			}
		}
		System.out.println(sum);
		for(String key : map.keySet()) {
			if(map.get(key) == 1) {
				System.out.println(key); 
				
			}
		}
	}
}
