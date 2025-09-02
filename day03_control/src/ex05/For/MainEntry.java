package ex05.For;

public class MainEntry {
public static void main(String[] args) {
	int a,b;
	for(a=1, b=2; b <= 10; a++, b+=2 ) { //초기값 / 증감식 2개 이상 가능,조건은 오직 1개 // 무한루프 - 탈출구문 
		System.out.print(b + "\t");
		b++;
		if(b == 10) break;
		
	}
}
}
//package ex05.For;
//
//public class MainEntry {
//public static void main(String[] args) {
//	int a = 1;
//	for(; a <= 5; ) { //초기값 / 증감식 생략 가능, 조건 생략 할 수 없다. 
//		System.out.print(a + "\t");
//		a++;
//	}
//}
//}

//package ex05.For;
//
//public class MainEntry {
//public static void main(String[] args) {
//	int a = 1;
//	for(a = 1; a <= 3; a++) {
//		System.out.print(a + "\t");
//	}
//}
//}
