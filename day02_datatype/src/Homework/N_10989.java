package Homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class N_10989 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList list = new ArrayList();
		
		int n = Integer.parseInt(br.readLine());
		int num;
		for(int i = 0; i<n; i++) {
			num = Integer.parseInt(br.readLine());
			list.add(num);
		}
		Collections.sort(list);
		for(int j = 0; j < n; j++) {
			System.out.println(list.get(j));
		}
	}
}
