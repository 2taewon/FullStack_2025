package Homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N_11050 {
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
				String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int k = Integer.parseInt(input[1]);
				
				int result = factorial(n) / (factorial(k) * factorial(n - k));
				System.out.println(result);
			}
		
			public static int factorial(int n) {
				if (n == 0) return 1;
				return n * factorial(n - 1);
			}
}
