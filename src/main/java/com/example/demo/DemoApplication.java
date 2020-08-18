package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		System.out.println("********Hollw word*********");
		SpringApplication.run(DemoApplication.class, args);
	}

}

@RestController
class HollwController{
	
	
	@GetMapping("/")
	public String test() {
		return "-----------------Hollw word--------------------";
	}
}