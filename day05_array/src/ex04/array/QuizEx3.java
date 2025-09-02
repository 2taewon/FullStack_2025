package ex04.array;

import java.util.Scanner;

public class QuizEx3 {

	public static void main(String[] args) {
		System.out.println("숫자를 입력하세요 : ");
		int num = new Scanner(System.in).nextInt();
		int[] a = new int[num]; // 객체생성, 메모리 할당, 생성자함수 자동호출
		
		for(int i = 1; i<=a.length; i++) {
			a[i-1] = i;
		}
		
		for(int i = 0; i<a.length; i++) {
			System.out.print("a["+ i +"]"+"="+a[i]+"\n");
		}
		// 임의적인 데이터 입력 받아서, 출력
		
	}

}
