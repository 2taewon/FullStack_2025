package ex02.datatype;

public class DataType2 {
	//모든 자료형은 자신의 범위(크기)를 안벗어남.
		public static void main(String[] args) {
			short sh = 3; //-32768 ~ 32767
			int num = 50000; // -21억 ~ 21억 
			
			//작은 자료형이 큰 자료형으로 들어갈 때, 자동형변환(묵시적형변환)된다.
			num = sh; //int(4byte) = short(2byte)
			
			System.out.println(sh + "," + num);
			
			//큰 자료형이 작은 자료형으로 들어갈 때, 명시적 형변환 필요.
			//데이터 손실 발생 
			sh = (short)num; //short(2byte) = int(4byte) 
		
			sh = (short)num; //명시적 형변환 int -> short 
			System.out.println(sh + "," + num);
		}
}




