package Homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class N_10828 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack st = new Stack();
		int N = Integer.parseInt(br.readLine());
		
		for(int i = 0; i<N; i++) {
			String str = br.readLine();
			if(str.length() >= 6) {
				String[] arr = str.split(" ");
				st.push(Integer.parseInt(arr[1]));
				continue;
			}
			
			switch(str) {
			case "pop" :
				if(st.isEmpty()) {
				System.out.println(-1); break;
				}
				st.pop(); break;
			case "size" :
				st.size();break;
			case "empty" :
				if(st.isEmpty()) {
					System.out.println(1);break;
				}
				else if(!st.isEmpty()) {
					System.out.println(0);break;
				}
			case "top" : 
				if(st.isEmpty()) {
					System.out.println(-1);break;
				}
				else {
				st.peek();break;
					}
				}
			}
		}
	}



/*
 * push X: 정수 X를 스택에 넣는 연산이다.
pop: 스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
size: 스택에 들어있는 정수의 개수를 출력한다.
empty: 스택이 비어있으면 1, 아니면 0을 출력한다.
top: 스택의 가장 위에 있는 정수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
 */
