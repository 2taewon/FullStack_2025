package HW;

public class partTime extends Employee {
	private int day;
	public partTime() {
		
	}
	public partTime(int id, String name, String position, String number, int day) {
		super(id, name, position, number);
		this.day = day;
	}
	public void disp() {
		super.disp();
		System.out.println(" 일당 : " + day + "만원");
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	
}
