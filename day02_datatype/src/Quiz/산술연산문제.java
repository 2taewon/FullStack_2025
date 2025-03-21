package Quiz;

public class 산술연산문제 {

	public static void main(String[] args) {
		int pay = 567890;
		
		// 연산자 /, % 이용해서 만원?, 천원?, 백원? 십원? 
		System.out.println("만원은 : " + pay/10000 +"장");
		System.out.println("천원은 : " + (pay%10000)/1000 + "장");
		System.out.println("백원은 : " + (pay%1000)/100 + "개");
		System.out.println("십원은 : " + (pay%100)/10 + "개");
	}

}

// result : 
/*	만원은 : 56장
	천원은 : 7장
	백원은 : 8개
	십원은 : 9개
 */
