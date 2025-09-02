package HomeWork;

import java.util.Scanner;
public class 과제2 {
	public static void main(String[] args) {
// 과제 2 : (-1) + 2 +(-3) + 4 + (-5) + … + (-9) + 10 = ? 5 
		int num = 0, sum = 0;
		num = new Scanner(System.in).nextInt();
		for(int i = 1; i <= num; i++) {
			if(i % 2 == 0) {
				sum += i;
			}
			if(i % 2 != 0) {
				sum -= i;
			}
		}
		System.out.println(sum);
	}
}
