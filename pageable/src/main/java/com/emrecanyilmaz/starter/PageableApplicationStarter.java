package com.emrecanyilmaz.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.persistence.autoconfigure.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan(basePackages= {"com.emrecanyilmaz"})
@EntityScan(basePackages = {"com.emrecanyilmaz"})
@EnableJpaRepositories(basePackages={"com.emrecanyilmaz"})
@SpringBootApplication
public class PageableApplicationStarter {

	public static void main(String[] args) {
		SpringApplication.run(PageableApplicationStarter.class, args);
	}

}
