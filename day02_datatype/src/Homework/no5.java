package Homework;

import java.util.Arrays;
import java.util.Scanner;

public class no5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("입력받을 숫자를 입력하세요 : ");
		int N = sc.nextInt();	
		int cnt = 0;
		String[] str = new String[N];
		
		
		for(int i=0; i<N; i++) {
			System.out.println("str : ");
			str[i] = sc.next();
		}
		for(int j = 0; j <str[0].length(); j++) {
			
			for(int k = 0; k<N-1; k++) {
				if(str[k].charAt(k) != str[k+1].charAt(k)) {
					break;
					}
				}
			if(cnt == (N-1)){
				System.out.print(str[0].charAt(j));
			}
			else {
				System.out.print("?");
			}
		}
		
		//System.out.println(Arrays.toString(charArr));
//		for(int j = 0; j <charArr.length; j++) {
			
//		}
//		for(int i = 0; i< str.length; i++) {
//		System.out.println(str[i]);
//		
//		}
	}

}


//    char[] charArr = str.toCharArray();// char 배열 출력       
// 		System.out.println(Arrays.toString(charArr));   
