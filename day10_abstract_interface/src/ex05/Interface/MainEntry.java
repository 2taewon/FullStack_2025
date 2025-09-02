package ex05.Interface;

public class MainEntry {
	public static void main(String[] args) {
		BB b = new BB();
		b.draw();
		System.out.println(b.su);
		
		System.out.println("-------------------------------");
		
		// 2. 부모 인터페이스로 객체 생성
		IDraw bb = new BB();
		bb.draw();
		System.out.println(bb.su);
		
	}
}
