package ex07.breakContinue;

public class MultiBreak {
 public static void main(String[] args) {
	 
	 boolean flag = true;
	 firust:{
		 second : {
			 third :{
				int k = 100;
				System.out.println("Before the break"); // 1
				
				if(flag) break second; //break 식별자; 식별자 위치까지 탈출
				System.out.println("This won't execute");
			 }// end third
			 System.out.println("msa 2기 파이팅"); // 3
			
		 }// end second
		 System.out.println("This is after second break"); // 4
		 
	 }// end firust
	 
	 System.out.println("124346"); // 5
 }
}
/*
	식별자 1 : {
		식별자 2 : {
		
			break 식별자 1;
		}
	} // 여기까지 빠져나감 
*/