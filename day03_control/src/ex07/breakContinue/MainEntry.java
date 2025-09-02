package ex07.breakContinue;

public class MainEntry {
 public static void main(String[] args) {
	
	 for(int i = 0; i<101; i++) {
		 
		 if(i % 2 == 0) continue;
			 System.out.print(i + "\t");
		 if(i % 2 != 0){
			 System.out.println(i);
		 }
	}
}
}
//*/
/*package ex07.breakContinue;

public class MainEntry {
 public static void main(String[] args) {
	
	 System.out.println("----continue----");
	for (int i = 0; i < 10 ; i++) {
		
		if(i == 7) continue; // 시작점으로 돌린다. for--->증감식으로, while/do~while 조건식으로 이동한다. 
		System.out.println("hello" + i);
	}
	System.out.println("----break----");
	for (int i = 0; i < 10 ; i++) {
		
		if(i == 7) break; // 구문 탈출 
		System.out.println("hello" + i);
	}
}
}
*/