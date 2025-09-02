package ex00.Instanceof;

class A { int a; }

class B extends A{ int b; }


public class MainEntry {
	public static void main(String[] args) {
		A a = new A();
//		B aa = new A();  // 
		B b = new B();
		A bb = new B();
		
		System.out.println("a instanceof A : " + (a instanceof A));
		System.out.println("a instanceof A : " + (b instanceof A));
		System.out.println("a instanceof A : " + (a instanceof B));
		System.out.println("a instanceof A : " + (b instanceof B));
	}
}
