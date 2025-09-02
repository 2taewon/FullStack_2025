package ex01.Instance_static;

class B {
	int x, y;
	
	//instance method
	public void setData(int xx, int yy) {
		System.out.println(xx +","+yy);
	}
}


public class InstanceClass {

	public static void main(String[] args) {
		B b = new B();
		
		b.setData(22, 55);
	}

}


/*

*/
