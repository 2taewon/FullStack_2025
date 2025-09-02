package edu.kosa.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDTO {
	private String name,email;
	private int age;
	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		return "UserDTO [name=" + name + ", email=" + email + ", age=" + age + "]";
	}
	
}
