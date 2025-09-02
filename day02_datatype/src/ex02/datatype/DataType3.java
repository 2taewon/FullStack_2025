package ex02.datatype;

public class DataType3 {
	//진법 
	public static void main(String[] args) {
		int A = 10;
		System.out.println("10진수 :" + A);
		
		System.out.printf("10진수 %d\n", A);
		
		System.out.printf("8진수 %o\n", A);
		
		System.out.printf("16진수 %x\n", A);

		// 0숫자 --> 8진수, 0x숫자 --> 16진수 
		System.out.printf("%d \n", 012); //012(8진수) --> 10진수 출력
		System.out.printf("%d \n", 0xA); //012(8진수) --> 10진수 출력
	}

}

/* 
 	10진수 : 0 1 2 3 4 5 6 7 8 9 10 11 12 13 ...
 	0~9 
 	8진수 : 0 1 2 3 4 5 6 7 10 11 12 13 14 15 16 17 
 	0~7
 	16진수 : 0 1 2 3 4 5 6 7 8 9 a b c d e f 10 11 12 13 .. 19 1a 1b 
 	0~15
 	0~9, a, b, c, d, e, f
  */
 