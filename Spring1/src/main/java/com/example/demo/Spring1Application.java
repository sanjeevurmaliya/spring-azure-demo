package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Spring1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Spring1Application.class, args);
		Alien a = context.getBean(Alien.class);
		Alien a1 = context.getBean(Alien.class);
		a.show();
		a1.show();
		
	}
	
	@GetMapping("/rest/h1")
	public String hiSay()
	{
		return "Welcome to Azure";
	}

}
