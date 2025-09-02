package HomeWork;

import java.util.Scanner;

public class 과제1 {
// 과제 1 : 1+(1+2) +(1+2+3) + (1+2+3+4)+(1+2+3+4+5) = ? 35
	public static void main(String[] args) {
		int num = 0, sum = 0, temp = 0;
		
		num = new Scanner(System.in).nextInt();
		for(int i = 1; i<num+1;i++) {
			sum += i;
			temp += sum;
		}
		System.out.println("결과는 = " + temp);
	}

}

