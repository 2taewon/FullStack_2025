package ex01.collection.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx {
	public static void main(String[] args) {
		Object[] objArr = {"1", new Integer(1), "2", "3", "4", "4", "4"	}; // 중복 불가능하지만 "1"과 new Integer(1)은 달라 1이 두개 출력
		Set set = new HashSet();
		
		for(int i = 0; i<objArr.length; i++) {
			set.add(objArr[i]);
		}
		System.out.println(set);
	}
}