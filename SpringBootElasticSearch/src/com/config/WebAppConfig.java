package com.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableJpaRepositories(basePackages={"com.repository"})
@EntityScan(basePackages={"com.dao"})
@ComponentScan(basePackages="com.*")
public class WebAppConfig {
	public static void main(String[] args) {
		SpringApplication.run(WebAppConfig.class, args);
	}

}
