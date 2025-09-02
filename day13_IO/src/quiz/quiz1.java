package quiz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class quiz1 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a,b = 0;
		System.out.println("a = ");
		a = Integer.parseInt(br.readLine());
		while(b == 0) {
		System.out.println("b = ");
		b = Integer.parseInt(br.readLine());
		if(b == 0)
		System.out.println("0이 아닌 다른 수를 입력해주세요.");
		}
		System.out.println("op = ");
		char op = (char) br.read();
		
		switch(op) {
		case '+':System.out.println(a + "+" + b +"="+(a + b)); break;
		case '-':System.out.println(a + "-" + b +"="+(a - b)); break;
		case '*':System.out.println(a + "*" + b +"="+ a * b); break;
		case '/':System.out.println(a + "/" + b +"="+ a / b); break;
		default :System.out.println("다시 입력해주세요.");
		}
	}
}
