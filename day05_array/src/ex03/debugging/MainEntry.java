package ex03.debugging;

public class MainEntry {

	public static void main(String[] args) {
		int x = 5, y = 10;
		for (int i = 1; i < 10; i++) {
			System.out.println(i);
			
			if(i == x) continue;
			y ++; 
		}
		System.out.println("x =" + x +", \ty = " + y);
	}

}
