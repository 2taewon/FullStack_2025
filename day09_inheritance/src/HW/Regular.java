//Regular
package HW;

public class Regular extends Employee {
	private int salary; //급여 
	
	public Regular() {
		salary = 200;
	}
	public Regular(int id, String name, String position, String number, int salary) {
        super(id, name, position, number);
        this.salary = salary;
    }
	public double Calc() {
		return salary*0.1;
	}
	public void disp() {
		super.disp();
		System.out.print(" 급여 : " + salary +"만원");
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
}
