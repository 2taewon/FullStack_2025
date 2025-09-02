package ex2.list;
import java.util.*;
class  LinkedListEx1{
	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		
		list.add("c");
		list.add("d");
		list.add("k");
		list.add("o");
		list.add("p");
		list.add("x");
		
		list.addFirst("a");
		list.addLast("z");
		System.out.println(list);
		list.remove("k"); //데이터값으로 찾아서 삭제
		System.out.println(list);
		list.remove(2); //인덱스번호로 찾아서 삭제
		System.out.println(list);
		list.removeFirst();
		System.out.println(list);
		list.removeLast();
		System.out.println(list);
		list.set(2,"a"); //교체(변경)
		System.out.println(list);
		list.set(3,list.get(1)+"change");
		System.out.println(list);
		String str1 = (String)list.peek(); // queue의 맨 아래 객체를 반환한다. 객체를 큐에서 제거하진 않는다.
		System.out.println("=====================");
		System.out.println(str1);
		System.out.println(list);
		String str2 = (String)list.poll(); // queue에서 데이터를 꺼내온다. 큐가 비어있다면 null 반환.
		System.out.println("========****=========");
		System.out.println(str2);
		System.out.println(list);
		System.out.println("=======****==========");
		list.offer("a");
		System.out.println(list);
		String str3 = (String)list.remove();
		System.out.println(str3);
		System.out.println(list);
	}
}
