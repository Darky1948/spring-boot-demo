package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages= {"com.example.*"})
@EnableJpaRepositories(basePackages= {"com.example.persistence"})
@EntityScan(basePackages= {"com.example.model"})
public class BookingDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookingDemoApplication.class, args);
	}

}
