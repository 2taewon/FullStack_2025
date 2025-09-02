package ex05.array;

import java.util.Scanner;

public class QuizEx6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [][] a = new int[2][3]; //
		
		System.out.println(a.length);
		System.out.println(a[0].length);
		System.out.println(a[1].length);
		
		for(int i = 0; i<a.length; i++) { //row
			for(int j = 0; j <= a.length; j++) { //col
			a[i][j] = sc.nextInt();
			}
		}
		
		for(int i = 0; i<a.length; i++) {
			for(int j = 0; j<=a.length; j++) {
			System.out.print("a["+ i +"]["+ j +"]"+"="+a[i][j]+"\n");
			}
		}
	}

}
