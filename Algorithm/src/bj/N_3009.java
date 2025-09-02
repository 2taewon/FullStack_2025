package bj;

import java.util.ArrayList;

public class N_3009 {
	public static void main(String[] args) {
		String s = "110010110";
		System.out.println(solution(s));
	}
	public static int[] solution(String s) {
        
        ArrayList<Character> list = new ArrayList();
        int z_cnt = 0;
        int cnt = 0;
        while (!(s.length() == 1)){
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) == '0'){
                z_cnt++; continue;
                }
            list.add(s.charAt(i));
            }
	        s = Integer.toBinaryString(list.size());
            list.removeAll(list);
            cnt++;
        }
        
        int[] answer = new int[2];
        answer[0] = cnt;
        answer[1] = z_cnt;
        return answer;
    }
}
