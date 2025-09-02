package HomeWork;

import java.util.Scanner;

public class 논리연산 {
	public static void main(String[] args) {
		System.out.print("X :");
		int x = new Scanner(System.in).nextInt();
		System.out.print("y :");
		int y = new Scanner(System.in).nextInt();
		System.out.print("z :");
		int z = new Scanner(System.in).nextInt();
		int temp = 1; 
		if(x >= y && y >= z) {
			System.out.println(x+ "," + y + "," + z + "순으로 크다.");
		}
		else if(x > z && z > y) {
			temp = y; y = z; z = temp;
			System.out.println(x+ "," + y + "," + z + "순으로 크다.");
		}
		else if(y >= z && z > x) {
			temp = z; z = x; x = y; y = temp;
			System.out.println(x+ "," + y + "," + z + "순으로 크다.");
		}	
		else if(y > x && x >= z) {
			temp = x; x = y; y = temp;
			System.out.println(x+ "," + y + "," + z + "순으로 크다.");
		}
		else if(z >= x && x > y) {
			temp = y; y = x; x = z; z = temp;
			System.out.println(x+ "," + y + "," + z + "순으로 크다.");
		}
		else if(z > y && y >= x) {
			temp = z; z = x; x = temp;
			System.out.println(x+ "," + y + "," + z + "순으로 크다.");
		}	
	}
}
