package ex02.collection.list;

import java.util.Date;
import java.util.Enumeration;
import java.util.Vector;

public class VectorEx2 {
	public static void main(String[] args) {
	int i; 
	Date date = new Date();
	Vector v = new Vector(3,5); // 타입 parameter로 지정하지 않아도 됨. 대신 꺼낼 때 형 변환을 해야함.
	
	v.addElement("자바"); //String 
	v.addElement(new Double(10.2)); //double 
	v.addElement(date); // object
	
	System.out.println("-------------3개 객체 추가---------------");
	System.out.println("size : " + v.size() + ", capacity :" + v.capacity());
	
	for(i = 0; i<10; i++) {
		v.addElement(new Integer(i));
	}
	System.out.println("----------10개 객체 추가----------");
	System.out.println("size : " + v.size() + ", capacity : " + v.capacity());
	
	System.out.println("------------Vector 내용 출력 ---------");
	Enumeration enu = v.elements();
	
	while(enu.hasMoreElements()) {
		System.out.println(enu.nextElement() + " ");
	}
	
	System.out.println("-----객체 내용 포함 확인 --------");
	if(v.contains("자바")) System.out.println("자바 문자열 포함되어있음");
	else System.out.println("자바 미포함");
	
	
	System.out.println("10.2 객체 위치?" + v.indexOf(10.2));
	System.out.println("입력 시간 : " + date);
	System.out.println(v.get(v.indexOf(date))); // 둘이 같음
	System.out.println(v.get(2)); // 둘이 같음
	
	//date object delete 
	v.removeElementAt(v.indexOf(date));
	System.err.println("**********************");
	System.out.println("size : " + v.size() + ", capacity : " + v.capacity());
	System.out.println(v);
	
	for(i = 0; i<v.size(); i++) {
//		v.removeElementAt(i); //배열 안에서 데이터는 하나씩 사라지고 나면 그 자리를 왼쪽으로 한 칸씩 땡겨서 채우기 때문에 그 다음으로 넘어가면서 홀수개만 남게 되는 것.
		v.remove(i); // 인덱스 번호 
		v.remove(10.2); //해당 요소 이름 데이터삭제 
		v.remove("자바"); 
		v.removeAllElements();
	}
	System.err.println("**********************");
	System.out.println("size : " + v.size() + ", capacity : " + v.capacity());
	System.out.println(v);
	
	System.out.println("+++++++++++++++++++++++++++++++++");
	v.setElementAt("java", 2); // 3번째 위치에 java 문자열 추가 
	
	enu = v.elements();
	while(enu.hasMoreElements()) {
		System.out.println(enu.nextElement() + " ");
	}
	System.out.println();
	v.trimToSize();
	System.out.println("size : " + v.size() + ", capacity : " + v.capacity());
	
	v.setSize(2); //크기를 강제로 2로 조정 
	enu = v.elements();
	while(enu.hasMoreElements()) {
		System.out.println(enu.nextElement() + " ");
	}
	System.out.println();
	}
}
