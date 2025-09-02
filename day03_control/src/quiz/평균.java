package quiz;

import java.util.Scanner;

public class 평균 {
	public static void main(String[] args) {
		System.out.print("math : ");
		int math = new Scanner(System.in).nextInt();
		System.out.print("kr : ");
		int kr = new Scanner(System.in).nextInt();
		System.out.print("en : ");
		int en = new Scanner(System.in).nextInt();
		int avg;
		avg = (math + kr + en) / 3;
		if(math > 0 && kr > 0 && en > 0 ) {
		if(avg < 60) {
			System.out.print("불합격");
		}
		else if((avg >= 60) && (math < 40) || (kr < 40) || (en < 40)) {
			if(math < 40) {
			System.out.print("불합격, math 40점을 넘지 않습니다");
			}
			else if(kr < 40) {
				System.out.print("불합격, kr 40점을 넘지 않습니다");
				}
			else if(en < 40) {
				System.out.print("불합격, en 40점을 넘지 않습니다");
				}
		}
		else if(avg >= 60 && math >= 40 && kr >= 40 && en >= 40) {
			System.out.print("합격");
		}
		}	
	}
}


// 평균 60점, 과락 40점 불합격, 아니면 합격