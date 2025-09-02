package ex01.scanner;

import java.util.Scanner; //ctrl + shift + o (자동 임포트)

public class MainEntry {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int su = sc.nextInt();
		System.out.print("integer data input : ");
		System.out.println(su);
	}

}
