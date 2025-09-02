package ex07.argumentVariable;

public class MainEntry {
	
	public static void plus(int... x) {
		int sum = 0;
		for(int i = 0; i<x.length; i++) {
//			System.out.println(x[i] + " ");
			sum += x[i];
		}
		System.out.println("sum = " + sum); 
	}
	
	public static void main(String[] args) {
		
		plus(1,2);
		plus(1,2,3,4,5);
		plus(2);
		plus(1,2,3,4,5,6,7);
		plus("kbs", "mbc");
		plus("aa", "bb","c", "agweg", "5125215");
	}

	public static void plus(String...x) {
		String sum = null;
		for(int i = 0; i<x.length; i++) {
			sum +=x[i];
		}
		System.out.println("sum = " + sum);
	}
//	private static void plus(int i, int j, int k, int l, int m, int n, int o) {
//		
//	}
//
//	private static void plus(int i) {
//		
//	}
//
//	private static void plus(int i, int j, int k, int l, int m) {
//		
//	}
//
//	private static void plus(int i, int j) {
//		
//	}
}
