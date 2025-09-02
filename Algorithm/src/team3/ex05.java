package team3;

public class ex05 {
	public static void main(String[] args) {
		int n = 78;
		System.out.println(solution(n));
	}
	
	    public static int solution(int n) {
	        int answer = 0;
	        int n_cnt = 0;
	        int next_cnt = 0;
	        for(int i = n;  ;i++){
	        String two_num = Integer.toBinaryString(i);
	            for(int j = 0; j < two_num.length(); j++){
	                if(two_num.charAt(j) == '1'){
	                    if(i == n){
	                        n_cnt++; continue;
	                    }
	                    next_cnt++;
	                }
	            }
	            if(n_cnt == next_cnt){
	                answer = i;
	                break;
	            }
	            next_cnt = 0;
	        }
	        return answer;
	    }
}
