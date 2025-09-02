package ex03.collection.map;

import java.util.TreeMap;

public class TreeMapEx {
	public static void main(String[] args) {
		TreeMap tm = new TreeMap();
		tm.put("zz", 1000);
		tm.put("bb", 1000);
		tm.put("aa", 2000);
		tm.put("dd", 1000);
		
		System.out.println("name : "+ tm.get("aa"));
		System.out.println(tm);
	}
}
