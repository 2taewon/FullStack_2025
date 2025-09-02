package quiz;
// no,name,address,tel,field
// 생성자함수, setter/getter method
// ArrayList or Vector 이용해서 고객추가 / 삭제 / 고객 리스트 출력 / 수정(set)  
// 프로그램 종료 메뉴를 구성해서 출력하는 프로그램 작성.

import java.util.ArrayList;

// 
public class CustomerClass {
	protected int no;
	protected String name, address, tel;
	
	public CustomerClass() {
		no = 1;
		name = "tw";
		address = "seoul";
		tel = "01012345678";
	}
	public CustomerClass(int no, String name, String address, String tel) {
		this.no = no;
		this.name = name;
		this.address = address;
		this.tel = tel;
	}
	public void disp() {
		System.out.println("no : " + no + "name : " + name + "address : "+ address + "tel : " + tel);
	}
//	setter/getter 
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	
}
