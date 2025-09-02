package HomeWork;

import java.util.Scanner;
public class 과제3 {

	public static void main(String[] args) {
// 과제 3 : 1/2 + 2/3 + 3/4 + 4/5 + 5/6 +6/7 +7/8 + 8/9 + 9/10 = ? 7.07
		double num = 0.0, sum = 0.0;
		num = new Scanner(System.in).nextDouble();
		for(double i = 1; i<num; i++) {
			sum += (i/(i+1));
		}
		System.out.println(sum);
	}

}
