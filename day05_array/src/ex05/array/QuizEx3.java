package ex05.array;

import java.util.Random;
import java.util.Scanner;

public class QuizEx3 {
	public static void main(String[] args) {
		int [][] a = new int[2][3];
		// 2차원 배열에 임의적인 숫자 입력 받아서 합 출력 해주세요.
		Scanner sc = new Scanner(System.in);
		int num;
		int sum = 0;
		for(int i = 0; i <2; i++) {
			for(int j = 0; j<3; j++) {
				System.out.print("입력 : ");
				num = sc.nextInt();
				a[i][j] = num;
				sum += a[i][j];
			}
		}
		System.out.println("합 : " + sum);
		System.out.println("--------------");
		
		int sum2 = 0;
		
		for(int i = 0; i <2; i++) {
			for(int j = 0; j<3; j++) {
				a[i][j] = (int)Math.random()*100+1;
				sum2 += a[i][j];
			}
		}
		System.out.println("랜덤 배열 합 : " + sum2);
		
	}
}
