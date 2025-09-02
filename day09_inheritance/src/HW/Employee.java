// Employee
package HW;

import java.util.Scanner;

public class Employee {
	private int id; //사번
	private String name, position, number; // 이름, 부서, 번호
	
	public Employee() {
		id = 1;
		name = "tw";
		position = "it";
		number = "01024152656";
	}
	public Employee(int id, String name, String position, String number) {
		this.id = id;
		this.name = name;
		this.position = position;
		this.number = number;
	}
	public void disp() {
		System.out.print("사번 : " + id + " 이름 : " + name + " 부서 : "+ position + " \n번호 : " + number);
	}
	
	// get /set
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	
	
}
