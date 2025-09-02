//MainEntry
package quiz_video;

import java.util.Scanner;

public class MainEntry {
	static VideoManage vm = new VideoManage();
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int select = 0;
		
		while(true) {
		System.out.println("[video Program]");
		System.out.println("번호를 선택해주세요.");
		System.out.println("1. 추가, 2. 삭제, 3.video list 출력, 4.list 수정 0. 프로그램 종료");
		select = sc.nextInt();
		
		switch(select) {
		case 0 : System.out.println("프로그램이 종료됩니다."); System.exit(0);
		case 1 : vm.add(); break;
		case 2 : vm.delete(); break;
		case 3 : vm.show(); break;
		case 4 : vm.edit(); break;
		default : System.out.println("다시 입력해주세요.");
			} //end switch
		} // end while
	
	}
}
