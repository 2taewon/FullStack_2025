package ex01.collection.set;

import java.util.HashSet;
import java.util.Set;

class Person { // extends Object {
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]\n";
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Person) { // 객체비교
			Person temp = (Person)obj;
			return name.equals(temp.name) && age == temp.age;
		}
		return false;
	}

//	@Override
//	public int hashCode() {
//		return name.hashCode() + age;
//	}
	
}

public class HashSetEx2 {
	public static void main(String[] args) {
		Set set = new HashSet(); // 중복허용 x, 자동 호출
		
		set.add(new Person("yuna", 36));
		set.add(new Person("David", 20));
		set.add(new Person("yuna", 37));
		set.add(new Person("yuna", 12));
		
		set.add(new String("happy"));
		set.add(new String("happy"));
		
		System.out.println(set);
		
//		Person p = new Person("tw",00);
//		System.out.println(p);
	}
}
