package quiz;

public class Score {

	public static void main(String[] args) {
		// kor, eng, com, name --> tot, avg 구하는 프로그램 작성
		int kor = 90, eng = 88, com = 100, tot;
		String name = "tw";
		double avg = 0;
		
		tot = kor + eng + com;
		avg = tot / 3.;
		
		System.out.println(name + "님의 성적처리 *****");
		System.out.print("kor :" + kor +"\t eng :" + eng + " com :" +com + "\ntot :" + tot);
		System.out.printf(" avg :%.2f",avg);
		

	}

}
