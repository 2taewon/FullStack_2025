package ex06.whileDoWhile;

public class MultiWhile {

	public static void main(String[] args) {
		int a=2,b=1;
		do {
			b=1;
			do {
				System.out.println(a +"x"+ b +"="+ a*b);
				b++;
			}while(b<10);
			a++;
		}while(a<10);
	}

}
