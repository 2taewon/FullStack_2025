//MainEntry
package quiz_BMI;

import java.io.IOException;
import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		HumanManage hm = new HumanManage();
		Scanner sc = new Scanner(System.in);
		int select = 0;
		while(true) {
		System.out.println("---BMI---");
		System.out.println("번호를 입력해주세요.");
		System.out.println("[0. 프로그램 종료 1. 추가, 2. 삭제, 3. 출력, 4. 수정]");
		System.out.println("[5. 신체정보 파일 저장, 6. 신체정보 파일 로드]");
		select = sc.nextInt();
		
		switch(select) {
		case 0 : System.out.println("시스템을 종료합니다."); System.exit(0);
		case 1 : hm.add();break;
		case 2 : hm.delete();break;
		case 3 : hm.print();break;
		case 4 : hm.edit();break;
		case 5 : hm.filesave();break;
		case 6 : hm.fileload();break;
			}// end switch
		}// end while
	}
}
