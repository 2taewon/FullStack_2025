package edu.kosa.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.kosa.dto.PostRequestDTO;
/*
{	
	"name" : "tw"
	"age" : 33,
	"car_list" : [
			{
			"name" : "BMW",
			"carNumber" : "11라 3536"
			},
			{
			"name" : "BENZ",
			"carNumber" : "22가 2531"
			}
		]
	}
}
*/
@RestController
@RequestMapping("/api") //
public class PutApiController {
	
	@PutMapping("/put") // http://localhost:8080/api/put
	public PostRequestDTO put(@RequestBody PostRequestDTO dto) {
		System.out.println(dto);
		return dto;
	}
	
	@PutMapping("/put-id/{userId}") // http://localhost:8080/api/put-id/214
	public PostRequestDTO put(@RequestBody PostRequestDTO dto, @PathVariable(name = "userId") Long id) {
		System.out.println(id);
		return dto;
	}
}
