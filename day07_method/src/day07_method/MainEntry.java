package day07_method;

import java.util.Arrays;

public class MainEntry {

	public static void main(String[] args) {
		
		int [] a = {7, 3, 5, 2, 8};
		System.out.println("sort 전 출력 : ");
		for(int i = 0; i<a.length; i++) {
			System.out.print(a[i] + "\t");
		}
		Arrays.sort(a);
		System.out.println("\n 오름차순 - sort 후 출력 :");
		for(int i = 0; i < a.length; i++) {
		System.out.print(a[i] + "\t");
		}
		
		System.out.println("\n내림차순 - sort 후 출력 :");
		for(int i = a.length - 1; i >= 0; i--) {
		System.out.print(a[i] + "\t");
		}
	}
	
}
