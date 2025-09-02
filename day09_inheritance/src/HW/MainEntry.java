// Main.java
package HW;

import java.util.Scanner;

public class MainEntry {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		do {
		System.out.println("정규직은 1번, 계약직은 2번을 입력하세요.");
		n = sc.nextInt();
		}while(n<1 || n >2);
		
		System.out.print("사번 입력: ");
        int id = sc.nextInt();
        sc.nextLine(); // 개행 문자 제거

        System.out.print("이름 입력: ");
        String name = sc.nextLine();

        System.out.print("부서 입력: ");
        String position = sc.nextLine();

        System.out.print("번호 입력: ");
        String number = sc.nextLine();
        
        if(n == 2) {
        System.out.println("일한 시간 : ");
        int day = sc.nextInt();
				partTime pt = new partTime(id, name, position, number, day);
				pt.disp();
				System.exit(0);
        }
        
				System.out.print("급여 입력(만원): ");
        int salary = sc.nextInt();
        
        Comission c = new Comission(id, name, position, number, salary);
        c.disp();
	}
}
