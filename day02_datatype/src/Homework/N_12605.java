package Homework;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class N_12605 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String str;
		int N = Integer.parseInt(br.readLine());
		for(int num = 1; num <= N; num++) {
			String temp;
			str = br.readLine();
			String[] arr = str.split(" ");
			for(int i = 0; i < arr.length; i++) {
				if(i >= arr.length - (i+1)) {
					break;
				}
				temp = arr[i];
				arr[i] = arr[arr.length - (i+1)];
				arr[arr.length - (i+1)] = temp;
			}
			bw.write("Case #"+num +": ");
			for(String word : arr) {
				bw.write(word+ " ");
				}
			bw.write("\n");
			}
		bw.flush();
		bw.close();
		}
	}

