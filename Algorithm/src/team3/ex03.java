package team3;

public class ex03 {
	public static void main(String[] args) {
		String s = "for the last week";
		System.out.println(solution(s)); 
	}
	
	    public static String solution(String s) {
	        char[] arr = s.toCharArray();
	        int Upper = 0;
	        int Lower = 0;
	            if(arr[0]>=97){
	                Upper = arr[0]- 32;
	                arr[0]= (char)Upper;
	            }
	        for(int i = 0; i <arr.length; i++){
	            if(i+1 < arr.length && arr[i] == ' ' && arr[i+1] != ' ' && arr[i+1] >= 97){
	                Upper = arr[i+1] - 32;
	                arr[i+1] = (char)Upper;
	            }
	            if(i > 0){
	                if(arr[i-1] != ' ' &&  65 <= arr[i] && arr[i]<= 97 ){
	                    Lower = arr[i] + 32;
	                    arr[i] = (char)Lower;
	                }
	            }
	        }
	        String answer = String.valueOf(arr);
	        return answer;
	    }
}
