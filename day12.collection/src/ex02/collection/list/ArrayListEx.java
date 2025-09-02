package ex02.collection.list;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListEx {
	public static void main(String[] args) {
		ArrayList list = new ArrayList<>(10);
		list.add(new Integer(5));
		list.add(new Integer(4));
		list.add(new Integer(3));
		list.add(new Integer(2));
		list.add(new Integer(5));
		list.add(new Integer(7));
		
		ArrayList list2 = new ArrayList<>(list.subList(1, 4)); //1 포함, 4 미포함 
		print(list, list2);
		list2.add(33);
		
		Collections.sort(list);
		Collections.sort(list2);
		print(list, list2);
		
		System.out.println("list.containsAll(list2) : " + list.containsAll(list2));
		
		for(int i = list2.size()-1; i>= 0 ; i --) {
			if(list.contains(list2.get(i))) {
				list2.remove(i);
			}
			
			print(list,list2);
		}
	}

	public static void print(ArrayList list, ArrayList list2) {
		System.out.println("list : " + list);
		System.out.println("list2 : " + list2);
		System.out.println();
		
	}
}
