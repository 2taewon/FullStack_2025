package ex02.oop;

import java.util.Scanner;

public class RectMain {
	public static void main(String[] args) {
		// Rectangle 클래스 가져오기
		Rect rect = new Rect();
		Scanner sc = new Scanner(System.in);
		
		rect.setX(sc.nextInt());
		rect.setY(sc.nextInt());
		rect.setX2(sc.nextInt());
		rect.setY2(sc.nextInt());
		rect.disp();
	}
}
