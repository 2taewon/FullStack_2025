package quiz;

import java.util.ArrayList;
import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList list = new ArrayList<>();
		int num;
		
		while(true) {
		System.out.println("1은 추가, 2는 삭제, 3은 리스트 출력, 4는 수정, 0은 종료입니다.");
		switch(num = sc.nextInt()) {
		case 0 : System.exit(0);
		case 1 : 
			System.out.println("no : "); int no = sc.nextInt();
			System.out.println("name : "); String name = sc.next();
			System.out.println("address : "); String address = sc.next();
			System.out.println("tel : "); String tel = sc.next();
			list.add(no); list.add(name); list.add(address); list.add(tel);
		case 2 : list.remove(list);
		case 3 : print(list);
		case 4 : 
			System.out.println("수정하실 번호를 선택해주세요. \n 1 : no, 2: name , 3 : address, 4 : tel");
			num = sc.nextInt();
			if(num == 1) {
			list.set(0, no=sc.nextInt());
			}
			else if(num == 2) {
				list.set(1, name=sc.next());
				}
			else if(num == 3) {
				list.set(2, address=sc.next());
				}
			else if(num == 4) {
				list.set(3, tel=sc.next());
				}
		}
	}		
			
	}
	public static void print(ArrayList list) {
		System.out.println("no : " + list.get(0));
		System.out.println("name : " + list.get(1));
		System.out.println("address : " + list.get(2));
		System.out.println("tel : " + list.get(3));
	}
}
