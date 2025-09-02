package Homework;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class N_9093 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(br.readLine());
		
		while(T > 0) {
			String[] arr = br.readLine().split(" ");
			for(String s : arr) {
				StringBuilder sb = new StringBuilder(s);
				System.out.print(sb.reverse() + " ");
			}
			T--;	
		}
	}
}