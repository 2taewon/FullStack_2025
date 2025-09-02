package ex04.quiz;

public class Sawoen {
	private String sabun, name, zikg, buseo ,number;
	private int gubyu;
	
	public Sawoen() {
		sabun = "01";
		name = "tw";
		zikg = "사원";
		buseo = "it";
		number = "010-1234-5678";
		gubyu = 200;
	}
	public Sawoen(String a, String b) {
		sabun = "02";
		name = "ltw";
		zikg = "대리";
		buseo = "it";
		number = "010-2345-6789";
		gubyu = 300;
	}
	public Sawoen(String a, String b, String c, String d) {
		sabun = "03";
		name = "twlee";
		zikg = "과장";
		buseo = "it";
		number = "010-3456-7890";
		gubyu = 500;
	}
	
	public String getSabun() {
		return sabun;
	}
	public void setSabun(String sabun) {
		this.sabun = sabun;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getZikg() {
		return zikg;
	}
	public void setZikg(String zikg) {
		this.zikg = zikg;
	}
	public String getBuseo() {
		return buseo;
	}
	public void setBuseo(String buseo) {
		this.buseo = buseo;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public int getGubyu() {
		return gubyu;
	}
	public void setGubyu(int gubyu) {
		this.gubyu = gubyu;
	}
	public void disp() {
		System.out.println("사번 : " + sabun + "이름 : " + name + "직급 : " + zikg + " \n부서 : "+ buseo + "급여 : "+ gubyu +"만원 "+ "연락처 : " + number );
		System.out.println("-----------------------------------------");
	}
}
