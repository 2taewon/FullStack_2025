package Homework;

import java.util.HashMap;
import java.util.Scanner;

public class N_1269 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int X = sc.nextInt();
		int Y = sc.nextInt();
		int sum = 0;
		for(int i = 0; i<X; i++) {
			int A = sc.nextInt();
			map.put(A, 0);
		}
		
		for(int j = 0; j<Y; j++) {
			int B = sc.nextInt();
			if(map.containsKey(B)) {
				map.remove(B);
				continue;
			}
			map.put(B, 0);
		}
		System.out.println(map.size());
	}
}
