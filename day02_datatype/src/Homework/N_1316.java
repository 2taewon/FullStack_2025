package Homework;

import java.util.Scanner;

public class N_1316 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String str;
		int cnt = 0;
		int s_cnt = 0;
		int g_cnt = 0;
		int select = 0;
		while(select < N) {
			str = sc.next();
			if(str.length() == 1) {
				cnt++;
				select++;
				continue;
			}
			for(int i = 0; i<str.length(); i++) {
				for(int j = i+1; j<str.length(); j++) {
					if(str.charAt(i) == str.charAt(j)) {
						if(s_cnt == -1) {
							g_cnt = -1;
							break;
						}
					}
					else if(str.charAt(i) != str.charAt(j)) {
						s_cnt = -1;
					}
				}
				s_cnt = 0;
				if(g_cnt == -1) {
					break;
				}
			}
			if(g_cnt == 0) {
				cnt++;
			}
			g_cnt = 0;
			select++;
		}
		System.out.println(cnt);
	}
}
