package ex07.stringbuffer;

public class MainEntry {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();

		System.out.println("length        /        capacity");
		System.out.println(sb.length()+"    /     "+sb.capacity());
		int len = sb.length();
		int size = sb.capacity();
		System.out.println(len+"    /     "+sb.capacity());
		
		sb.append("msa_th2");
		len = sb.length(); size = sb.capacity();
		System.out.println(len+"    /     "+sb.capacity());

		sb.append("happyvirus");
		len = sb.length(); size = sb.capacity();
		System.out.println(len+"    /     "+sb.capacity()); // 34가 나오는 이유는 java에서 char는 2byte라서 null도 포함해야하기 때문
		
		sb.append("18592185 wetw 한글 239432r");
		len = sb.length(); size = sb.capacity();
		System.out.println(len+"    /     "+sb.capacity()); // 다 담을 수 없을 때 x2배 +2를 한다.
		System.out.println(sb.hashCode());
		
		sb.trimToSize(); // 용량이 필요한 것 보다 클 경우 크기를 조절해줌
		System.out.println(len+"    /     "+sb.capacity());

		
	}
}
