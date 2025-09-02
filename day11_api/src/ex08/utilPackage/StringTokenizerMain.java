//package ex08.utilPackage;
//
//import java.util.StringTokenizer;
//
//public class StringTokenizerMain {
//	public static void main(String[] args) {
//		StringTokenizer token = new StringTokenizer("사과 = 10|초코렛=3|샴페인=1|", "|", true);
//	
//		while(token.hasMoreTokens()) { // 다음은 누구인지 
//			System.out.println(token.nextToken());
//			
//			String str = token.nextToken();
//			
//			if(str.equals("=")) System.out.println("\t");
//			else if(str.equals("|")) System.out.println(" ");
//			System.out.println(str);
//		}
//	}
//}

package ex08.utilPackage;

import java.util.StringTokenizer;

public class StringTokenizerMain {
	public static void main(String[] args) {
		StringTokenizer token = new StringTokenizer("김연아/ 박태환/ 손연재 /이휘 김지은 /박준 공현진");
	
		while(token.hasMoreTokens()) { // 디폴트 값은 공백 
			System.out.println(token.nextToken());
		}
		String str = "김연아/ 박태환/ 손연재 /이휘 김지은 /박준 공현진";
		String[] strarr = str.split("/");
		for(int i = 0; i<strarr.length; i++) {
			System.out.println(strarr[i]);
		}
	}
}
