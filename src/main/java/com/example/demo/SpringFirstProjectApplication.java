package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringFirstProjectApplication {

	public static void main(String[] args) {
		System.out.println("Start");
		SpringApplication.run(SpringFirstProjectApplication.class, args);
		System.out.println("End");
	}
	
	@GetMapping("/test")
	public ResponseEntity<String> getTest() {
		return ResponseEntity.ok("<h1>Hi this my first app.</h1>");

	}

}
