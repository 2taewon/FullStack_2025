// Human

package quiz_BMI;

import java.io.Serializable;

public class Human implements Serializable  {
	private static int ncnt = 1;
	private int no;
	private String name;
	private String gender;
	private double height;
	private double weight;	
	private double BMI;
	
	public Human() { }
	public Human(String name, String gender, double height, double weight) { 
		this.no = ncnt++;
		this.name = name;
		this.gender = gender;
		this.height = height;
		this.weight = weight;
	}
	
	public double BMI() {
		return BMI = weight/((height / 100)*(height / 100));
	}
	@Override
	public String toString() {
		return "no."+no+"\t이름 : "+ name + "\t성별 : "+ gender + "\t 키 : " + height + "\t몸무게 : " + weight + " \tBMI 지수 : " + BMI();
	}
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
}
