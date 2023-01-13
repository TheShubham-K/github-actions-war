package com.codeinspring.githubactionswar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GithubActionsWarApplication {

	@GetMapping("/welcome")
	public String welcome() {
		return "Welcome to Code in Spring";
	}

	public static void main(String[] args) {
		SpringApplication.run(GithubActionsWarApplication.class, args);
	}

}
