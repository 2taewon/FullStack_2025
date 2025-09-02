package ex01.collection.set;

import java.util.HashSet;
import java.util.Iterator;

public class MainEntry {
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>(); // 
		hs.add("키보드");
		hs.add("마우스");
		hs.add("컵");
		hs.add("볼펜");
		hs.add("키보드");
		
		System.out.println("요소 개수 : " + hs.size()); // 중복허용 x
		System.out.println(hs); // 순서 X
		
		HashSet<Integer> hs2 = new HashSet<>(); // <>안에는 wrapper 클래스만 가능, primitive는 불가.
		hs2.add(100);
		hs2.add(3);
		hs2.add(1000);
//		hs2.add("string"); //타입 제한 
		System.out.println(hs2);
		
		HashSet hs3 = new HashSet<>();
		hs3.add(12.34);
		hs3.add(300);
		hs3.add("String");
		System.out.println(hs3);
		
		Iterator it = hs3.iterator();
		while(it.hasNext()) { // 다음 요소가 있다면...
			System.out.println(it.next()); // 요소를 꺼내와서 출력함.
			
		}
		System.out.println();
		it = hs.iterator();
		while(it.hasNext()) { //다음 요소 있으면 
			System.out.println(it.next()); // 요소를 꺼내와서 출력
		}
	}
}
