package ex01_lambda;

import java.util.ArrayList;

public class LambdaMain {
	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(55);
		numbers.add(82);
		numbers.add(73);
		numbers.add(75);
		
//		numbers.forEach((n) -> {	System.out.println(n); });
		numbers.forEach(n -> {	System.out.println(n); });
//		for(int item : numbers) {
//			System.out.println(item);
//		}
	}
}
