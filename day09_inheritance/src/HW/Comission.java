// Comission 
package HW;

import java.util.Scanner;

public class Comission extends Regular {
	private int cms;
	Scanner sc = new Scanner(System.in);
	
	public Comission() {
		
	}
	public Comission(int id, String name, String position, String number, int salary) {
        super(id, name, position, number, salary);
	}
	@Override
	public double Calc() {
		return super.Calc();
	}
	public void disp() {
		super.disp();
		System.out.println(" 커미션 : "+ Calc()+ "만원");
	}
	public int getCms() {
		return cms;
	}
	public void setCms(int cms) {
		this.cms = cms;
	}

	
}
