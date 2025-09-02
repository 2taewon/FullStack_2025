package com.example.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;

public class HomeRestController {
	
	@RequestMapping (value  = {"/"},params ="plain")
	public String homePlain() {
		return "Welcome spring";
	}
	
	@RequestMapping (value = "/", params = "plain")
	public String homeJson() {
		return "{\" msg:화이팅 \"}";
	}
}
