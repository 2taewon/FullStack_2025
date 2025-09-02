package ex03.Abstract;

public class MainEntry {
	public static void main(String[] args) {
		
		// 3. 배열 이용한 형태 
		Shape[] s = new Shape[3]; // 배열 선언 및 생성 
		s[0] = new Circle();
		s[1] = new Circle();
		s[2] = new Circle();
		
		String[] names = {"Circle", "Rectangle","Triangle"};
		System.out.println("---------------------");
		
		for (int i = 0; i <s.length; i++) {
			s[i].show(names[i]);
		}
		
		//2. Shape 부모 추상 클래스를 이용해서 객체 생성
		Shape sh = new Circle();
		sh.show("Circle");
		
		sh = new Rect();
		sh.show("Rect");
		
		sh = new Triangle();
		sh.show("Triangle");
		
		System.out.println("---------------------");		
		// 1. 각자의 클래스로 객체 생성한 형태
		new Circle().show("원");
		
		Rect r = new Rect();
		r.show("Rect");
		Triangle t = new Triangle();
		t.show("삼각형");
	}
}
