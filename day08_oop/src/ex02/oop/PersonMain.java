package ex02.oop;

import java.util.Scanner;

class person {
	Scanner sc = new Scanner(System.in);
	String name;
	int old;
	String number;
	
	public String getName() {
		name = sc.next();
		
		return name;
	}
	public void setName(String x) {
		name = x;
		
	}
	public int getOld() {
		old = sc.nextInt();
		
		return old;
	}
	public void setOld(int x) {
		old = x;
	}
	public String getNumber() {
		number = sc.next();
		
		return number;
	}
	public void setNumber(String x) {
		number = x;
	}
	public void display() {
		System.out.println("name =" + name);
	}
}



public class PersonMain {
	public static void main(String[] args) {
		person person = new person();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("name = "); person.setName(sc.next());
	}
}
