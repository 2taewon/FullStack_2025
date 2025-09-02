package ex03.collection.map;

import java.util.HashMap;
import java.util.Scanner;

// Map : key/value 한쌍으로 처리. (set + list)
public class MainEntry {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("kosa", "1234");
		map.put("sbs", "1111");
		map.put("kosa", "1234"); // 중복 인정 x
		System.out.println(map);
		System.out.println("요소 개수 :" +map.size());
		map.put("id", "password");
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("id 와 password를 입력하세요.");
			System.out.println("id : ");
			String id = sc.nextLine().trim();
			
			System.out.println("password : ");
			String pwd = sc.nextLine().trim();
			System.out.println();
			
			if(!map.containsKey(id)) {
				System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요.");
			continue;
		}	else {
			if(!(map.get(id)).equals(pwd)) {
				System.out.println("비밀번호가 일치하지않습니다. 다시 입력해주세요.");
			}
			else {
				System.out.println("id와 pwd가 일치합니다.");
				break;
			}
		}
		}
	}
}
