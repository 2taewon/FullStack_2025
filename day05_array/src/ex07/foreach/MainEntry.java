package ex07.foreach;

public class MainEntry {
	public static void main(String[] args) {
		int []a = {1,2,3,4,5, 100, 90, 95};
		for(int item : a) {
			System.out.println(item +"\t");
		}
		System.out.println("\n============");
		System.out.println("오름차순 출력");
		for(int i = 0; i<a.length; i++) {
			System.out.println(a[i] + "\t");
//			if(i ==3) break;
		}
	}	
}


/* 
	확장(개선된)for문
	for(자료형 변수명): 컬렉설명, 배열명{
		반복구문;
		
	}
	
	------------------
	for(초기값;조건;증감식){
		반복구문;
	
*/