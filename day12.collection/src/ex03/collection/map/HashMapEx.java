package ex03.collection.map;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("tw", 50);
		map.put("민희", 60);
		map.put("제이", new Integer(75));
		map.put("재용", 80);
		map.put("휘", 100);
		
		Set set= map.entrySet();
		Iterator it = set.iterator();
//		System.out.println(it.next());
		
//		Set set = map.entrySet().iterator(); //한 번에 하기.
		while(it.hasNext()) {
			Map.Entry e = (Map.Entry)it.next(); // 형변환 필수
			System.out.println("이름 : " + e.getKey() + ", 점수 : " + e.getValue());
		}
		
		set = map.keySet();
		System.out.println("참가자 명단 : " + set);
		
		Collection values = map.values();
//		System.out.println(values);
		it = values.iterator();
//		System.out.println(it.next());
		
		int total = 0;
		while (it.hasNext()) {
			Integer num = (Integer)it.next(); // 형변환 필수
			total += num.intValue();
		}
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + (float)total / set.size());
		System.out.println("최고점수 : " + Collections.max(values));
		System.out.println("최하점수 : " + Collections.min(values));
	}
}
