package com.example.qatar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class QatarApplication {

	public static void main(String[] args) {
		SpringApplication.run(QatarApplication.class, args);
	}

}
