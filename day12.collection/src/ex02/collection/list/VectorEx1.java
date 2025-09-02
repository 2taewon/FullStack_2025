package ex02.collection.list;

import java.util.Collections;
import java.util.Iterator;
import java.util.Vector;

public class VectorEx1 {
	public static void main(String[] args) {
			Vector<Integer> v = new Vector<>();
			System.out.println("length      /       capaticy");
			System.out.println( v.size() + "      /       "+v.capacity());
			
			Vector<Integer> v2 = new Vector<>(3,4); // 초기용량, 증가용량
			System.out.println(v2.size()+ "     /      " + v2.capacity());
			v2.add(2); v2.add(18); v2.add(5); v2.add(24); v2.add(62); 
			System.out.println(v2.size()+"    /    " + v2.capacity());
			System.out.println(v2);
			
			System.out.println("---------iterator----------");
			Iterator it = v2.iterator();
			while(it.hasNext()) { //다음 요소를 확인
				System.out.println(it.next()); // 출력 
			}
			
			System.out.println("-----------get-------------");
			for(int i = 0; i<v2.size(); i++) {
				System.out.println(v2.get(i));
			}
			
			System.out.println("------sort method---------");
			Collections.sort(v2); //요소 순서대로 정렬
			for(int i = 0; i <v2.size(); i++) {
				System.out.println(v2.get(i));
			}
			System.out.println("------elementsAt() method------");
			for(int i = 0; i<v2.size(); i++) {
				Integer num = v2.elementAt(i);
				System.out.println(num);
			}
			System.out.println(v2.size()+"    /    " + v2.capacity());
			v2.trimToSize(); // 남아있는 용량 수용량 제거
			System.out.println(v2.size()+"    /    " + v2.capacity());	
	}
}
