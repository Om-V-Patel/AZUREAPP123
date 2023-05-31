package com.example.Practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AzurePracticeApplication {
	@GetMapping ("/om")
	public String message1() {
		return "Congratulation OM patel your project is deploy on azure platfrom successfully...........................................";
	}
	@GetMapping ("/patel")
	public String message2() {
		return "Congratulation OM your project is deploy on azure platfrom successfully....";
	}
	public static void main(String[] args) {
		SpringApplication.run(AzurePracticeApplication.class, args);
	}

}
