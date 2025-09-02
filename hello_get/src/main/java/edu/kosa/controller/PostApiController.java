package edu.kosa.controller;

import java.util.Map;

import edu.kosa.HelloGetApplication;
import edu.kosa.dto.PostDTO;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 * String : value 
 * number : value
 * boolean : value 
 * Object : value { }
 * array : value[]
 * 
 	{
 		"phone_number" : "010-9872-0202", // camelCase, PascalCase, snake_case
 		"age" : 10,
 		"isAgree" : false,
 		"account" : {
 			"email" : "tw@kosa.ac.kr",
 			"password" : "1234"
 		}
 	}
 	
 	--user 조회 하는 경우
 	{
 		"user_list" : [ 
 			{
 				"account" : "tw"
 				"password" : "1234"
 			},
 			{
 				"account" : "aa"
 				"password" : "5678"
 			},
 			{
 				"account" : "bb"
 				"password" : "1111"
 			}
 		] 
 	}
 */
@RestController
@RequestMapping("/api") // POST, http://localhost:8080/api
public class PostApiController {

    private final HelloGetApplication helloGetApplication;

    PostApiController(HelloGetApplication helloGetApplication) {
        this.helloGetApplication = helloGetApplication;
    }
	
	@PostMapping("/post")
	public void post(@RequestBody Map<String, Object> map) { // http://localhost:8080/api/post
		
		
//		map.entrySet().forEach(obj ->{
//			
//			System.out.println("key : " + obj.getKey());
//			System.out.println("value : " + obj.getValue());
//		});
		
		map.forEach((key, value)->{
			System.out.println("key : " + key);
			System.out.println("value : " + value);
		});
	}
	
	@PostMapping("/post-object") //http://localhost:8080/api/post-object
	public void postObject(@RequestBody PostDTO dto) {
		 System.out.println(dto);
	}
}
