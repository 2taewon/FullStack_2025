package ex03.operator;

public class OperatorTest2 {

	public static void main(String[] args) {
		//논리연산자	
//		int x = 4; int y = 7;
//			System.out.println(x & y);
//			System.out.println(x ^ y);
//			System.out.println(x | y);
		
		int x = 10, y = 20, z = 30;
		boolean flag = false;
		
//		flag = (x < y) && (y < z); // '&&' 연산은 앞에 '거짓'이면 뒤는 수행하지 않는다.
		flag = (x > y) || (y < z);
		System.out.println(flag);
		
//		flag = (x > y) && (y > z);
		flag = (x < y) || (y > z);
		System.out.println(flag);
	}
}
