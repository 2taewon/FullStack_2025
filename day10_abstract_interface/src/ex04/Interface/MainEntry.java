package ex04.Interface;


interface A { // interface - abstract method, final field 만 갖는다.
	int x = 90;
	final int y = 777;
	char ch = 'A';
	
	public void show();
	public abstract void disp();
//	public void view() {} // error 

}
interface B {
	void view();
}
interface C {
	String name = "happy";
	public void draw();
} // C end 

interface D extends B {
	void dview();
}// D end 
////////////////////////

class Rect implements D {

	@Override
	public void view() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dview() {
		// TODO Auto-generated method stub
		
	}
	public int plus (int x ,int y ) {
		return x+y;
	}
	
}
//////// Rect end 
class Shape {
	
}
class Circle implements C {

	@Override
	public void draw() {
//		name = "yuna";
		System.out.println(name + "님이네요.");
	}
	
}
class Multi extends Shape implements B, C, A{

	@Override
	public void show() { //A
		// TODO Auto-generated method stub
		System.out.println("show method call");
	}

	@Override
	public void disp() { //A
		// TODO Auto-generated method stub
		System.out.println("disp method call~");
	}

	@Override
	public void draw() {// C
		// TODO Auto-generated method stub
		System.out.println("draw method call~");
	
	}

	@Override
	public void view() { // B
		// TODO Auto-generated method stub
		
	}
	
} //Multi end 

public class MainEntry {

	public static void main(String[] args) {
		Multi m = new Multi();
		m.show();
		
		B b = new Multi();
		b.view();
	}

}

