package ex03.operator;

public class OperatorTest {

	public static void main(String[] args) {
		//관계연산자 : >,<,>=,<=,==(같다), !=(같지않다)
		
		int x = 20, y = 20;
		
		if(x != y)
			System.out.println("not same");
		else 
			System.out.println("same");
		
		if(x==y) System.out.println("same2");
		else System.out.println("not same2");
	}

}



/*
package ex03.operator;

public class OperatorTest {

	public static void main(String[] args) {
		//shift 연산자 : <<,>>,<<<
		
		int x = 8; result;
		
//		result = x << 2; //left shift : 원래값 * 2^bit수 ==> 8 * 4 = 32
		result = x >> 3; //right shift : 원래값 / 2^bit수 ==> 8 / 2^3 = 1
		
		System.out.println("left shift result :" +result );
	}

}
*/