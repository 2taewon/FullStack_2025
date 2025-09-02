package edu.kosa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloGetApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloGetApplication.class, args);
		System.out.println("Hello Boot");
	}

}
