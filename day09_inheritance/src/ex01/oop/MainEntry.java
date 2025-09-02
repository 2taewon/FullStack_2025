package ex01.oop;

public class MainEntry {
	public static void main(String[] args) {
		Point pt = new Point(3,0);
		
		pt.disp();
		System.out.println(pt.hashCode());
		
		Point pt2 = new Point(2);
		pt2.disp();
		
		Point pt3 = new Point(3,4);
		pt3.disp();
	}
}
