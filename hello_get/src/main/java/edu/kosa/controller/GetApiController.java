package edu.kosa.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import edu.kosa.HelloGetApplication;
import edu.kosa.dto.UserDTO;


@RestController
@RequestMapping("/api/get")
public class GetApiController {

    private final HelloGetApplication helloGetApplication;

    GetApiController(HelloGetApplication helloGetApplication) {
        this.helloGetApplication = helloGetApplication;
    }
	
	@RequestMapping(path = "/hello", method= RequestMethod.GET)
	public String getHello() {
		return "hello";
	}
	
	public String hi() {
		return "<font color = 'red'> hi~~</font>";
	}
	
	@GetMapping("/path-variable/{id}") // 경로에 대문자를 쓰지 않는다. 
	public String pathVariable(@PathVariable("id") String id) {
		System.out.println("PathVariable : " + id);
		return id;
	}
	
	//?key=value&key2=value2&key3=value3
	@GetMapping(path = "query-param")
	public String queryParam(@RequestParam Map<String, String> queryParam) {
		
		StringBuilder sb = new StringBuilder();
		queryParam.entrySet().forEach(entry->{
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
			sb.append(entry.getKey() + "=" + entry.getValue());
		});
		
		return sb.toString();
	}
	
	@GetMapping(path = "query-param2") //http://localhost:8080/api/get/query-param2?name=yuna&email=aa@kosa.or.kr&age=33
	public String queryParam( 
			@RequestParam String user,
			@RequestParam String email,
			@RequestParam String age) {
	
		System.out.println(user);
		System.out.println(email);
		System.out.println(age);
		
		return user + email + age;
	}
	
	//http://localhost:8080/api/get/query-param3?name=yuna&email=aa@kosa.or.kr&age=33
	@GetMapping(path = "query-param03")
	public String queryParam(UserDTO dto) { // 객체 타입으로 리턴할때는 @RequestParam 안쓴다. 권장하는 방식 
		System.out.println(dto.getName());
		System.out.println(dto.getEmail());
		System.out.println(dto.getAge());
		
		return dto.toString();
	}
	
}
