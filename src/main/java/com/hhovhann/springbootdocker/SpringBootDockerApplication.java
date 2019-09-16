package com.hhovhann.springbootdocker;

import com.hhovhann.springbootdocker.domain.User;
import com.hhovhann.springbootdocker.repository.UsersRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.UUID;

@SpringBootApplication
public class SpringBootDockerApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringBootDockerApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(UsersRepository repository) {
		return args -> {
			repository.save(new User(UUID.randomUUID().toString(), "Hayk", "Hovhannisyan"));
			repository.save(new User(UUID.randomUUID().toString(), "Marco", "Vasapollo"));
			repository.save(new User(UUID.randomUUID().toString(), "Jack", "Bauer"));
			repository.save(new User(UUID.randomUUID().toString(), "Chloe", "O'Brian"));
			repository.save(new User(UUID.randomUUID().toString(), "Vardan", "Hovhannisyan"));
			repository.save(new User(UUID.randomUUID().toString(), "David", "Palmer"));
			repository.save(new User(UUID.randomUUID().toString(), "Michelle", "Dessler"));
			repository.save(new User(UUID.randomUUID().toString(), "Joh1n", "Doe"));
		};
	}
}