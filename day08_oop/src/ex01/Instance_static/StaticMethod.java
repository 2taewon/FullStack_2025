package ex01.Instance_static;

class A {
	int x,y;
	
	//static method 
	public static void setData(int xx, int yy) {
		System.out.println(xx +","+yy);
	}
}

public class StaticMethod {
	public static void main(String[] args) {
		A a = new A(); //객체생성, 메모리 할당, 생성자함수 자동호출
		
		a.setData(20, 33); // Object.methodName();
		A.setData(100, 500); //ClassName.methodName();
		
		a.x = 99;
		A.setData(3, 4);
	}
	
}

/*
	static method

- 객체 생성 없이 바로 사용 가능.
    - ex) Math.random();
*/ 