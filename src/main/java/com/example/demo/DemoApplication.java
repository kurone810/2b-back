package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@RestController
@EnableJpaRepositories(basePackageClasses = AuthorRepository.class)
public class DemoApplication {

    @RequestMapping("/")
    public String home() {
        return "Hello World from Docker";
    }

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}

