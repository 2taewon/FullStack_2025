package ex02.datatype;


public class MainEntry { 
	static int NUM; //정수형 : 0, 실수형 : 0.0, 문자열 : NULL
	static String str; 
	
	public static void main(String[] args) {
		
		System.out.println(NUM);
		System.out.println(str);
		
		int x = 99; 
		System.out.println(x);
		
		int su = 30;
		System.out.println(su); //4byte
		System.out.println(100); //4byte 
		
		long num = 200;
		System.out.println(num); //8byte
		System.out.println(100L); //long 
		
		double d = 12.34;
		System.out.println(d); //8byte
		System.out.println(34.56); //8byte
		System.out.println(5.67f); //4byte
		
		float f = 12.34f; //f or F
		System.out.println(f);
	}

}
