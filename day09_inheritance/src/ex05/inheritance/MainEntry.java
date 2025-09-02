package ex05.inheritance;
// private < default <protected < public 
class Point2 { // 부모클래스 
	protected int x, y;
}

class Circle2 extends Point2 { //자손 클래스 
	int r;
	public void disp() {
		System.out.println(x + "," + y + ","+ r);
	}
}
public class MainEntry {
	public static void main(String[] args) {
		Circle2 c = new Circle2();
	}
}
