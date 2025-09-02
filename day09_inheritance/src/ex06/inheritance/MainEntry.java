package ex06.inheritance;

public class MainEntry {
	public static void main(String[] args) {
		Shape sh = new Circle(); // 부모로 객체생성 가능
		sh.show();
		
		sh = new Triangle(); // 
		sh.show();
		
		Triangle tr = new Triangle();
		tr.show();
	}
}
