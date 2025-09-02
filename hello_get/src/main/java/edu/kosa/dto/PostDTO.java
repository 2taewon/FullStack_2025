package edu.kosa.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/*
 * JSON 예시
 * {
 * 	"account" : "lee",
 * 	"email" : "kosa@kosa.ac.kr",
 * 	"address" : "서울 연희동",
 * 	"password" : "1004",
 * 	"phone_number" : "111-222-333",
 * 	"OPT" : "OPT"
 * }
 */

@Data
public class PostDTO {
	private String account;
	private String email;
	private String address;
	private String password;
	@JsonProperty("phone_number")
	private String phoneNumber; // CamelCase로 되어있는 것을 snake 형식으로 
	@JsonProperty("OPT")
	private String OPT; //카멜도 스네이크도 아닌 스타일 명명일 때 @JSONPROPERTY 사용해서 인식
}
