package ex1.set;
import java.util.*;
class TreeSetEx1 {
	public static void main(String[] args) {
		TreeSet set = new TreeSet();
		String from = "a";
		String to	= "b";
		set.add("abc");
		set.add("alien");set.add("bat");
		set.add("car");set.add("Car");
		set.add("disc");set.add("dance");
		set.add("dZZZZ");set.add("dzzzz");
		set.add("elephant");set.add("elevator");
		set.add("fan");set.add("flower");
		System.out.println(set);
		System.out.println("range search : from " + from  +" to "+ to);
		System.out.println("result1 : " + set.subSet(from, to)); //대 > 소 순서로 나옴. 그 후에 from에 지정했던 알파벳부터 to에 지정한 알파벳까지 차례대로 나옴
		System.out.println("result2 : " + set.subSet(from, to + "zzz"));
	}
}