package ex03.oop;

import java.util.Scanner;

public class MainEntry {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		Color color = new Color();
		TV tv = new TV();
		
		System.out.println(tv);
		tv.setA(sc.next());
		tv.setB(sc.next());
		tv.setC(sc.next());
		tv.display();
		color.setX(sc.next());
		color.setY(sc.next());
		color.setZ(sc.next());
		color.disp();
		
	}

}




// setter /getter method
// construcor method - 3가지
// output