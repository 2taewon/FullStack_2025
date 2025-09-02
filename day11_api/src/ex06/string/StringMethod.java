package ex06.string;

public class StringMethod {
	public static void main(String[] args) {
		String s1 = "happytw";
		String s2 = "SEOUL";
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s2.replace("EO", "korea"));
		System.out.println(s2);
//		s2 = s2.replace("EO", "korea");
//		System.out.println(s2);
		
		s1 = s1 + s2;
		s1 = s1.concat(s2); //문자열 결합 
		System.out.println(s1);
		System.out.println("=============");
		
		String s3 = new String("     ab        cd      ");
		System.out.println(s3);
		System.out.println(s3.length());
		s3 = s3.trim(); //공백제거 단, 처음 공백과 끝 공백은 지울 수 있지만, 중간 공백은 지울 수 없다.
		System.out.println(s3.length());
		System.out.println("=============");
		
		String s4 = new String("ab/defg/41242/kewag/1t3g32");
		String[] s5 = s4.split("/"); // 문자열 쪼개기. 뒤에 빈칸이나 문자를 넣어 그것을 기준으로 분리 할 수 있음.
		for(int i = 0; i <s5.length; i++) {
			System.out.println("분리된" + i + "번 문자열 : " + s5[i]);
		}
		String s6 = "123-4567-8952";
		
		String s8 ="1241251sdgg 83552a 1141241dfs 012512 string";
		char ch = s8.charAt(7);
		System.out.println(ch);
		
		s8 = s8.substring(5, 7);
		System.out.println(s8);
		
		System.out.println("-----------------------");
		System.out.println("소문자로 출력 toLowerCase() :" + s2.toLowerCase());
		System.out.println("대문자로 출력 toUpperCase() :" + s1.toUpperCase());
		
		char[] ch2 = s1.toCharArray();
		for(int i = 0; i< ch2.length; i++) {
			System.out.print(ch2[i]+ "\t");
		}
	}
}
