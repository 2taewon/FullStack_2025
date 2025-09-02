package Homework;

import java.util.HashMap;
import java.util.Scanner;

public class N_14425 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		int N = sc.nextInt();
		int M = sc.nextInt();
		String str;
		int sum = 0;
		for(int i = 0; i<N; i++) {
			 str = sc.next();
			 map.put(str, 0);
		}
		for(int j = 0; j<M; j++){
			str = sc.next();
			if(map.containsKey(str)) {
				map.put(str, map.getOrDefault(str, 0) + 1);
			}
		}
		for(int k : map.values()) {
			sum += k;
		}
		System.out.println(sum);
	}
}
