package edu.kosa.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class CarDTO {
	private String name; // 차 이름
	
//	@JsonProperty("car_number")
	private String carNumber; //차 번호 
}
