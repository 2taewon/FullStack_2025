package Quiz;

public class EX02Quiz {

	public static void main(String[] args) {
		int A = 12345;
		int si = A / 3600;
		int si_n = A % 3600;
		int bun = si_n / 60;
		int bun_n = bun % 60;
		int cho = bun_n;
				
		System.out.print(si+" : "+bun+" : "+ cho);
		
	}

}

// 문제 시:분:초
// result = 3 : 25 : 25