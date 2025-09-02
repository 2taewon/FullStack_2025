package quiz;

import java.util.Random;
import java.util.Scanner;

public class no1 {
	public static void main(String[] args) {
		Random rand = new Random();
		int num = (rand.nextInt(100)+1);
		System.out.println("숫자를 입력해주세요 : ");
		Scanner sc = new Scanner(System.in);
		int count = 0;
		
		for(int i = 1; i <= 5; i++) {
		int a = sc.nextInt();
		if(num > a) {
		System.out.println("up");
		count ++;
		}
		else if(num < a) {
		System.out.println("down");
		count ++;
		}
		else if (num == a) {
			System.out.println("정답입니다.");
			break;
			}
		}
		if(count == 5) {
		System.out.println("기회를 모두 사용하셨습니다 정답은"+ num + "입니다.");
		}
		
	}
}
