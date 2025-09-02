package Homework;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.StringTokenizer;

public class N_7785 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		HashMap<String, String> map = new HashMap<String, String>();
		String A; 
		String B;
		int N = Integer.parseInt(br.readLine());
		for(int i = 0; i<N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			A = st.nextToken();
			B = st.nextToken();
			map.put(A, B);
			if(B.equals("leave")) {
				map.remove(A, B); 
			}
		}		
		ArrayList<String> list = new ArrayList<String>(map.keySet());
		Collections.sort(list, Collections.reverseOrder());
		for(String s : list) {
			System.out.println(s);			
			}
		}
	}


