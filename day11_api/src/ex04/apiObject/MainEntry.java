package ex04.apiObject;

class Point{
	
}

public class MainEntry {
	public static void main(String[] args) {
		Point pt = new Point(); // 객체 생성, 메모리 할당, 생성자 자동호출
		System.out.println("Point pt information");
		System.out.println("class name : " + pt.getClass());
		System.out.println("hash code : " + pt.hashCode());
		System.out.println("Object String : " + pt);
		System.out.println("Object String : " + pt.toString());
//		System.out.printf("10진수 주소 %d \n", 1f021e6c);
	
		System.out.println("-----------------------------");
		Point pt2 = new Point();		
		System.out.println("pt2.toString(): toString()의 의미");
		System.out.println(pt2.getClass().getName()+'@' +pt2.hashCode());
		System.out.println(pt2.getClass().getName()+'@' + Integer.toHexString(pt2.hashCode()));
	
		Point pt3 = new Point();
		
		Point pt4;
		pt3 = pt;
		if(pt.hashCode() == pt3.hashCode()) {
			System.out.println("same");
		}else
			System.out.println("not same");
	}
}
