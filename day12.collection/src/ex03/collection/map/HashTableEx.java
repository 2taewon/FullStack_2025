package ex03.collection.map;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTableEx {
	public static void main(String[] args) {
		Hashtable ht = new Hashtable(); // Map
		ht.put("1", "가위");
		ht.put("2", "바위");
		ht.put("3", "보");
		
		if(ht.contains("1")) 
			System.out.println("가위가 포함되어 있음");
		if(ht.contains("보")) 
			System.out.println("보는 3번으로 포함되어 있음");
		
		System.out.println("총 개수는 " + ht.size() + "입니다.");
		
		ht.remove(1);
		Enumeration enu = ht.keys();
		while(enu.hasMoreElements()) { // 어떤 타입으로 꺼내온 것에 대한 다른 것을 써야함. ex)hasmoreElements, hasnext
			Object key = enu.nextElement();
			
			Object value = ht.get(key);
			
			System.out.println("key = " + key + ", value = " + value);
		}
	}
}
