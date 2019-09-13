package com.hhovhann.springbootdocker;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringBootDockerApplication {

	@Value("${spring.application.name}")
	public String applicationName;

	@RequestMapping("/")
	public String home() {

		return "Hello : " + applicationName;
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDockerApplication.class, args);
	}
}
