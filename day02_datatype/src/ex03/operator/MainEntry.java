package ex03.operator;

//최단산쉬관논삼대콤
public class MainEntry {

	public static void main(String[] args) {
		//단항연산자 : 증감 ==> ++,--,~,...
//		int x = 10, y;
//		y = x++; //후위연산 : 대입먼저, 연산나중
//		y = ++x; //전위연산 : 연산먼저, 대입나중 
//		int x = 10, y; 
//		y = ~x; //비트부정 : -(원래값 + 1) ==> 출력 결과
		
	int x = 10, y= 20; // 산술연산자 
	int gob = x*y;
//		System.out.println(gob);
//		System.out.println(x + "*" + y "=" (x*y));
		
		
		System.out.println("x = " + x + "\ty =" + y);
		
		System.out.println(3 + 4 * 5); //23 (),[],.	
		System.out.println((3 + 4) * 5); //35

	}

}

// 예외적으로 
//x++; ++x 
// y = x; 일 때는 후위,전위 상관없이 그냥 진행 