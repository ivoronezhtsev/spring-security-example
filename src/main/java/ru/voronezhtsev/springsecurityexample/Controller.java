package ru.voronezhtsev.springsecurityexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Controller {

	@GetMapping("/")
	public String greeting() {
		return "Hello";
	}

	@GetMapping("/user")
	public String user() {
		return "User";
	}

	@GetMapping("/admin")
	public String admin() {
		return "Admin";
	}

	public static void main(String[] args) {
		SpringApplication.run(Controller.class, args);
	}

}
