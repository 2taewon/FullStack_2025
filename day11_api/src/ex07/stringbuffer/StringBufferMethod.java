package ex07.stringbuffer;

public class StringBufferMethod {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("This");
		System.out.println(sb); // String 클래스나 wrapper는 주소 출력이 아닌 데이터를 출력함.

		sb.append(" is pencil"); // 문자열을 바로 붙여서 추가해줌. (끝에 추가)
		System.out.println(sb);

//		System.out.println(sb.reverse());
		System.out.println("----------");

		sb.insert(7, " my"); // 문자열을 원하는 자리에 추가해줌.
		System.out.println(sb);

		sb.replace(8, 10, "your"); // 문자열 변경(교체)
		System.out.println(sb);
		System.out.println(sb.capacity());
		System.out.println("================");
		System.out.println(sb.indexOf("your")); // 들어가있는 인덱스 번호를 출력
		System.out.println(sb.indexOf("s")); // 왼쪽부터 차례로 스캔하며 젤 첫번째 인덱스 번호 출력
		System.out.println(sb.lastIndexOf("s")); // 마지막 인덱스 번호 출력
		System.out.println("================");

		sb.delete(0, 5); // 원하는만큼 문자열을 지움
		System.out.println(sb);

		sb.setLength(5); // 문자열 길이 재조정해서 그 부분까지만 출력
		System.out.println(sb);
		System.out.println(sb.capacity()); // 삭제는 아니고 그대로 있음.

	}
}
