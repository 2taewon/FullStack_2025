package edu.kosa.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DeleteApiController {
	
	@DeleteMapping("/delete/{userId}") // http://localhost:8080/api/delete/300?account=tw
	public void delete(@PathVariable String userId) {
		System.out.println(userId);
		
	}
	
	//delete --> 리소스 삭제 200 ok, 자원이 있어서 삭제하던, 없어서 삭제하던 200을 던짐.
}
