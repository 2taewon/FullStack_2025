package Quiz;

public class no2 {
	public static void main(String[] args) {
		String str = "ABC def kbsmbc 123 BB";
		int uppercnt = 0;
		int lowercnt = 0;
		char[] ch = str.toCharArray();
		for(int i = 0; i<str.length(); i++) {
			if(Character.isLowerCase(ch[i])) {
				lowercnt++;
			}
			else if(Character.isUpperCase(ch[i])) {
				uppercnt++;
			}
		}
		System.out.println(str + "의 \n대문자 개수는 : " + uppercnt +"개 "+ "소문자 개수는 : " + lowercnt + "개");
	}
}
